package JAVA.Project_1.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Worker
{
    @Id
    @GeneratedValue
    Long Id;
    String Name;
    String Email;
    String Address;
    int DOB;
    int PhNo;
}
