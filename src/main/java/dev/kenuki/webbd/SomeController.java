package dev.kenuki.webbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
