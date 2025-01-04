import java.util.Scanner;
public class Demo009 {
    String Cust_Name = "Aravind";
    Long Account_no = 9876543;
    Double Balance = 1000.00;
    void accept_details(){
        System.out.println("Enter Your Name, Account_Number");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_no = sc.nextLong();
    }
    void Display_details(){
        System.out.println("Hello: "+ Cust_Name);
        System.out.println("Your balance is: "+ Balance);
    }
    public static void main(String[] args) {
        Demo009 obj = new Demo009();
        obj.accept_details();
        obj.Display_details();
    }
    }
