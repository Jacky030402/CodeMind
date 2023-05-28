package ArrayANDbasic;

public class ArraySum {
    public static void main(String[] args) {
     int arr[] = {1,2,3,4,5};

     ArraySum obj = new ArraySum();
     int result = obj.sumOfArray(arr);
        System.out.println(" The sum of elements of array is:" +result);
    }
    int sumOfArray(int arr[]){
        int sum = 0;
        for(int i= 0; i<=arr.length; i++){
            sum +=i;
        }
        return sum;

    }


}
