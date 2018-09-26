package Day1;

public class Ex6 {
    public static void main(String[] args) {
        int[] a = {12,43,21,65,12,21,43};
        int single = a[0];
        for(int i=1;i<a.length;i++){
            single = single ^ a[i];
        }
        System.out.println(single);
    }
}
