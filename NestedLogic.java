import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class NestedLogic {

    public static int calculateFine(int[][] dates) {
        LocalDate returnDate = LocalDate.of(dates[0][2], dates[0][1], dates[0][0]);
        LocalDate dueDate = LocalDate.of(dates[1][2], dates[1][1], dates[1][0]);

        Period period = Period.between(dueDate, returnDate);

        int fine;

        if (returnDate.getYear() > dueDate.getYear()) {
            fine = 10000;
        } else if (period.getMonths() > 0) {
            fine = 500 * period.getMonths();
        } else if (period.getDays() > 0) {
            fine = 15 * period.getDays();
        } else {
            fine = 0;
        }

        return fine;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[][] dates = new int[2][3];

        for (int i = 0; i < dates.length; i++) {
            for (int j = 0; j < dates[i].length; j++) {
                dates[i][j] = scan.nextInt();
            }
        }

        int fine = calculateFine(dates);

        System.out.println(fine);

        scan.close();
    }
}