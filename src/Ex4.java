public class Ex4 {
    public static void main(String[] args) {
        int lower = 0;
        int upper = 0;
        int digit = 0;
        int sp = 0;
        String lp = "[a-z]";
        String up = "[A-Z]";
        String dp = "[0-9]";
        String a = new String("Thi%s is ^@#@$:{ 5an exam5ple of Str2ing in Whic7h i haveDS FSD DAS to find duplicates");
        for(char ch : a.toCharArray()){
            String chS = String.valueOf(ch);
            if(chS.matches(lp)){
                lower++;
            }
            else if(chS.matches(up)){
                upper++;
            }
            else if (chS.matches(dp)){
                digit++;
            }
            else {
                sp++;
            }
        }
        int l = a.length();
        System.out.println("Lower = "+lower + " and its % = " +(float)lower/l *100);
        System.out.println("Upper = "+ upper + " and its % = " + (float)upper/l *100);
        System.out.println("Digit = " + digit + " and its % = " + (float)digit/l *100);
        System.out.println("Special Chars = " + sp + " and its % = " + (float)sp/l *100);
    }
}
