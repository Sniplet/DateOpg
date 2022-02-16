import java.util.HashMap;
import java.util.Map;

public class opg18 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(8, "Eight");
        map.put(41, "Forty-one");
        map.put(8, "Ocho");
        map.put(18, "Eighteen");
        map.put(50, "Fifty");
        map.put(132, "OneThreeTwo");
        map.put(28, "Twenty-eight");
        map.put(79, "Seventy-nine");
        map.remove(41);
        map.remove(28);
        map.remove("Eight");
        map.put(50, "Forty-one");
        map.put(28, "18");
        map.remove(18);
        System.out.println(map);
        /*

         */
    }




}
