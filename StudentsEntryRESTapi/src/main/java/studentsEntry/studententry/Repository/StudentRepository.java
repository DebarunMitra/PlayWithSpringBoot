package studentsEntry.studententry.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import studentsEntry.studententry.models.Students;

public interface StudentRepository extends JpaRepository<Students, Long> {
    
}
