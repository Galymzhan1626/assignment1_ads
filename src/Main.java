import java.util.Scanner;

public class Main {
    // findSum method return sum of array elements
    static int findSum(int arr[], int n)
    {
        if (n <= 0)
            return 0;
        return (findSum(arr, n - 1) + arr[n - 1]);
    }

    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);

    // Input size of array
    int n = scan.nextInt();

    // Input array elements
    int arr[] = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
    }
    //divide the sum by the number of elements to get the average
    System.out.println((findSum(arr, arr.length))/n);

    }
}