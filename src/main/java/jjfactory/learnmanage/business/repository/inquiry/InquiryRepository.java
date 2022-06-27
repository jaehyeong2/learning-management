package jjfactory.learnmanage.business.repository.inquiry;

import jjfactory.learnmanage.business.domain.inquiry.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<Inquiry,Long> {
}
