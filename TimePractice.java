import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class TimePractice{
    public static void main(String[] args) {
        
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(dateTime);
        System.out.println(date+"---"+time);

        LocalDate dateSame = dateTime.toLocalDate();
        LocalTime timeSame = dateTime.toLocalTime();
        System.out.println(dateSame+"---"+timeSame);

        System.out.println("通过指定的日期和时间创建LocalDateTime--------------------------------");
        LocalDate dateOf = LocalDate.of(2020, 01, 22);
        LocalTime timeOf = LocalTime.of(10, 15, 30);
        LocalDateTime dateTimeOf = LocalDateTime.of(2020, 01, 22, 10, 15, 30);
        LocalDateTime dateTimeOf2 = LocalDateTime.of(dateOf,timeOf);
        System.out.println(dateOf);
        System.out.println(timeOf);
        System.out.println(dateTimeOf);
        System.out.println(dateTimeOf2);

        System.out.println("自定义格式化生成和解析-----------------------------------------------");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
        LocalDateTime ldt = LocalDateTime.parse("2020/01/22 11:05:30", dtf);
        System.out.println(ldt);

        System.out.println("LocalDateTime的with()方法--------------------------------------------");
        // 本月第一天0:00时刻:
        LocalDateTime firstDay = LocalDate.now().withDayOfMonth(1).atStartOfDay();
        System.out.println(firstDay);

        // 本月最后1天:
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDay);

        // 下月第1天:
        LocalDate nextMonthFirstDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(nextMonthFirstDay);

        // 本月第1个周一:
        LocalDate firstWeekday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstWeekday);
    }
}