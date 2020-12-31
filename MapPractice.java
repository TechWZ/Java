import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", "nice");
        map.put("banana", "delicious");

        MapAPIPractice mAP = new MapAPIPractice();
        mAP.traverseMap(map);
        mAP.EnumMapPractice();
        mAP.SortedMapPractice();

    }
}

final class MapAPIPractice{
    void traverseMap(Map<String,?> map){
        for (Map.Entry<String,?> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }

    void EnumMapPractice() {
        Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "星期一");
        map.put(DayOfWeek.TUESDAY, "星期二");
        map.put(DayOfWeek.WEDNESDAY, "星期三");
        map.put(DayOfWeek.THURSDAY, "星期四");
        map.put(DayOfWeek.FRIDAY, "星期五");
        map.put(DayOfWeek.SATURDAY, "星期六");
        map.put(DayOfWeek.SUNDAY, "星期日");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
    }

    void SortedMapPractice() {//SortedMap接口保证对key的顺序进行默认排序
        Map<String,Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

}
