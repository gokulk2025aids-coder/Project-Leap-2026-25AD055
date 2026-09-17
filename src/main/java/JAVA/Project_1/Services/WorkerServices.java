package JAVA.Project_1.Services;
import JAVA.Project_1.Models.Worker;
import JAVA.Project_1.Repository.StaffRepository;
import JAVA.Project_1.Repository.WorkerReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServices
{
    @Autowired
    private WorkerReopsitory workerReopsitory;

    public Worker createworker (Worker data)
    {
        Worker result =  workerReopsitory.save(data);
        return result;
    }

    public List<Worker> getallworker ()
    {
        return  workerReopsitory.findAll();
    }

    public Worker updateworker (Worker data)
    {
        return workerReopsitory.save(data);
    }

    public Worker getbyid(Long Id)
    {
        return workerReopsitory.findById(Id).orElseThrow(()-> new RuntimeException("Todo not found"));
    }

    public void deleteworker(long id)
    {
        if (!workerReopsitory.existsById(id))
        {
            throw new RuntimeException("Worker not found");
        }
        workerReopsitory.deleteById(id);
    }
}
