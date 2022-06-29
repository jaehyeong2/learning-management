package jjfactory.learnmanage.business.dto;

import jjfactory.learnmanage.business.domain.student.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StudentUpdateDto {
    private Long studentId;
    private String username;
    private String nickname;
    private String password;
    private String birth;
    private int age;
    private int gamePoint;
    private String email;
    private Gender gender;
}
