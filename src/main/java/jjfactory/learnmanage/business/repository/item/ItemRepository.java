package jjfactory.learnmanage.business.repository.item;

import jjfactory.learnmanage.business.domain.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
