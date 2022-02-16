import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class opg16 {


    public static void main(String[] args) {
        Map<String, Integer> m1 = new TreeMap();
        m1.put("Nicklas", 29);
        m1.put("Blyat,", 24);
        m1.put("Leroy", 88);
        //System.out.println(m1.get(29));
        Iterator<String> itr = m1.keySet().iterator();
        while (itr.hasNext())
        {
            String s1 = itr.next();
            int numb = m1.get(s1);
            if (numb < 50)
            {
                itr.remove();

            }
           // System.out.println(m1);
            /*System.out.println(s1);
            System.out.println(m1.get(s1));*/
        }
        System.out.println(m1);
        //System.out.println(itr.next());
    }
}
