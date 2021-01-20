package JavaPrictice.src;

import java.util.ArrayList;
import java.util.List;

public class Practise {
    public static void main(String[] args) {
        String s = "abc";
        String l = "cdef";
        Class<?> clss = s.getClass();
        Class<?> clsl = l.getClass();
        Class<?> clsString = String.class;
        boolean sameClass = clss == clsl && clsl == clsString;
        System.out.println(sameClass);//True
        
        Class<?> clsInteger = Integer.class;
        sameClass = clss == clsl && clsl == clsString && clsString == clsInteger;
        System.out.println(sameClass);//False

        //泛型练习
        List<String> list = new ArrayList<>();
        list.add("123");
        System.out.println(list.get(0));
    }
}