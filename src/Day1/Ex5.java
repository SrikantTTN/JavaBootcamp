package Day1;

public class Ex5 {

    public static void main(String[] args) {
        int[] a = {1,34,6,42,321,324,54,43,432,342,23};
        int[] b = {765,45,34,3,2,321,34,43,5,65};
        int maxL = Math.max(a.length,b.length);
        int[] c = new int[maxL];
        int i=0;
        for(int aa: a){
            for(int bb:b){
                if(aa==bb){
                    c[i] = aa;
                    i++;
                }
            }
        }
        for(int oc: c ){
            System.out.print(oc + " ");
        }
    }
}
