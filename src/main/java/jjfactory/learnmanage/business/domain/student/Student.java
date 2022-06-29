package jjfactory.learnmanage.business.domain.student;

import jjfactory.learnmanage.business.domain.BaseTimeEntity;
import jjfactory.learnmanage.business.dto.StudentDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Student extends BaseTimeEntity {
    @Id @GeneratedValue
    private Long id;

    @Comment("유저 아이디")
    private String username;
    @Comment("닉네임")
    private String nickname;
    private String password;
    private String birth;

    private int age;
    private int gamePoint;

    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Boolean activeStatus;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<Role> roles;

    @Builder
    public Student(String username, String nickname, String password, String birth, int age, int gamePoint, String email, Gender gender, List<Role> roles,Boolean activeStatus) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.birth = birth;
        this.age = age;
        this.gamePoint = gamePoint;
        this.email = email;
        this.gender = gender;
        this.roles = roles;
        this.activeStatus = activeStatus;
    }

    public static Student create(StudentDto dto,String password){
        return builder()
                .age(dto.getAge())
                .birth(dto.getBirth())
                .email(dto.getEmail())
                .gamePoint(dto.getGamePoint())
                .nickname(dto.getNickname())
                .username(dto.getUsername())
                .gender(dto.getGender())
                .activeStatus(true)
                .build();
    }

    public void resign() {
        this.activeStatus = false;
    }

    public void changeNickname(String nickname) {
        this.nickname = nickname;
    }
}
