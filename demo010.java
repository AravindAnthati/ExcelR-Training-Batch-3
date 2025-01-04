import java.util.Scanner;
class Customer {
        String Cust_Name = "Aravind";
        int Account_no = 9876543;
        Double Balance = 1000.00;
        void accept_details(){
            System.out.println("Enter Your Name, Account_Number");
            Scanner sc = new Scanner(System.in);
            Cust_Name = sc.nextLine();
            Account_no = sc.nextInt();
        }
        void Display_details(){
            System.out.println("Hello: "+ Cust_Name);
            System.out.println("Your balance is: "+ Balance);
        }
}
public class demo010 {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.accept_details();
        c.Display_details();
    }
}