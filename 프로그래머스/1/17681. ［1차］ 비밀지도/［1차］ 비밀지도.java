class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
       for (int i = 0; i < arr1.length; i++) {

         result[i] = String.format("%"+n+"s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
       }

       for (int i = 0; i < arr2.length; i++) {
         String[] one = result[i].split("");
         String[] two = String.format("%"+n+"s", Integer.toBinaryString(arr2[i])).replace(' ', '0').split("");
         StringBuilder sb = new StringBuilder();
         for (int j = 0; j < n; j++) {
           if (two[j].equals("1")) {
             sb.append("#");
           } else if (one[j].equals("1")) {
             sb.append("#");
           } else {
             sb.append(" ");
           }
         }
         result[i] = sb.toString();
       }

       return result;
    }
}