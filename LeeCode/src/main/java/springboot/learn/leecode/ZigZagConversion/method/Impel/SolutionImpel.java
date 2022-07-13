package springboot.learn.leecode.ZigZagConversion.method.Impel;

import springboot.learn.leecode.ZigZagConversion.method.Solution;

import java.util.ArrayList;

/**
 * <p>Title: SolutionImpel$</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class SolutionImpel implements Solution {

    /**
     * 从这个题可以总结出 题解：
     * 1.寻找周期，确定各种变量
     * 2.具体问题具体解决方法
     * @param s , numRows:    s为原始字符串，numRows为
     * @return
     */

    @Override
    public String convert(String s, int numRows) {
        /**
         * Z 字形：二维数组
         * 1.确当周期 t：numRows+numRows-2
         * 2.周期个数： s.length / t
         */
        Integer t = numRows+numRows-2;
        int c = sup(s.length()/t.doubleValue())*(numRows - 1);
        Character[][] temp = new Character[numRows][c];

        System.out.println(temp.length);
        int flag,length,j ,k;
        k = 0;
        j = 0;
        flag = 0;
        length = s.length();
        // 特殊情况；
        if(length <= numRows || numRows == 1){
            return s;
        }
        if(numRows == 2){
            String result1,result2;
            result1 = result2 ="";
            int w,z,m;
            w = 0;
            z = 1;
            m = s.length();
            while(z <m){
                result1 +=s.charAt(w);
                result2 +=s.charAt(z);
                w +=2;
                z +=2;
            }
            if(w < m){
                result1 +=s.charAt(w);
            }

            return result1+result2;

        }
        for(int i=0; i < length; i++){
            Character ch = s.charAt(i);
            if(flag == 0){
                if(j == numRows -1){
                    temp[j][k] = ch;
                    flag = 1;
                }else {
                    temp[j++][k] = ch;
                }
            }else {
                k++;
                if((j - 1) == 1){
                    temp[--j][k] = ch;
                    flag = 0;
                    k++;
                    --j;
                }else {
                    temp[--j][k] = ch;
                }
            }
        }
        String result = "";
        int i;
        for(i = 0; i < numRows;i++){
            for(j = 0; j < c ; j++){
                if(temp[i][j] != null){
                    result += temp[i][j];
                }
            }

        }
        return result;
    }

    public int sup(Double orginal){
        int result;
        Integer temp = orginal.intValue();
        if((orginal - temp) == 0){
            result = temp;
        }else {
            result = temp + 1;
        }
        return result;
    }


    public String test(String s,int numRows){
        String result = "";
        int length = s.length();
        if(length < numRows || numRows<2){
            return s;
        }
        for(int j=0;j<numRows;j++){
            for(int i=j;i<s.length();i=i+2*numRows-2){
                result +=s.charAt(i);
                if(j!=0&&j!=numRows-1&&i+2*(numRows-1-j)<s.length()){
                    result +=(s.charAt(i+2*(numRows-1-j)));
                }
            }
        }
        return result;
    }
}
