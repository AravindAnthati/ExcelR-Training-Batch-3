import java.util.Scanner;
public class Demo047{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long n = sc.nextLong();
        n = Math.abs(n);
        int digitCount = 0;
        if(n == 0){
            digitCount = 1;
            }else{
                while(n != 0){
                    n = n / 10;
                    digitCount++;
                    }
                    }
                    System.out.println("Number of digits in the number is " + digitCount);
                    sc.close();
                    
            }

        }
        
