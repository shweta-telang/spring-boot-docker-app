package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("in.ashokit")  // 🔥 Add this line!
public class SbRestAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SbRestAppApplication.class, args);
    }
}
