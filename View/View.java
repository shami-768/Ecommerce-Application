 package view;


public class View {
    public static void show(String s){
        System.out.println(s);
    }
    public  static void displayele(){
        System.out.println("1.Add item\n2.Remove item\n3.Update item\n4.Display items\n5.Exit\nEnter choice:");
    }
 
    
    public static void display(String name,int id,int price,int quan,String type,String model){
       
            System.out.println("---------------");
            System.out.println("Product Name: "+name+"\nProduct Id: "+id+"\nProduct Type: "+type+"\nProduct Price: "+price+"\nProduct Quantity: "+quan+"\nProduct Model:"+model);
           
            
        }
        
    
     public static void display1(String name,int id,int price,int quan,String type,String color){
        System.out.println("---------------");
            System.out.println("Product Name: "+name+"\nProduct Id: "+id+"\nProduct Type: "+type+"\nProduct Price: "+price+"\nProduct Quantity: "+quan+"\nProduct color:"+color);
           
               
          
       
    }
}
