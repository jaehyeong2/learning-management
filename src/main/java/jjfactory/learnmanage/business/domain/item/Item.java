package jjfactory.learnmanage.business.domain.item;


import jjfactory.learnmanage.business.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Item extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private ItemType itemType;

    private String name;
    private int price;

    @Column(length = 20)
    private String type;

    private Boolean isView;
}
