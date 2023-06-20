class Solution {
    public boolean isInteger(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    
    public String solution(String s) {
        String answer = "";
        
        s += " 3";

        String[] array = s.split(" ");

        for (int i = 0; i < array.length; i++)
        {
            if (isInteger(array[i])) {

            } else if (array[i].equals("")){
                    answer += (array[i] + " ");
                } else {
                    String plus = array[i].trim();

                    if (plus.substring(1).matches(".*[0-9].*")) {

                    } else {
                        answer += String.valueOf(plus.charAt(0)).toUpperCase();
                        for (int j = 1; j < plus.length(); j++) {
                            answer += String.valueOf(plus.charAt(j)).toLowerCase();
                        }

                        answer += " ";
                    }
                }
            }

        return answer.substring(0, answer.length()-1);
    }
}