class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            int onTimeCount = 0;
            int day = startday;

            for (int j = 0; j < 7; j++) {
                
                if (day == 6 || day == 7) {
                    day = day % 7 + 1;
                    continue;
                }

                if (isOnTimeWithGrace(schedules[i], timelogs[i][j], 10)) {
                    onTimeCount++;
                }

                day = day % 7 + 1;
            }

            if (onTimeCount == 5) {
                answer++;
            }
        }
        return answer;
    }

    static boolean isOnTimeWithGrace(int schedule, int arrive, int grace) {
        int sh = schedule / 100, sm = schedule % 100;
        int ah = arrive   / 100, am = arrive   % 100;

        int deadline = sh * 60 + sm + grace;
        int actual   = ah * 60 + am;

        return deadline >= actual;
    }
}
