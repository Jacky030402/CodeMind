package ArrayANDbasic;

public class Arr2Sum {
    public static void main(String[] args) {

        int arr1 []= {1,2,3,4,5,6,7};
        int arr2 []= {0,0,2,1,3,5,2};
        for(int elements : arr1){
            System.out.print(elements + " ");
        }
        System.out.println();

        for (int elements : arr2){
            System.out.print(elements + " ");
        }
        System.out.println();

        int length = arr1.length;
        int arr3 []=new int [arr1.length];

        for(int i=0; i<arr1.length; i++){
            arr3[i]= arr1[i]+arr2[i];
        }
        for(int i= 0; i< arr1.length; i++){
            System.out.print(arr3[i]);
            System.out.print(" ");
        }
    }
}
