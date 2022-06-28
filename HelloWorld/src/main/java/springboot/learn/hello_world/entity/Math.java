package springboot.learn.hello_world.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @author: peter.Wang
 * @date: 2022年06月21日 10:07
 */
@Component
@ConfigurationProperties(prefix = "math")
public class Math{
    String teacherName;
    Integer nums;
    @Override
    public String toString() {
        return "Math{" +
                "teacherName='" + teacherName + '\'' +
                ", nums=" + nums +
                '}';
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }
}
