package controller;
import model.product;

import java.util.ArrayList;

import model.clothing1;
import model.electronics1;
import view.*;

public class control {

    
    electronics1 e;
    clothing1 cl;
    
  product p;
  ArrayList<product>p1;
   public control(electronics1 e,clothing1 cl,product p){
       
        this.e=e;
        this.cl=cl;
        this.p=p;
       
    }
    int n,ch,op;
    public void start(){
        
        boolean loop=true,loop1=true;
        while(loop1){
            View.show("1.Electronics\n2.Clothing\nEnter choice:");

            n=UserInput.getchoice();
            
            while(loop){
                View.displayele();
           
                ch=UserInput.getchoice();
                switch(ch){
                    case 1:{
                        String s1=UserInput.getname();
                        int id=UserInput.getid();
                        int price=UserInput.getprice();
                        String type=UserInput.gettype();
                        int quan=UserInput.getquan();
                        if(n==1){
                        String model=UserInput.getmodel();
                    p=new electronics1(s1, id, price,type,quan,model);
                       String s=e.add(p);
                        View.show(s);
                        }
                        else{
                            View.show("Enter color:");
                            String color =UserInput.up();
                            p=new clothing1(s1, id, price, type, quan, color);
                       String s=cl.add(p);
                        View.show(s);
                        }
                        break;
                    }
                    case 2:{
                        if(n==1){
                        String s=e.remove(UserInput.getid());
                        
                        View.show(s);
                        }
                        else{
                           String s=cl.remove(UserInput.getid());
                        
                        View.show(s);  
                        }
                        break;
                    }
                    case 3:{
                        View.show("1.update name\n2.update id\n3.update price\n4.update quantity \nEnter option:");
                        op=UserInput.getchoice();
                        if(op==1){
                            View.show("Enter Product id:");
                            int id=UserInput.getchoice();
                          
                            View.show("Enter name to update:");
                            String name=UserInput.up();
                            if(n==1){
                            String s=e.updatename(id,name);
                            View.show(s);
                            }
                            else{
                                String s=cl.updatename(id,name);
                            View.show(s); 
                            }
                        }
                        else if(op==2){
                             View.show("Enter Product id:");
                             int id=UserInput.getchoice();
                             View.show("Enter new id to update:");
                             int id1=UserInput.getchoice();
                             if(n==1){
                              String s=e.updateid(id,id1);
                              View.show(s);
                             }
                             else{
                                     String s=cl.updateid(id,id1);
                              View.show(s);
                             }
                        }
                        else if (op==3){
                            View.show("Enter Product id:");
                             int id=UserInput.getchoice();
                                View.show("Enter price to update:");
                             int id1=UserInput.getchoice();
                             if(n==1){
                             String s=e.updateprice(id,id1);
                              View.show(s);
                             }
                             else{
                                 String s=cl.updateprice(id,id1);
                              View.show(s);
                             }
                        }
                        else if(op==4){
                            View.show("Enter Product id:");
                             int id=UserInput.getchoice();
                        View.show("Increase or Reduce Quantity(I/R):");
                        String s1=UserInput.up();
                        View.show("Enter product Quantity to update:");
                        int id1=UserInput.getchoice();
                        if(n==1){
                        String s=e.update(id,s1,id1);
                        View.show(s);
                        }
                        else{
                           String s=cl.update(id,s1,id1);
                        View.show(s); 
                        }
                       
                        }
                        else{
                            View.show("invalid option");
                        }
                        break;
                    }
                    case 4:{
                        if(n==1){
                            p1=e.display();
                        
                            for(product el1:p1){
                                electronics1 el=(electronics1)el1;
                        View.display(el.getname(),el.getid(),el.getprice(),el.getquan(),el.gettype(),el.model);
                            }
                            View.show("-----------------");
                        }
                    else {
                        p1=cl.display();
                        
                            for(product el1:p1){
                                clothing1 el=(clothing1)el1;
                        View.display1(el.getname(),el.getid(),el.getprice(),el.getquan(),el.gettype(),el.color);
                            }
                            View.show("-----------------");
                        }
                      

                     break;
}
                    case 5:{
                        loop=false;
                        View.show("Thank you !");
                        break;
                        
                    }
                }
            }
            View.show("you want to exit app:(yes/no)");
           String s= UserInput.up();
           if(s.equalsIgnoreCase("yes")){
            
            loop1=false;
            System.out.println("Exiting app !");
        }
        else{
            loop=true;
        }
    }
    }
}
