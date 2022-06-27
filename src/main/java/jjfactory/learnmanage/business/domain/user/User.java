package jjfactory.learnmanage.business.domain.user;

import jjfactory.learnmanage.business.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User extends BaseTimeEntity {
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

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<Role> roles;

}
