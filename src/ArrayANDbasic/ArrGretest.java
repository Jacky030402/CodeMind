package ArrayANDbasic;

public class ArrGretest {
    public static void main(String[] args) {
        // find the greatest element in array
        int arr []= {34,45,560,76,87,98,212};
        int MaxNum = Integer.MIN_VALUE;
        for(int element : arr){
            if(element > MaxNum){
                MaxNum = element;
            }

        }
        System.out.println("The Greatest element in array is:" +MaxNum);

    }
}
