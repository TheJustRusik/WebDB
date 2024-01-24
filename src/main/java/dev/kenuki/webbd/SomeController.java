package dev.kenuki.webbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class SomeController {
    private final JobsRepository jobsRepository;
    @Autowired
    public SomeController(JobsRepository jobsRepository){
        this.jobsRepository = jobsRepository;
    }
    @GetMapping("/rofres")
    public List<Test_Table> getAllData(){
        return jobsRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:5173", methods = RequestMethod.POST)
    @PostMapping("/rofres")
    public List<Test_Table> postData(@RequestBody List<Test_Table> newDataList){
        System.out.println("I want push to database this data:\n" + Arrays.toString(newDataList.toArray()));
        return jobsRepository.saveAll(newDataList);
    }
}
