import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("This is an example of String in Which i have to find duplicates");
        Scanner in = new Scanner(System.in);
        String toFind = in.next(".");
        int count = findOccurence(a,toFind,0);
        System.out.println(count);
    }

    private static int findOccurence(StringBuilder a, String toFind ,int count) {
        if(a.charAt(0)==toFind.charAt(0)){
            count++;
        }
        a.deleteCharAt(0);
        System.out.println(a.toString());
        if(a.length()>0){
            count = findOccurence(a,toFind,count);
        }
        return count;
    }
}
