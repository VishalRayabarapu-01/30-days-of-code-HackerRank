import java.io.*;
class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */
    public static Double calculatePercentagedValue(double meal_cost, int percent){
        return (meal_cost*percent)/100;
    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
        Double tip=calculatePercentagedValue(meal_cost, tip_percent);
        Double tax=calculatePercentagedValue(meal_cost,tax_percent);
        System.out.println(Math.round(tip+tax+meal_cost));
    }

}

public class MathOperators {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
