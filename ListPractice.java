import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        ListArrayTransition listArrayTransition = new ListArrayTransition();
        List<String> list = List.of("apple", "pear", "banana");

        listArrayTransition.listToArrayOne(list);
        listArrayTransition.listToArrayTwo(list);
        listArrayTransition.listToArrayThree(list);
        
        listArrayTransition.arrayToList();
    }


}

//三种List转数组的方法以及一种数组转List方法
final class ListArrayTransition{

    //第一种是调用toArray()方法直接返回一个Object[]数组,但这种方法会丢失类型信息，所以实际使用很少。
    void listToArrayOne(List<?> list) {
        Object[] array = list.toArray();
        for (Object s : array) {
            System.out.println(s);
        }
    }

    //第二种方式是给toArray(T[])传入一个类型相同的Array，List内部自动把元素复制到传入的Array中。
    void listToArrayTwo(List<?> list){
        String[] array = list.toArray(new String[list.size()]);
        for (String str : array) {
            System.out.println(str);
        }
    }

    //第三种是通过List接口定义的T[] toArray(IntFunction<T[]> generator)方法
    void listToArrayThree(List<?> list){
        String[] array = list.toArray(String[]::new);
        for (String str : array) {
            System.out.println(str);
        }
    }

    //数组转List
    void arrayToList(){
        Integer[] array = {1,2,3};
        List<Integer> list = List.of(array);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
