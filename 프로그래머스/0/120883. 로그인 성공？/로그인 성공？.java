class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        String result = "";
        
        for (String[] inf : db) {
            
            if (inf[0].equals(id_pw[0]) && inf[1].equals(id_pw[1])) {
                return "login";
            } else if (inf[0].equals(id_pw[0])) {
                result = "wrong pw";
            } else {
                
                if (!result.equals("")) {
                    continue;
                }
                
                result = "fail";
            }
        }
        
        return result;
    }
}