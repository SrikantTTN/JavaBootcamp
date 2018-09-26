package Day1;

public class Ex8 {
    public static void main(String[] args) {
        String forward = "qwertyuiop asdfghjkl";
        StringBuffer back = new StringBuffer();
        for(int i=forward.length()-1;i>=0;i--){
            if( !(i>3&&i<10)){
                back.append(forward.charAt(i));
            }
        }
        System.out.println(back);
    }
}
