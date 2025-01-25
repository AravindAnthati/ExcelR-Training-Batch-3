import java.util.Scanner;
public class Demo049 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = scanner.nextLong();
        boolean isNegative = number < 0;
        number = Math.abs(number);
        long reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10; 
            number /= 10;                           
        }

        if (isNegative) {
            reversed = -reversed;
        }

        System.out.println("The reversed number is: " + reversed);

        scanner.close();

    }
}