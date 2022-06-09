package tn.iteam.demojap.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return Arrays.asList(
                new Student(
                        1L,
                        "Hassen",
                        "hassen.lazrag@gmail.com",
                        LocalDate.of(1975, Month.NOVEMBER, 02),
                        47
                )
        );
    }
}
