package JAVA.Project_1.Controller;

import JAVA.Project_1.Models.Staff;
import JAVA.Project_1.Models.Student;
import JAVA.Project_1.Services.StaffServices;
import JAVA.Project_1.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController
{
        @Autowired
        private StaffServices staffservices;

        @PostMapping("/create")
        ResponseEntity<Staff> createstaff(@RequestBody Staff body)
        {
            return new ResponseEntity<>(staffservices.createstaff(body), HttpStatus.CREATED);
        }

        @GetMapping("/getall")
        ResponseEntity <List<Staff>> getall()
        {
            return new ResponseEntity<>(staffservices.getallstaff(), HttpStatus.OK);
        }

        @PutMapping("/update")
        ResponseEntity <Staff> updatestaff(@RequestBody Staff data)
        {
            return new ResponseEntity<>(staffservices.updatestaff(data), HttpStatus.ACCEPTED);
        }

        @GetMapping("getbyid/{id}")
        ResponseEntity<?> getbyId(@PathVariable long id)
        {
            try
            {
                Staff response = staffservices.getbyid(id);
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
            catch (RuntimeException exception)
            {
                return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
            }
        }
    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deletestaff(@PathVariable long id)
    {
        try
        {
            staffservices.deletestaff(id);
            return new ResponseEntity<>("Staff deleted successfully", HttpStatus.OK);
        }
        catch (RuntimeException exception)
        {
            return new ResponseEntity<>("Staff not found", HttpStatus.NOT_FOUND);
        }
    }
    }