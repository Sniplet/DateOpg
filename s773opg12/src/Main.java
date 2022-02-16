import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
        // set exercise, examine elements in sets, sets remove duplicates

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(74);
        set.add(12);
        set.add(74);
        set.add(74);
        set.add(43);
        Iterator<Integer> blyat = set.iterator();
        System.out.println(blyat.next());

        System.out.println(set.contains(74));

        for (int n : set) {
            System.out.println(n);
        }


    }








}
