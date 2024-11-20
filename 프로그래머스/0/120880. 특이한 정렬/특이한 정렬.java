import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // 절대값 차이에 따라 정렬
        return Arrays.stream(numlist)
                .boxed() // int 배열을 Integer 스트림으로 변환
                .sorted((a, b) -> {
                    int diffA = Math.abs(a - n);
                    int diffB = Math.abs(b - n);
                    
                    // 절대값 차이가 같으면 큰 값을 우선
                    if (diffA == diffB) {
                        return b - a;
                    }
                    
                    return diffA - diffB; // 절대값 차이에 따라 정렬
                })
                .mapToInt(i -> i) // 다시 int 배열로 변환
                .toArray();
    }
}
