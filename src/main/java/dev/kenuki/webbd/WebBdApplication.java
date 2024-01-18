package dev.kenuki.webbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class WebBdApplication implements CommandLineRunner {
    @Autowired
    private JobsRepository jobsRepository;

    public static void main(String[] args) {
        SpringApplication.run(WebBdApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        List<Jobs> jobsEntities = jobsRepository.findAll();
        for (Jobs job : jobsEntities){
            System.out.println(job.getJob_id() + " " + job.getJob_title() + " " + job.getMin_salary() + " " + job.getMax_salary());
        }

    }

}
