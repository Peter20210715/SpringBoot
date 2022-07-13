package springboot.learn.leecode.Combinations.method.Impel;

import springboot.learn.leecode.Combinations.method.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionImpel implements Solution {

    /**
     * Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
     *
     * You may return the answer in any order.
     *
     *  
     *
     * Example 1:
     *
     * Input: n = 4, k = 2
     * Output:
     * [
     *   [2,4],
     *   [3,4],
     *   [2,3],
     *   [1,2],
     *   [1,3],
     *   [1,4],
     * ]
     * Example 2:
     *
     * Input: n = 1, k = 1
     * Output: [[1]]
     *  
     *
     * Constraints:
     *
     * 1 <= n <= 20
     * 1 <= k <= n
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/combinations
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    @Override
    public List<List<Integer>> combine(int n, int k) {
        if(n < k){
            return result;
        }
        traceBack(n,k,0,1);
        return result;
    }
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public void traceBack(int n,int k,int length,int count){
        if(length == k){
            List<Integer> temp = new ArrayList<>();
            for(Integer integer:path){
                temp.add(integer);
            }
            result.add(temp);
            return;
        }
        for(;count <= n;count++ ){
            path.add(count);
            length++;
            traceBack(n,k,length,count+1);
            length--;
            path.remove(path.size() - 1);
        }
    }
}
