package JavaMavenPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List<Object> list = new ArrayList<>();
        // list.add("apple");
        // list.add("pear");

        App app =new App();
        System.out.println(app.toString2(list));
    }

    public String toString2(List<Object> list) {
        Iterator<Object> it = list.iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            Object e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
}
