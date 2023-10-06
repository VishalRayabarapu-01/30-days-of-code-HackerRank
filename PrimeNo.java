import java.util.*;

public class PrimeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number <= 1) {
                System.out.println("Not prime");
                continue;
            }
            if (number == 2) {
                System.out.println("Prime");
                continue;
            }
            if (number % 2 == 0) {
                System.out.println("Not prime");
                continue;
            }
            
            boolean isPrime = true;
            for (int j = 3; j * j <= number; j += 2) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
