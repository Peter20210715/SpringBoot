package springboot.learn.redis.util;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @Description: TODO
 * @author: peter.Wang
 * @date: 2022年06月21日 11:31
 */
public class ConnectTest {
    @Test
    public void test(){
        //1.获取Jedis连接
        Jedis jedis = new Jedis("localhost", 6379);
        //2.操作
        jedis.set("name","jack");
        jedis.set("time","2022/6/21");
        //3.关闭连接
        jedis.close();
    }

}
