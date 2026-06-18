package view;

import java.util.Scanner;

public class UserInput {
   static Scanner ob=new Scanner(System.in);
   
    public static int getchoice(){
        return ob.nextInt();
    }
    public static String getname(){
        View.show("Enter product name:");
        return ob.next();
    }
    public static String gettype(){
        View.show("Enter Product Type:");
        return ob.next();
    }
    public static String getmodel(){
        View.show("Enter Product Model :");
        return ob.next();
    }
    public static int getid(){
        View.show("Enter Product id:");
        return ob.nextInt();
    }
    public static int getprice(){
        View.show("Enter Product price:");
        return ob.nextInt();
    }
    public static int getquan(){
        View.show("Enter Product quan:");
        return ob.nextInt();
    }
    public static String up(){
        return ob.next();
    }

  
}
