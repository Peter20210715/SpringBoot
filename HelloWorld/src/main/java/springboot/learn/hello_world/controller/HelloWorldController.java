package springboot.learn.hello_world.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: this java class is used for test hello world in springboot structure
 * @author: peter.Wang
 * @date: 2022年05月23日 13:38
 */
//@RestController  等价:@Controller + @ResponseBody

@RestController

@ComponentScan(basePackages = {"springboot.learn.hello_world.controller"})//扫描注解controller，可以添加多个包地址，
@RequestMapping("/hello")
@Slf4j
public class HelloWorldController {

    @ApiOperation(value = "通过id获取用户")
    @GetMapping("/wtf")
    public String hello(){
        log.info("你已经成功访问该方法：congratulations！");
        return "hello world";
    }
}
