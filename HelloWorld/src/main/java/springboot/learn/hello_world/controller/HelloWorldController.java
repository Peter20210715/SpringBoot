package springboot.learn.hello_world.controller;


import com.sun.tracing.dtrace.Attributes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description: this java class is used for test hello world in springboot structure
 * @author: peter.Wang
 * @date: 2022年05月23日 13:38
 */
//@RestController  等价:@Controller + @ResponseBody

@RestController
//    普通@Controller 默认方法的返回用来做页面跳转的
//@Controller
@ComponentScan(basePackages = {"springboot.learn.hello_world.controller"})//扫描注解controller，可以添加多个包地址，

//@RequestMapping("/hello")
@Slf4j
public class HelloWorldController {

    @ApiOperation(value = "通过id获取用户")
    @GetMapping("/wtf")
    public String hello(HttpServletRequest request){
        request.setAttribute("msg","success");
        log.info("你已经成功访问该方法：congratulations！");
        return "forward:/user";
    }

    @ResponseBody
    @GetMapping("/user")
    public String getUser(@RequestAttribute("msg") String msg){
        return "GET Peter!";
    }
    @PostMapping("/user")
    public String saveUser(){
        return "POST Peter!";
    }
    @PutMapping("/user")
    public String putUser(){
        return "PUT Peter!";
    }
    @DeleteMapping("/user")
    public String deleteUser(){
        return "DELETE Peter!";
    }
}
