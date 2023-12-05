import java.util.ArrayList;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        ArrayList<int[]> attack = new ArrayList<>();
        for(int i = 0; i < attacks.length; i++) {
            int[] a = new int[2];
            a[0] = attacks[i][0];
            a[1] = attacks[i][1];
            
            attack.add(a);
        }
        
        int fixH = health;
        int attackCheck = 0;
        int time = 1;
        
        for (int i = 1; i <= attack.get(attack.size()-1)[0]; i++) {

            if (attack.get(attackCheck)[0] == i) {
                health -= attack.get(attackCheck++)[1];
                time = 1;
                if (health <= 0) {
                    health = -1;
                    break;
                }
            } else {
                if (time >= bandage[0]) {
                    health += (bandage[1] + bandage[2]);
                    time = 1;
                } else {
                    health += bandage[1];
                    time++;
                }
                
                if (health >= fixH)
                    health = fixH;
            }
        }
        
        return health;
    }
}