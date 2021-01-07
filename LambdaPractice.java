import java.util.Arrays;

public class LambdaPractice {
    public static void main(String[] args) {
        String[] array = new String[]{"banana", "apple", "pear", "lemon"};
        Arrays.sort(array, (s1, s2) -> {
            return s1.compareTo(s2);
        });
        System.out.println(Arrays.toString(array));
    }
}
