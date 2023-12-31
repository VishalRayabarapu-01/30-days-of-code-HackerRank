import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        int numberOfSwaps = 0;
        for (int i = 0; i < a.size(); i++) {
            for(int j=0;j<a.size()-1;j++){                
                if(a.get(j)>a.get(j+1)){
                    int temp=a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    numberOfSwaps++;
                }
            }
            if(numberOfSwaps==0){
                break;
            }
        }
        System.out.printf("Array is sorted in %d swaps.\n",numberOfSwaps);
        System.out.printf("First Element: %d\n",a.get(0));
        System.out.printf("Last Element: %d",a.get(a.size()-1));
        bufferedReader.close();
    }
}
