import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split(" ");
        
        converse_ten(array[0], Integer.parseInt(array[1]));
    }
    static void converse_ten(String number, int N){
        char[] nums = number.toCharArray();
        int ans = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] >= 'A'){
                ans = ans * N + (nums[i] - 'A' + 10);
            } else {
                ans = ans * N + (nums[i] - '0');
            }
        }
        System.out.println(ans);
    }
}