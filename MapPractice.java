import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", "nice");
        map.put("banana", "delicious");

        MapAPIPractice mAP = new MapAPIPractice();
        mAP.traverseMap(map);

    }
}

final class MapAPIPractice{
    void traverseMap(Map<String,?> map){
        for (Map.Entry<String,?> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
