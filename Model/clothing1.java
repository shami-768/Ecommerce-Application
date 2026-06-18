package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

public class clothing1 extends product implements functions{
    public String color;
    private static final String file="cloth.dat";
     public  clothing1(String name,int id,int price,String type,int quan,String color){
    super(name, id, price, type, quan);
    this.color=color;
    }
     public clothing1(){
        
   }
   public String  add(product p){
    clothing1 e=(clothing1)p;
    ArrayList<clothing1>list=readFromFile();
    list.add(e);
    writeToFile(list);
    return "Product Added Successfully";
   }
   public String remove(int id){
    ArrayList<clothing1>list=readFromFile();
    //list.removeIf(e->e.getid()==id);
    for(clothing1 e:list){
        if(e.getid()==id){
            list.remove(e);
            writeToFile(list);
    return "Product removed successfully";
        }
    }
   
    return "Product not found";
   }
   public String update(int id,String s,int id1){
    ArrayList<clothing1>al=readFromFile();
    if(!al.isEmpty()){
    if(s.equalsIgnoreCase("i")){
        
        for(clothing1 e:al){
            if(id==e.getid()){
                int i=e.getquan()+id1;
                e.setquan(i);
                writeToFile(al);
                return "Product Quantity Increased Successfully";
            }
        }
    
    }
    else if(s.equalsIgnoreCase("r")){
         for(clothing1 e:al){
            if(id==e.getid()){
                int i=e.getquan()-id1;

                e.setquan(i);
                writeToFile(al);
                return "Product Quantity Reduced Successfully";
            }
        }
    }
}
        return "invalid id !";
}
public String updatename(int id,String name){
ArrayList<clothing1>al=readFromFile();
    if(!al.isEmpty()){
    for(clothing1 e:al){
        if(e.getid()==id){
            e.setname(name);
             writeToFile(al);
            return "Product Name updated successfully ";
        }
    }
}
    return "Product not found ";
}
public String updateid(int id,int id1){
    ArrayList<clothing1>al=readFromFile();
    if(!al.isEmpty()){
    for(clothing1 e:al){
        if(e.getid()==id){
            e.setid(id1);
            writeToFile(al);
            return "Product id updated successfully ";
        }
    }
}
    return "Product not found";

}
public String updateprice(int id,int id1){
     ArrayList<clothing1>al=readFromFile();
    if(!al.isEmpty()){
    for(clothing1 e:al){
        if(e.getid()==id){
            e.setprice(id1);
            writeToFile(al);
            return "Product price updated successfully ";
        }
    }
}
    return "Product not found ";

}
public ArrayList<product>display(){
     ArrayList<clothing1>al=readFromFile();
ArrayList<product>p=new ArrayList<>();
p.addAll(al);
return p ;
}
@SuppressWarnings("unchecked")
public ArrayList<clothing1>readFromFile(){
    ArrayList<clothing1>list=new ArrayList<>();
    try{
         File f1=new File(file);
        FileInputStream f=new FileInputStream(f1);
        ObjectInputStream ois=new ObjectInputStream(f);
        list=(ArrayList<clothing1>)ois.readObject();
        ois.close();
        f.close();
    }
        catch(Exception e){
           return new ArrayList<>();
        }
        
        return list;
    }
    public void writeToFile(ArrayList<clothing1>list){

        try{
             File f1=new File(file);
        FileOutputStream f=new FileOutputStream(f1);
        ObjectOutputStream oos=new ObjectOutputStream(f);
        oos.writeObject(list);
        oos.close();
        f.close();
    }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}

   

    
  





