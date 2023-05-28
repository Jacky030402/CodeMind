package ArrayANDbasic;

public class ArrCopy {
    public static void main(String[] args) {
        int arr[] = {3,7,9,1,5};
        int arr1[]= new int [arr.length];

        for (int i=0; i<arr.length; i++){
            arr1[i] = arr[i];
        }
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
