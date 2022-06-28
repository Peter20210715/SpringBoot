package springboot.learn.leecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description:  this part is using for record you do some things in leecode website.
 * @author wangzhm02
 * @date 2022-05-25 08:30
 */
@SpringBootApplication
@EnableScheduling
public class LeecodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeecodeApplication.class, args);
    }

}
