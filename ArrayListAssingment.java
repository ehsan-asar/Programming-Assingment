
package arraylistassingment;

import java.util.*;  

class Book{
    String name ;
    int year;
    String author;
    Book(String name ,int year ,String author){
        this.name=name;
        this.year=year;
        this.author=author;
    }
}
public class ArrayListAssingment {

    
    public static void main(String[] args) {
       
  

ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
 // Adding Mehtod to the Arraylist
 list.add("Ehsanullah");
 list.add("ahmd");
 list.add("mahmood");
 
 ArrayList<String> list2=new ArrayList<String>();//Creating arraylist2
 list2.add("energy");
 list2.add("football");
 // this is the Itreator Interface for iterat the element of the list.
 list.addAll(list2);

 Iterator t=list.iterator();
 while(t.hasNext()){
     System.out.println(t.next());
 }
 //remove method
list.removeAll(list2);
 System.out.println("After the remove method the list2 is removed");
for(String a:list){
   
    System.out.println(a);
}

//clear the list by using the list mehtod 
list.clear();
 System.out.println("After the clear method nothing will be empty array");
        System.out.println(list);
        
        
         // user define class object passing to the list .
   
    Book book1=new Book("pashto",2014,"kahn");
    Book book2=new Book("Dari",2014,"Mohammad");
    Book book3=new Book("MAth",2000,"Shapiq");
     ArrayList<Book> booklist=new ArrayList<Book>();
    
    booklist.add(book1);
    booklist.add(book2);
    booklist.add(book3);
    
//    Iterator t2=booklist.iterator();
//    while(t2.hasNext()){
//     
//        Book b=(Book)t2.next();
//        System.out.println("Book name:\n"+b.name +"\n Author:"+b.author +"\n year:"+b.year);
//
//    }

 for(Book b3:booklist){
     System.out.println("Book name:\n"+b3.name +"\n Author:"+b3.author +"\n year:"+b3.year);
 }
} 
  
}
  
    

