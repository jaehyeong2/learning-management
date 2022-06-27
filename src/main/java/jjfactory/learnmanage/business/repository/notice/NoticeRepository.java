package jjfactory.learnmanage.business.repository.notice;

import jjfactory.learnmanage.business.domain.notice.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice,Long> {
}
