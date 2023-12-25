class Solution {
    public boolean solution(int x) {
        String[] a = String.valueOf(x).split("");
        int sum = 0;
        for (String s : a)
            sum += Integer.parseInt(s);

        return x % sum == 0;
    }
}