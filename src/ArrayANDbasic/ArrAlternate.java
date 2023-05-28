package ArrayANDbasic;

public class ArrAlternate {
    public static void main(String[] args) {
        // printing the alternate elements in the array
        int arr []= {1,2,4,5,6,7,8,9,10};
        System.out.println("Alternate elements in the array");
        for(int i=0; i<arr.length; i+=2){
            System.out.print(arr[i]);
            System.out.print(" ");

        }
    }
}
