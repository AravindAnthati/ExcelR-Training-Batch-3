import java.util.Scanner;

public class Demo073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean[] isDuplicate = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (isDuplicate[i]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    isDuplicate[j] = true;
                    break;
                }
            }
        }

        scanner.close();
    }
}
