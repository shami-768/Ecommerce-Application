package model;

import java.util.ArrayList;

public class electronics extends product implements functions{
   public  String model;
   public static ArrayList<electronics> al=new ArrayList<>();
  
   public  electronics(String name,int id,int price,String type,int quan,String model){
    super(name, id, price, type, quan);
    this.model=model;
    }
     public electronics(){
        
   }
    electronics e;
    public String add(product e){

        
       electronics el=(electronics)e;
       al.add(el);
        return "New Product Added Successfully";
    }
    public String remove(int id){
        if(!al.isEmpty()){
        for(electronics e:al){
            if(id==e.getid()){
                al.remove(e);
            return "Product removed Successfully";
            }
        }
    }
        return "Product Not Found !";
      
}
public String update(int id,String s,int id1){
       if(!al.isEmpty()){
    if(s.equalsIgnoreCase("i")){
        
        for(electronics e:al){
            if(id==e.getid()){
                int i=e.getquan()+id1;
                e.setquan(i);
                return "Product Quantity Increased Successfully";
            }
        }
    
    }
    else if(s.equalsIgnoreCase("r")){
         for(electronics e:al){
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
public String updatename(int id,String name){
    if(!al.isEmpty()){
    for(electronics e:al){
        if(e.getid()==id){
            e.setname(name);
            return "Product Name updated successfully ";
        }
    }
}
    return "Product not found ";
}
public String updateid(int id,int id1){
    if(!al.isEmpty()){
    for(electronics e:al){
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
    for(electronics e:al){
        if(e.getid()==id){
            e.setprice(id1);
            return "Product price updated successfully ";
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
