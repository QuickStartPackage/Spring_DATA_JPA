package io.github.choduk.app.repository;

import io.github.choduk.app.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author choduk88@gmail.com
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
