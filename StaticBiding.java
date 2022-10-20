
package staticbiding;

class s_binding{
    s_binding(){
        System.out.println(" this is static binding");
    }
}

class d_binding{
    void binding(){
        System.out.println("this is dynamic binding "); 
    }
}
class child extends d_binding {
    void binding(){
        System.out.println("this is the child of dynamic binding ");
    }
}
public class StaticBiding {

    
    public static void main(String[] args) {
        //Static Binding :when the type of object is determine in compile time
      //  b object type is determine in compile time.
        s_binding b=new s_binding();
        
        //the type of object is dtermine in run time called dynamic binding.
        d_binding d=new child();
        d.binding();
    }
    
}
