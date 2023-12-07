class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;

        O: for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++)
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break O;
                }
        }
        
        for (String route : routes) {
            String[] r = route.split(" ");

            try {
                boolean h = true;

                switch (r[0]) {

                    case "N":
                        for (int k = 1; k <= Integer.parseInt(r[1]); k++) {
                            if (park[x - k].charAt(y) == 'X') {
                                h = false;
                                break;
                            }
                        }

                        if (h)
                            x -= Integer.parseInt(r[1]);
                        break;

                    case "S":
                        for (int k = 1; k <= Integer.parseInt(r[1]); k++) {
                            if (park[x + k].charAt(y) == 'X') {
                                h = false;
                                break;
                            }
                        }

                        if (h)
                            x += Integer.parseInt(r[1]);
                        break;

                    case "W":
                        for (int k = 1; k <= Integer.parseInt(r[1]); k++) {
                            if (park[x].charAt(y - k) == 'X') {
                                h = false;
                                break;
                            }
                        }

                        if (h)
                            y -= Integer.parseInt(r[1]);
                        break;

                    case "E":
                        for (int k = 1; k <= Integer.parseInt(r[1]); k++) {
                            if (park[x].charAt(y + k) == 'X') {
                                h = false;
                                break;
                            }
                        }

                        if (h)
                            y += Integer.parseInt(r[1]);
                        break;
                }
            } catch (Exception ignored) {}
        }

        return new int[]{x, y};
    }
}