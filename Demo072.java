class LinearSearch{
    public static int search(int arr[] , int n , int x){
        for(int i=0; i<n; i++){
            if(arr[i] == x)
                return i;
        }
            return -1;
        }
}

public class Demo072{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,};
        int x = 3;
        LinearSearch obj = new LinearSearch();
        int result = obj.search(arr, arr.length, x);
        if(result == -1){
            System.out.println("Element is not present in array");
        }
        else{
            System.out.println("Element is present at index " + result);
        }
    }
}