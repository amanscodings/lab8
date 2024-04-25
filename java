public class Solution {
   public int coinChange(int[] coins, int amount) {
       int[] dp = new int[amount + 1];
       Arrays.fill(dp, amount + 1);
       dp[0] = 0;
       
       for (int coin : coins) {
           for (int i = coin; i <= amount; i++) {
               dp[i] = Math.min(dp[i], dp[i - coin] + 1);
           }
       }
       
       return dp[amount] > amount ? -1 : dp[amount];
   }
   public static void main(String[] args) {
       Solution solution = new Solution();
       System.out.println(solution.coinChange(new int[]{1, 2, 5}, 11));  
       System.out.println(solution.coinChange(new int[]{2}, 3));         
       System.out.println(solution.coinChange(new int[]{1}, 0));     
   }
}
