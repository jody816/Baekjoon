import java.util.*;
import java.io.*;

class Solution
{
    static class Trade {
        int num;
        int count;
        
        Trade(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }
    
    static int n;
    static int k;
    static int result;
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        
		for(int i = 1; i <= t; i++)
		{
            String[] x = br.readLine().split(" ");
            
            n = Integer.parseInt(x[0]);
            k = Integer.parseInt(x[1]);
            
            result = 0;
            
            bfs();
            bw.write("#" + i + " " + String.valueOf(result) + "\n");
		}
        
        bw.flush();
        bw.close();
	}
    
    static private void bfs() {
        
        Queue<Trade> q = new LinkedList<>();
        boolean[][] visit = new boolean[1000000][k+1];
        
        q.offer(new Trade(n, 0));
        visit[n][0] = true;
        
        while (!q.isEmpty()) {
            
            Trade trade = q.poll();
            
            if (trade.count == k) {
                result = Math.max(result, trade.num);
                continue;
            }
            
            int length = String.valueOf(trade.num).length();
            
            for (int j = 0; j < length-1; j++) {
                for (int r = j+1; r < length; r++) {
                    int check = swap(trade.num, j, r);
                    
                    if (!visit[check][trade.count+1]) {
                    	q.offer(new Trade(check, trade.count+1));
                        visit[check][trade.count+1] = true;
                    }
                }
            }
        }
    }
    
    static private int swap(int num, int j, int r) {
    	char[] numArr = String.valueOf(num).toCharArray();
        
        char temp;
        temp = numArr[j];
        numArr[j] = numArr[r];
        numArr[r] = temp;
        
        return Integer.parseInt(new String(numArr));
    }
}