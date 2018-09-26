package Day1;

import java.util.HashMap;

public class Ex2 {
    public static void main(String[] args) {
        String exmp = "This is an example of String in String in i an Which i have to find duplicates".toLowerCase();
        String[] arrOfWords = exmp.split(" ");
        HashMap<String,Integer> counts = new HashMap<>();
        for(String a:arrOfWords) {
                if (counts.containsKey(a)) {
                    int c = counts.get(a) + 1;
                    counts.put(a, c);
                } else {
                    counts.put(a, 1);
                }
            }
        for(String a : counts.keySet()) {
            if (counts.get(a) > 1) {
                System.out.println(a + " :" + counts.get(a));
            }
        }
    }
}
