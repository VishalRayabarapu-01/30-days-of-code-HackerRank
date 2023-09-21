import java.io.*;
public class BinaryConversionNdPrblm {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binary=Integer.toBinaryString(n);
        int count=0,highestNum=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }else{
                if(highestNum<count){
                    highestNum=count;
                }
                count=0;
            }
        }
        //here it checks for again whether the count is largest or not 
        //because suppose 1001111 in this case the highestNumber updation not happens because 
        //the updation is done when we encounter 0.
        if(highestNum<count){
            highestNum=count;
        }
        System.out.println(highestNum);
        bufferedReader.close();
    }
}
