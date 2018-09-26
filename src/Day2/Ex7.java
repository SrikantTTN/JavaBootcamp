package Day2;

public class Ex7 {
    public static void main(String[] args) {
        long seconds = 12345678;
        int days=0;
        int hours=0;
        int minutes=0;

        days = (int)seconds/(60*60*24);
        seconds = seconds % (60*60*24);
        System.out.println(days +" days");

        hours = (int)seconds /(60*60);
        seconds = seconds % (3600);
        System.out.println(hours + " hours");

        minutes = (int)seconds /60;
        System.out.println(minutes + " minutes");
        seconds = seconds % 60;
        System.out.println(seconds + " seconds");
    }

}
