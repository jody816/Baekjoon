import java.util.*;

class Solution {
    
    static Queue<Integer> bri = new LinkedList<>();
    static int contain = 0;
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        for(int t : truck_weights) {
			
            while(true) {
                //큐가 비어있다면 다음 트럭 삽입
                //큐가 비어있지 않을 때
                //큐의 사이즈와 다리의 길이가 같다면 큐에서 큐에서 처음 값을 빼고 무게 합 -
                //다음 트럭이 최대 무게 초과
                //다음 트럭이 최대 무게 이내

                if (bri.isEmpty()) {
                    bri.offer(t);
                    contain += t;
                    answer++;
                    break;
                } else {
                    if (bri.size() == bridge_length) {
                        contain -= bri.poll();
                    } else if (contain + t > weight) {
                        bri.offer(0);
                        answer++;
                    } else if (contain + t <= weight) {
                        bri.offer(t);
                        answer++;
                        contain += t;
                        break;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}