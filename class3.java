
public class class3 {
    public static void main(String[] args) {

        System.out.println("Using For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Using While Loop:");
        int sum = 0;
        int j = 1;
        while (j <= 5) {
            sum += j;
            j++;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);
        System.out.println(); // Add a blank line for separation
        
        System.out.println("Using Do-While Loop:");
        int k = 2;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k <= 10);
    }
}
