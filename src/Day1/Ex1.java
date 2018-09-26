package Day1;

public class Ex1 {

    public static void main(String[] args) {
        StringBuilder a= new StringBuilder("qwertyuiqweopqwe");
        String findPattern = "qwe";
        String replaceWith = "asd";
        int l = findPattern.length();
        for(int i=0;i<a.length()-l +1;i++){
            if(a.substring(i,i+l).equals(findPattern)){
                String prev = a.substring(0,i);
                String nxt = a.substring(i+l,a.length());
                a = new StringBuilder(prev + replaceWith + nxt);
            }
        }
        System.out.println(a);
    }
}
