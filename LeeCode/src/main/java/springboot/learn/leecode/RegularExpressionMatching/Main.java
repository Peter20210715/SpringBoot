package springboot.learn.leecode.RegularExpressionMatching;

import springboot.learn.leecode.RegularExpressionMatching.entity.Car;
import springboot.learn.leecode.RegularExpressionMatching.method.Impel.SolutionImpel;

/**
 * <p>Title: Main$</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class Main {
    /**
     * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
     *
     * '.' Matches any single character.​​​​
     * '*' Matches zero or more of the preceding element.
     * The matching should cover the entire input string (not partial).
     *
     *  
     *
     * Example 1:
     *
     * Input: s = "aa", p = "a"
     * Output: false
     * Explanation: "a" does not match the entire string "aa".
     * Example 2:
     *
     * Input: s = "aa", p = "a*"
     * Output: true
     * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
     * Example 3:
     *
     * Input: s = "ab", p = ".*"
     * Output: true
     * Explanation: ".*" means "zero or more (*) of any character (.)".
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/regular-expression-matching
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        String s ="";
        String p = "";
        Boolean flag = s.matches(p);
        System.out.println(flag);
//        String test="dadasfarfeasfesd";
//        System.out.println(test.matches(p));
//        SolutionImpel solutionImpel = new SolutionImpel();
//        System.out.println(solutionImpel.isMatch(s,p));
//
//        /**
//         * 验证对象实例赋值验证：赋值原理
//         * 空间赋值
//         */
//        Car car = new Car();
//        Car car1 = new Car("red","10m","5m");
//
//        car.setColor(car1.getColor());
//        car.setHeight(car1.getHeight());
//        car.setWidth(car1.getWidth());
//        car1.setColor("green");
//        System.out.println("method one!");
//        System.out.println("Car: " + car);
//        System.out.println("Car1: " + car1);
//        System.out.println("CarHashCode: " + car.hashCode());
//        System.out.println("Car1HashCode: " + car1.hashCode());
//        /**
//         * 验证对象实例赋值验证：赋值原理
//         * 值赋值
//         */
//        Car car2 ;
//        car2 = car1;
//        System.out.println("method two!");
//        System.out.println("Car1: " + car1);
//        System.out.println("Car2: " + car2);
//        System.out.println("Car1: " + car1.hashCode());
//        System.out.println("Car2: " + car2.hashCode());
//
//        /**
//         * 验证值赋值功能
//         */
//        car1.setColor("black");
//        System.out.println("Car2: " + car2);
        SolutionImpel solutionImpel = new SolutionImpel();
        System.out.println(solutionImpel.isMatch(s,p));
    }
}
