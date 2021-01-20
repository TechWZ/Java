import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsPractice {
    public static void main(String[] args) {
        
        Integer[] array = new Integer[10];
        for(int i=0; i<10; i++){
            array[i] = i;
        }

        shufflePractice(array);

    }

    static void shufflePractice(Integer[] array){

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        list.toString();
        System.out.println(list.toString());

        Collections.shuffle(list);
        System.out.println(list.toString());
        for (Integer integer : array) {
            System.out.printf("%d ", integer);
        }
        System.out.println();
    }

}
