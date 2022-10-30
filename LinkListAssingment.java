
package linklistassingment;

   import java.util.*;


public class LinkListAssingment {

    public static void main(String[] args) {
     
LinkedList<String> list=new LinkedList<String>();
//this is the add function
list.add("Ehsanuulah");
list.add("Suliman");
list.add("Khan");
list.add("Najib");
 //add it index method
list.add(2,"Manzor");
//this is the iterator 
       Iterator it=list.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
       //this size of linklsit
        System.out.println("the size of linklist :"+ list.size());
        //clear method to clear all the linklist
list.clear();
        System.out.println("after the clear method :"+list);
    }
    
}
