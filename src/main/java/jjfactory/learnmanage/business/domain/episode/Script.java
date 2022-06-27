package jjfactory.learnmanage.business.domain.episode;

import jjfactory.learnmanage.business.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Script extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Episode episode;

    @Enumerated(EnumType.STRING)
    private ScriptStatus status;

}
