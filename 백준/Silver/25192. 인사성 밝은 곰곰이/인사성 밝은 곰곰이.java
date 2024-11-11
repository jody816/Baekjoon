import java.util.*;
import java.io.*;

public class Main {
	
	static int result = 0;
	static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			
			String input = br.readLine();
			
			if (input.equals("ENTER")) {
				result += refreshSet();
				continue;
			}
			
			set.add(input);
		}
		
		result += refreshSet();
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
	
	static private int refreshSet() {
		int count = set.size();
		set.clear();
		return count;
	}
}
