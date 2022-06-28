package springboot.learn.redis.entity;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @Description: TODO
 * @author: peter.Wang
 * @date: 2022年06月21日 11:35
 */
public class RedisString {
    /**
     * string类型的演示
     */
    @Test
    public void test() throws InterruptedException {
        //默认配置为:"localhost", 6379
        Jedis jedis = new Jedis();
        //1.set,get,del方法
        System.out.println("1.set,get,del方法演示:");
        jedis.set("name","tom");
        String name = jedis.get("name");
        System.out.println(name);
        jedis.del("name");
        name = jedis.get("name");
        System.out.println(name);
        //2.setex()方法,下面表示设置password:123，该键值对存活时间是2秒
        System.out.println("2.setex()方法演示");
        jedis.setex("password",2,"123");
        String password  = jedis.get("password");
        System.out.println(password);
        Thread.sleep(3000);
        password  = jedis.get("password");
        System.out.println(password);
        //3.关闭连接
        jedis.close();
    }
}
