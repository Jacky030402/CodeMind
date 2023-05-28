package ArrayANDbasic;

public class ArrSmallest {
    public static void main(String[] args) {
        // find the smallest element in th array
        int arr[]= {23,45,65,76,12,78,89};
        int MinNum = Integer.MAX_VALUE;
        for(int element : arr){
            if(element < MinNum){
                MinNum = element;
            }
        }
        System.out.println("the smallest element in the array is:" + MinNum);
    }
}
