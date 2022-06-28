package springboot.learn.leecode.TimeTask.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;




/**
 * @author wangzhm02
 * @Component
 * 该注解标志着，把该类托管于spring，不可省略；
 * @date 2022-05-26 16:33
 */

@Component
@Slf4j
public class SpringBootScheduled {


    // 添加定时任务
    // cron表达式：每周一 23:40:30 执行

    /**
     * corn表达式不支持同时指定日期：日与星期值     一般使用英文?  代替其中一个
     *  ‘*’   代表任意一天
     *  ‘？’    代表某一天
     *  MON、TUE、WED、THU、FRI、SAT、SUN
     */
    @Scheduled(cron = "00 30 17 30 5 ? ")
    public void doTask1(){
        log.info("***************************这里测试springboot里的定时任务，从此处开始：");
        log.info("springboot框架中定时任务涉及三个基本注解：@EnableScheduling 放在spring框架的启动类上，@Component及@Scheduled应用于具体的定时任务类上");
        System.out.println("这是第一个定时任务~");
    }
    @Scheduled(cron = "00 30 17 30 5 ? ")
    public void doTask2(){
        log.info("spring框架中针对多个任务的形式，继续添加@Scheduled 注解即可");
        System.out.println("这是第二个定时任务~");
        log.info("***************************这里测试springboot里的定时任务，从此处结束：");
    }

}
