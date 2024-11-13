import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T= Integer.parseInt(sc.nextLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String[] input = sc.nextLine().split(" ");
			int sum = 0;
            for (String num : input) {
            	
                int i = Integer.parseInt(num);
                
                if (i%2 == 1) sum += i;
            }
            
            System.out.println("#" + test_case + " " + sum);
		}
        
        sc.close();
	}
}