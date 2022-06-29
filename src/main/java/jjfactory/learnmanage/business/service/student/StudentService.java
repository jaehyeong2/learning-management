package jjfactory.learnmanage.business.service.student;

import jjfactory.learnmanage.business.domain.student.Student;
import jjfactory.learnmanage.business.dto.StudentDto;
import jjfactory.learnmanage.business.dto.StudentUpdateDto;
import jjfactory.learnmanage.business.repository.student.StudentRepository;
import jjfactory.learnmanage.global.handler.ex.BusinessException;
import jjfactory.learnmanage.global.handler.ex.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final PasswordEncoder passwordEncoder;

    public String delete(String username){
        Student student = studentRepository.findByUsername(username);
        student.resign();
        return "Y";
    }

    public String changeNickname(StudentUpdateDto dto){
        Student student = studentRepository.findById(dto.getStudentId()).orElseThrow( () ->{
            throw new BusinessException(ErrorCode.NOT_FOUND_USER);
        });
        student.changeNickname(dto.getUsername());
        return "Y";
    }
}
