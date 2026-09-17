package JAVA.Project_1.Repository;

import JAVA.Project_1.Models.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerReopsitory extends JpaRepository<Worker, Long> {
}
