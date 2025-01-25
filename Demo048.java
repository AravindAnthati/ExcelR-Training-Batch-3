import java.util.Scanner;
public class Demo048{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long n = sc.nextLong();
        n = Math.abs(n);
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits is " + sum);

    }
    }