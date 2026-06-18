
import controller.*;

import model.*;


public class Main {
    public static void main(String []args){
        
      
       electronics1 e=new electronics1();
        clothing1 cl=new clothing1();
        product p=new product();
        
        control c=new control(e,cl,p);
        c.start();


    }
}
