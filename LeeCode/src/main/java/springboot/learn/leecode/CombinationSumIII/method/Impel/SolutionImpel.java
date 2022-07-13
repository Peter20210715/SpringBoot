package springboot.learn.leecode.CombinationSumIII.method.Impel;

import springboot.learn.leecode.CombinationSumIII.method.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionImpel implements Solution {
    /**
     * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：
     *
     * 只使用数字1到9
     * 每个数字 最多使用一次 
     * 返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: k = 3, n = 7
     * 输出: [[1,2,4]]
     * 解释:
     * 1 + 2 + 4 = 7
     * 没有其他符合的组合了。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/combination-sum-iii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param k
     * @param n
     * @return
     */
    @Override
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(n < 1){
            return  result;
        }
        if(n ==1 && k!=1){
            return  result;

        }


        traceBack(n,k,0,1);
        return  result;
    }

    /**
     * 因为本题允许重复树枝；故暂时不需要传入起始点
     * @param nums
     * @param k
     * @param sum
     */
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public void traceBack(int n,int k ,int sum,int count){

        if(sum == n){
            List<Integer> temp_real = new ArrayList<>();
            for(Integer integer:temp){
                temp_real.add(integer);
            }
            result.add(temp_real);
            return;
        }
        if(sum > n){
            return;
        }

        for(int i=count;i<10 && sum < n &&count <=k;i++){
            sum +=i;
            count = i+1;
            temp.add(i);
            traceBack(n,k,sum,count);
            count --;
            sum -=i;
            temp.remove(temp.size() - 1);
        }
    }
}
