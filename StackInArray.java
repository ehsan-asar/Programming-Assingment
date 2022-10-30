
package stackinarray;

class stack{
     int aray[]=new int[5];
    int size;
      public boolean full(){
       if(aray.length==size)
           return true;
       else
           return  false;
   }
      public boolean EMpty(){
       if(size==0)
           return true;
       else
           return  false;
   }
      public void push(int data){
       if(full()){
           System.out.println("Stack is full");
       }
       else{
           aray[size]=data;
           size++;
       }
   }
      public void pop(){
        if(EMpty()){
       System.out.println("Stack is empty");
        }
        else
        { int t =aray[size-1];
        
        System.out.println("removed"+t);
            size--;
        }
    }
      public void show(){
        for(int i=0;i<size;i++){
            System.out.print("  "+aray[i]);
}
      }
      public void peek(){
       int data=aray[size-1];
       System.out.println("peek"+data);
   }
}
public class StackInArray {
    public static void main(String[] args) {
        stack list=new stack();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.peek();
       list.pop();
         list.show();
    }
    
}
