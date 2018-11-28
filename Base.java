class Parent { 
    // instance variable 
    int a = 36; 
  
    // static variable 
    static float x = 12.2f; 
} 
  
class Base extends Parent { 
    void GFG() 
    { 
        // referring super class(i.e, class Parent)  
        // instance variable(i.e, a) 
        super.a = 1; 
        System.out.println(a); 
  
        // referring super class(i.e, class Parent)  
        // static variable(i.e, x) 
        super.x = 60.3f; 
  
        System.out.println(x); 
    } 
    public static void main(String[] args) 
    { 
        new Base().GFG(); 
    } 
} 