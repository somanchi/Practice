import java.util.HashMap;
import java.util.Map;

public class AnagaramEncoding {

    public int makeAnagram(String a, String b) {
        Map<Character,Integer> map= new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }

        for (int i = 0 ; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i)) && a.indexOf(b.charAt(i)) == -1) {
                map.put(b.charAt(i),Math.abs(map.get(b.charAt(i))-1));
            }
            else {
                map.put(b.charAt(i),map.getOrDefault(b.charAt(i),0)+1);
            }
        }

        int sum = 0 ;

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            sum = sum + entry.getValue();
        }
        System.out.println(sum);
        return sum;

    }
}
