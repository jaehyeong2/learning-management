package jjfactory.learnmanage.business.domain.notice;

import jjfactory.learnmanage.business.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Notice extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;
}
