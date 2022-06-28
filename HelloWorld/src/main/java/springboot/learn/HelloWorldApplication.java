package springboot.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springboot.learn.hello_world.entity.Book;

/**
 * @author wangzhm02
 */
@SpringBootApplication
public class HelloWorldApplication {


    public static void main(String[] args) {
        ApplicationContext test = SpringApplication.run(HelloWorldApplication.class, args);

    }

}
