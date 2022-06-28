package springboot.learn.leecode.TimeTask.util;

import lombok.extern.slf4j.Slf4j;
import lombok.var;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description: TODO
 * @author: peter.Wang
 * @date: 2022年05月25日 16:50
 */
@Slf4j
public class TimerClass {

public static void timerFunction(){
    log.info("Timer是JAVA自带的定时任务类");
    log.info("使用Timer的优缺点：\n 优点是使用简单，缺点是当添加并执行多个任务时，前面任务的执行用时和异常将影响到后面任务");
    TimerTask timerTask1 = new TimerTask() {
        @Override
        public void run() {
            System.out.println("第一个任务，打印当前时间：" + new Date());
        }
    };
    TimerTask timerTask2 = new TimerTask() {
        @Override
        public void run() {
            try{
                var temp = 1/0;
                log.info("the result is {}",temp);
            }catch (Exception e){
                log.error(e.toString());
            }
            System.out.println("第二个任务，打印一句话：you  are wonderful!" );
        }
    };
    // 计时器
    Timer timer = new java.util.Timer();
    // 开始执行任务 (延迟1000毫秒执行，每3000毫秒执行一次)
    /**
     *
     * 可以通过控制delay值 ，控制多个任务的执行流程不变
     */
    timer.schedule(timerTask2, 10, 3000);
    timer.schedule(timerTask1, 1000, 3000);

}

}
