package jjfactory.learnmanage.business.domain.npc;

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
public class Npc extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int locationX;
    private int locationY;

    private Boolean isView;
}
