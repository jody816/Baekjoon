class Solution {
    public String solution(String phone_number) {
        int x = phone_number.length() - 4;

        return "*".repeat(Math.max(0, x))
            + phone_number.substring(x);
    }
}