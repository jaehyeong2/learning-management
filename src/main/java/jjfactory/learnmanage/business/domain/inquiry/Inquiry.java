package jjfactory.learnmanage.business.domain.inquiry;


import jjfactory.learnmanage.business.domain.BaseTimeEntity;
import jjfactory.learnmanage.business.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Inquiry extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String content;
    private String title;
}
