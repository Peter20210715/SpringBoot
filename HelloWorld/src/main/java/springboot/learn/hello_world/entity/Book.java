package springboot.learn.hello_world.entity;

/**
 * @Description: TODO
 * @author: peter.Wang
 * @date: 2022年06月21日 10:01
 */

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件里面的属性映射到Book的每一个属性里面去
 *我们使用@ConfigurationProperties来实现,而prefix的值就是指定
 * 了与配置文件当中的哪一个(在这里就是值Book)进行映射，但是这个注解要想生效就必须
 * 要使得Book组件为容器里面的组件，那么我们需要加上@Component
 */

@Component
@Data
@ToString
public class Book {

    /**
     *     采用  配置文件中 配置值
     */
    @Value("${book.name}")
    String name;
    /**
     * 采用本处指定得  数值
     */
    @Value("2022/6/21")
    Date time;
    /**
     *  采用特殊表达式
     */
    @Value("#{12*3.14}")
    Double price;
    Map<String,String> map;
    List<String> list;
    Math math;

}
