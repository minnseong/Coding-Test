class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        int[][] dp = new int[n+1][m+1];
        
        dp[1][1] = 1;
        
        for (int i = 1 ; i < n+1 ; i++) {
            for (int j = 1 ; j < m+1 ; j++) {
                
                if (i == 1 && j == 1) {
                    continue;
                }
                
                dp[i][j] += (dp[i][j-1] + dp[i-1][j]);
                dp[i][j] %= 1000000007;
                
                for (int[] puddle : puddles) {
                    if (puddle[0] == j && puddle[1] == i) {
                        dp[i][j] = 0;
                        break;
                    }
                }
            }
        }
        
        return dp[n][m];
    }
}
