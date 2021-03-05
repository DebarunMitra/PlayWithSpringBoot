package studentsEntry.studententry.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import studentsEntry.studententry.models.Students;

public interface StudentRepository extends JpaRepository<Students, Long> {
    
    // @Query("SELECT s FROM s WHERE s.email = ?1") 
    Optional<Students>findStudentByEmail(String email);
}
