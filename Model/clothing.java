package model;

import java.util.ArrayList;

public class clothing extends product implements functions {
    
     public  String color;
   public static ArrayList<clothing> al=new ArrayList<>();
   
   public  clothing(String name,int id,int price,String type,int quan,String color){
    super(name, id, price, type, quan);
   
    this.color=color;
    }
     public clothing(){
    
   }
    clothing cl;
     public String add(product p){
        clothing cl=(clothing)p;
        al.add(cl);
       
        return "New Product Added Successfully";
    }
     public String remove(int id){
        if(!al.isEmpty()){
        for(clothing cl:al){
            if(id==cl.getid()){
                al.remove(cl);
            return "Product removed Successfully";
            }
        }
    }
        return "Product Not Found !";
      
}
public String update(int id,String s,int id1){
       if(!al.isEmpty()){
    if(s.equalsIgnoreCase("i")){
        
        for(clothing e:al){
            if(id==e.getid()){
                int i=e.getquan()+id1;
                e.setquan(i);
                return "Product Quantity Increased Successfully";
            }
        }
    
    }
    else if(s.equalsIgnoreCase("r")){
         for(clothing e:al){
            if(id==e.getid()){
                int i=e.getquan()-id1;

                e.setquan(i);
                return "Product Quantity Reduced Successfully";
            }
        }
    }
}
        return "invalid id !";
}
public String updateid(int id,int id1){
    if(!al.isEmpty()){
    for(clothing e:al){
        if(e.getid()==id){
            e.setid(id1);
            return "Product id updated successfully ";
        }
    }
}
    return "Product not found";

}
public String updateprice(int id,int id1){
    if(!al.isEmpty()){
    for(clothing e:al){
        if(e.getid()==id){
            e.setprice(id1);
            return "Product price updated successfully ";
        }
    }
}
    return "Product not found ";

}
public String updatename(int id,String name){
    if(!al.isEmpty()){
    for(clothing e:al){
        if(e.getid()==id){
            e.setname(name);
            return "Product Name updated successfully ";
        }
    }
}
    return "Product not found ";
}


public ArrayList<product>display(){
ArrayList<product>p=new ArrayList<>();
p.addAll(al);
return p ;
}
}


