import java.util.Arrays;
import java.util.Scanner;

public class ArraySmall {

    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        a = sc.nextInt();
        int [] arr = new int [a];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < arr.length; i++) {

            b = sc.nextInt();
            arr[i] = b;
        }

        System.out.print(Arrays.toString(arr) + " ");
    }
}
