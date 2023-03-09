import java.util.Scanner;
public class MinMax {
    public static int min(int n1, int n2) {
        if (n1 < n2)
            return n1;
        else
            return n2;
    }
    public static int max(int n1, int n2) {
        if (n1 > n2)
            return n1;
        else
            return n2;
    }
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        int minimum = min(min(x, y), z);
        int maximum = max(max(x, y), z);
        System.out.println("Min: " + minimum + ", max: " + maximum);
    }
}
