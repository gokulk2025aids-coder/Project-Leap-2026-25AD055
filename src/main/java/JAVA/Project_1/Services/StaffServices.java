package JAVA.Project_1.Services;
import JAVA.Project_1.Models.Staff;
import JAVA.Project_1.Models.Student;
import JAVA.Project_1.Repository.StaffRepository;
import JAVA.Project_1.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServices
{
    @Autowired
    private StaffRepository staffrepository;

    public Staff createstaff (Staff  data)
    {
        Staff result =  staffrepository.save(data);
        return result;
    }

    public List<Staff> getallstaff ()
    {
        return  staffrepository.findAll();
    }

    public Staff updatestaff (Staff data)
    {
        return staffrepository.save(data);
    }

    public Staff getbyid(Long Id)
    {
        return staffrepository.findById(Id).orElseThrow(()-> new RuntimeException("Todo not found"));
    }

    public void deletestaff(long id)
    {
        if (!staffrepository.existsById(id))
        {
            throw new RuntimeException("Staff not found");
        }
        staffrepository.deleteById(id);
    }
}
