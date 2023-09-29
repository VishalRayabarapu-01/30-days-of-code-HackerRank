import java.util.*;

public class Stacks {
    // Write your code here.
    private Stack<Character> stack=new Stack<>();
    private Queue<Character> queue=new LinkedList<>();
    public void pushCharacter(char ch){
        stack.push(ch);
    }
    public char popCharacter(){
        return stack.pop();
    }
    public void enqueueCharacter(char c){
        queue.add(c);
    }
    public char dequeueCharacter(){
        return queue.poll();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Stacks p = new Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}