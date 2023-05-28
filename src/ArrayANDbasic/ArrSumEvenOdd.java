package ArrayANDbasic;

public class ArrSumEvenOdd {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,7};
        int Even=0;
        int Odd=0;
        for(int i=0; i<=arr.length; i++){
            if(i%2==0){
                Even +=i;
            }
            else{
                Odd+=i;
            }
        }
        System.out.println("The sum of even integers is:"+ Even);
        System.out.println("The sum od odd integers is:"+ Odd);

    }
}
