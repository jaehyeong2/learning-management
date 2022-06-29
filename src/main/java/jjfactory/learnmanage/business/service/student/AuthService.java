package jjfactory.learnmanage.business.service.student;

import jjfactory.learnmanage.business.domain.student.Student;
import jjfactory.learnmanage.business.dto.LoginDto;
import jjfactory.learnmanage.business.dto.StudentDto;
import jjfactory.learnmanage.business.dto.TokenAndUsernameRes;
import jjfactory.learnmanage.business.repository.student.StudentRepository;
import jjfactory.learnmanage.global.handler.ex.BusinessException;
import jjfactory.learnmanage.global.handler.ex.ErrorCode;
import jjfactory.learnmanage.global.handler.provider.TokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class AuthService {
    private final StudentRepository studentRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenProvider tokenProvider;

    public String signUp(StudentDto dto){
        usernameDuplicateCheck(dto);
        String rawPassword = dto.getPassword();
        String encPassword = passwordEncoder.encode(rawPassword);

        Student student = Student.create(dto,encPassword);
        studentRepository.save(student);
        return "Y";
    }

    private void usernameDuplicateCheck(StudentDto dto) {
        if(studentRepository.findByUsername(dto.getUsername()) != null){
            throw new BusinessException(ErrorCode.DUPLICATE_LOGIN_ID);
        }
    }

    public TokenAndUsernameRes login(LoginDto dto){
        Student student = studentRepository.findByUsername(dto.getUsername());
        matchPassword(dto.getPassword(),student.getPassword());
        String token = createToken(student);
        return new TokenAndUsernameRes(dto.getUsername(),token);
    }


    public void matchPassword(String reqPassword,String userPassword){
        boolean result = passwordEncoder.matches(reqPassword,userPassword);
        if(!result){
            throw new BusinessException(ErrorCode.NOT_MATCH_PASSWORD);
        }
    }

    public String createToken(Student student){
        return tokenProvider.createToken(student.getUsername(),student.getRoles());
    }
}
