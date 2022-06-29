package jjfactory.learnmanage.business.dto;

import jjfactory.learnmanage.business.domain.student.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StudentDto {
    private String username;
    private String nickname;
    private String password;
    private String birth;
    private int age;
    private int gamePoint;
    private String email;
    private Gender gender;
}
