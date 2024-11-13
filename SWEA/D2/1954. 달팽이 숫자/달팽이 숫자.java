import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine().trim());
        
        for (int i = 0; i < n; i++) {
            
            int x = Integer.parseInt(br.readLine().trim());
            
            int[][] arr = new int[x][x];
            
            int value = 1;
            int row = 0, col = 0;
            int dir = 0;
            
            while (value <= x*x) {
                
                arr[row][col] = value++;
                
                if (dir == 0) {
                    if (col == x-1 || arr[row][col+1] != 0) {
                        dir = 1;
                        row++;
                    } else {
                        col++;
                    }
                    
                } else if (dir == 1) {
                    if (row == x-1 || arr[row+1][col] != 0) {
                        dir = 2;
                        col--;
                    } else {
                        row++;
                    }
                    
                } else if (dir == 2) {
                    if (col == 0 || arr[row][col-1] != 0) {
                        dir = 3;
                        row--;
                    } else {
                        col--;
                    }
                    
                } else {
                    if (arr[row-1][col] != 0) {
                        dir = 0;
                        col++;
                    } else {
                        row--;
                    }
                }
            }
            
            bw.write("#" + (i+1) + "\n");
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < x; k++) {
                    bw.write(String.valueOf(arr[j][k]) + " ");
                }
                bw.write("\n");
            }
        }
        
        bw.flush();
        bw.close();
	}
}