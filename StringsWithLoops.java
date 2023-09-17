import java.util.*;

public class StringsWithLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        String[] arrayOfStrings=new String[number];
        for(int i=0;i<number;i++){
            arrayOfStrings[i]=sc.nextLine();
        }
        for (int i = 0; i < arrayOfStrings.length; i++) {
            String actualString=arrayOfStrings[i];
            StringBuffer oddStringBuffer=new StringBuffer();
            StringBuffer evenStringBuffer=new StringBuffer();
            for (int j = 0; j < actualString.length(); j++) {
                if(j%2==0){
                    evenStringBuffer.append(actualString.charAt(j));
                }else{
                    oddStringBuffer.append(actualString.charAt(j));
                }
            }
            System.out.println(evenStringBuffer+" "+oddStringBuffer);
        } 
        sc.close();
    }
}