import java.util.*;
import java.io.*;

public class Main {
	
	static int result = 0;
	static Map<String, Boolean> map = new HashMap<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		map.put("ChongChong", true);
		
		for (int i = 0; i < N; i++) {
			
			String[] x = br.readLine().split(" ");
			
			if (map.containsKey(x[0])) {
				if (map.get(x[0])) {
					map.put(x[1], true);
					continue;
				}
			}
			
			if (map.containsKey(x[1])) {
				if (map.get(x[1])) {
					map.put(x[0], true);
				}
			}
		}
		
		result = map.size();
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
