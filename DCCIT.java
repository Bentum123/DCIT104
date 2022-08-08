import.java.util.Scanner

public class PrimeSum{
    public static void main(String[]args){
        Scanner sc=new
        Scanner(System.ini);
            int i, num, count, sum=0;
            System.out.println("Please enter maximum value");
            int maxValue=sc.nextInt();

            System.out.println("Sum of Prime numbers between 1 and "+maxValue+" are:");
            for(num=1; num<=maxValue; num++){
                count=0;
                for i=2; i<=num/2;i++){
                    if(num%i==0){
                        count++;
                        break;
                    }
                }
                if (count==0 && num!=1){
                    sum+=num;
                }
            }
            System.out.println(sum);
    }
}
