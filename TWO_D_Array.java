import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class TWO_D_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        List<Integer> sumOfIntegers=new ArrayList<>();
        for(int i=0;i<arr.size()-2;i++){
            List<Integer> firstRow=arr.get(i);
            List<Integer> secondRow=arr.get(i+1);
            List<Integer> thirdRow=arr.get(i+2);
            for(int j=0;j<firstRow.size()-2;j++){
                int sum=0;
                sum=sum+firstRow.get(j)+firstRow.get(j+1)+firstRow.get(j+2);
                sum=sum+thirdRow.get(j)+thirdRow.get(j+1)+thirdRow.get(j+2);
                sum=sum+secondRow.get(j+1);
                sumOfIntegers.add(sum);
            }
        }
        Collections.sort(sumOfIntegers);
        System.out.println(sumOfIntegers.get(sumOfIntegers.size()-1));
        bufferedReader.close();
    }
}
