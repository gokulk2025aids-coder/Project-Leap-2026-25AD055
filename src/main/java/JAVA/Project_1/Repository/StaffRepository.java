package JAVA.Project_1.Repository;

import JAVA.Project_1.Models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
