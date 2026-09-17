package JAVA.Project_1.Controller;
import JAVA.Project_1.Models.Worker;
import JAVA.Project_1.Services.StaffServices;
import JAVA.Project_1.Services.WorkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/worker")
public class WorkerController
{
    @Autowired
    private WorkerServices workerServices;

    @PostMapping("/create")
    ResponseEntity<Worker> createworker(@RequestBody Worker body)
    {
        return new ResponseEntity<>(workerServices.createworker(body), HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    ResponseEntity <List<Worker>> getall()
    {
        return new ResponseEntity<>(workerServices.getallworker(), HttpStatus.OK);
    }

    @PutMapping("/update")
    ResponseEntity <Worker> updateworker(@RequestBody Worker data)
    {
        return new ResponseEntity<>(workerServices.updateworker(data), HttpStatus.ACCEPTED);
    }

    @GetMapping("getbyid/{id}")
    ResponseEntity<?> getbyId(@PathVariable long id)
    {
        try
        {
            Worker response = workerServices.getbyid(id);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        catch (RuntimeException exception)
        {
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deleteworker(@PathVariable long id)
    {
        try
        {
            workerServices.deleteworker(id);
            return new ResponseEntity<>("Worker deleted successfully", HttpStatus.OK);
        }
        catch (RuntimeException exception)
        {
            return new ResponseEntity<>("Worker not found", HttpStatus.NOT_FOUND);
        }
    }
}