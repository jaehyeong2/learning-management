package jjfactory.learnmanage.business.repository.student;

import jjfactory.learnmanage.business.domain.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByUsername(String username);
}
