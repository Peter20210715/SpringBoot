package springboot.learn.hello_world.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.learn.hello_world.entity.Book;

/**
 * @Description: TODO
 * @author: peter.Wang
 * @date: 2022年06月21日 10:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootquickApplicationTests {

    @Autowired
    Book book;
    @Test
    public void contextLoads() {
        System.out.println(book);
    }
}
