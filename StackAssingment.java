
package stackassingment;

import java.util.*;
public class StackAssingment {

    
    public static void main(String[] args) {
      Stack<Integer> s=new Stack<Integer>();
     // the most usefull method of stack
    // it is lefo
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);  
   boolean em=s.isEmpty();
        System.out.println("the stack result :"+em);
       
      //  remove the element from the top of the stack
       s.pop();
        System.out.println(s);
        
      //  it return the top element of the stack
        System.out.println("the top element of the stack :"+s.peek());
    }
}
