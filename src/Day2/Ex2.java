package Day2;

public class Ex2 {
    public static void main(String[] args) {
        String a = "Thisisastringtosort";
        char[] arr = new char[a.length()];
        for(int i=0;i<a.length();i++){
            arr[i] = a.charAt(i);
        }
        arr = sort(arr);
        for(char ss: arr){
            System.out.println(ss);
        }
    }
    static char[] sort(char arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            char key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
