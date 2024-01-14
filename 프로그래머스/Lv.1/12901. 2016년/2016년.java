import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
    DayOfWeek dayOfWeek = date.getDayOfWeek();
    String result = dayOfWeek.getDisplayName(
        TextStyle.SHORT,
        Locale.US
    );
    return result.toUpperCase();
    }
}