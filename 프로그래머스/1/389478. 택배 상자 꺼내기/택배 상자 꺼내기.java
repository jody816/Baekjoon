class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int h = n/w;
        if (n%w > 0) h++;
        
        boolean flag = true;
        int count = 1;
        int findH = 0, findW = 0;
        
        int[][] arr = new int[h][w];
        O: for (int i = h-1; i >= 0; i--) {            
            for (int j = 0; j < w; j++) {
                if (count > n) break O;
                
                if (flag) {
                    if (count == num) {
                        findH = i;
                        findW = j;
                    }
                    arr[i][j] = count++;
                    
                } else {
                    if (count == num) {
                        findH = i;
                        findW = w-(j+1);
                    }
                    arr[i][w-(j+1)] = count++;
                }
            }
            flag = !flag;
        }
        
        if (arr[0][findW] > 0) answer++;
        answer += findH;
        
        return answer;
    }
}