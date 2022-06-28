package springboot.learn.leecode.TimeTask.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO
 * @author: peter.Wang
 * @date: 2022年05月26日 15:18
 */
@Data
@Slf4j
public class ScheduledExecutorServiceClass {
    /**
     * 引入ScheduledExecutorServiceClass  原因：
     * Timer不支持多线程。全部挂在Timer下的任务都是单线程的，任务仅仅能串行运行。
     * 假设当中一个任务运行时间过长。会影响到其它任务的运行，然后就可能会有各种接踵而来的问题
     */




    /**
     *
     * ScheduledExecutorService 为Java中提供的第二种实现定时任务的机制，据说可以解决Timer中前面任务的执行时间与异常影响后面任务的情况
     * 具体的函数参见如下网址；ScheduledExecutorService的各种函数
     * https://blog.csdn.net/fly910905/article/details/81542655
     */
   public void scheduledExecutorServiceFunction(){

       log.info("比如对于scheduleAtFixedRate方法，当我们要执行的任务大于我们指定的执行间隔时会怎么样呢？\n" +
               "\n" +
               "对于中文API中的注释，我们可能会被忽悠，认为无论怎么样，它都会按照我们指定的间隔进行执行，\n其实当执行任务的时间大于我们指定的间隔时间时，它并不会在指定间隔时开辟一个新的线程并发执行这个任务。而是等待该线程执行完毕。");
       // 创建任务队列   2 为线程数量
       ScheduledExecutorService scheduledExecutorService =
               Executors.newScheduledThreadPool(2);
       // 执行任务
       // 1s 后开始执行，每 3s 执行一次,TimeUnit.SECONDS前两个参数的时间单位
       scheduledExecutorService.scheduleAtFixedRate(() -> {
           try{
               int temp = 1/0;
               log.info("the result is {}",temp);
           }catch (ArithmeticException e){
               log.error(e.toString());
           }
           System.out.println("第一个任务，打印当前时间：" + new Date());
       }, 1, 3, TimeUnit.SECONDS);
       scheduledExecutorService.scheduleAtFixedRate(() ->{
           System.out.println("第二个任务，打印一个句话：you are wonderful!");
       },1,3,TimeUnit.SECONDS);
   }
}
