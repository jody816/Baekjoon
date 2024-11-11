import java.util.*;
import java.io.*;

public class Main {
	
	static Map<String, Integer> map = new LinkedHashMap<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] x = br.readLine().split(" ");
		
		int n = Integer.parseInt(x[0]);
		int m = Integer.parseInt(x[1]);
		
		for (int i = 0; i < n; i++) {
			
			String input = br.readLine();
			
			if (input.length() < m) continue;
			
			map.put(input, map.getOrDefault(input, 0) + 1);
		}
		
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		
		entries.sort(Map.Entry.comparingByKey());
		
		entries.sort(Map.Entry.comparingByKey((o1, o2) -> {
			return o2.length() - o1.length();
		}));
		
		entries.sort(Map.Entry.comparingByValue((o1, o2) -> {
			return o2 - o1;
		}));
		
		for (Map.Entry<String, Integer> entry : entries) {
			bw.write(entry.getKey() + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
