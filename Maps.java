//Complete this code or write your own from scratch
import java.util.*;

class Maps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> contacts=new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            contacts.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer i=contacts.get(s);
            if(i!=null){
                System.out.println(s+"="+i);
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}