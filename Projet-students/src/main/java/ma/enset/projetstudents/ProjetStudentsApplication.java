package ma.enset.projetstudents;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class ProjetStudentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetStudentsApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository,PayementRepository payementRepository){
        return  args -> {
            studentRepository.save(Student.builder().id(UUID.randomUUID().toString()).code("112233").firstName("Mohammed").programId("GLSID").build());
            studentRepository.save(Student.builder().id(UUID.randomUUID().toString()).code("112234").firstName("Hasna").programId("GLSID").build());
            studentRepository.save(Student.builder().id(UUID.randomUUID().toString()).code("112235").firstName("Asma").programId("GLSID").build());
        PayementType

    };
}
