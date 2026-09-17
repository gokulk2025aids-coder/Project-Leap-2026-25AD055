package JAVA.Project_1.Services;

import JAVA.Project_1.Models.Student;
import JAVA.Project_1.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices
{
    @Autowired
    private StudentRepository studentrepository;

    public Student createstudent (Student  data)
    {
        Student result =  studentrepository.save(data);
        return result;
    }

    public List<Student> getallstudent ()
    {
        return  studentrepository.findAll();
    }

    public Student updatestudent (Student data)
    {
        return studentrepository.save(data);
    }

    public Student getbyid(Long Id)
    {
        return studentrepository.findById(Id).orElseThrow(()-> new RuntimeException("Todo not found"));
    }

    public void deletestudent(long id)
    {
        if (!studentrepository.existsById(id))
        {
            throw new RuntimeException("Student not found");
        }
        studentrepository.deleteById(id);
    }
}