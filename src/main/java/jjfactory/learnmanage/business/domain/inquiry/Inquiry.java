package jjfactory.learnmanage.business.domain.inquiry;


import jjfactory.learnmanage.business.domain.BaseTimeEntity;
import jjfactory.learnmanage.business.domain.student.Student;
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
    private Student student;

    private String content;
    private String title;
}
