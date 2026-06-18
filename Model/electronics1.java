package model;
import java.io.*;
import java.util.ArrayList;


public class electronics1 extends product implements functions  {
    public String model;
    private static final String file="elect.dat";
     public  electronics1(String name,int id,int price,String type,int quan,String model){
    super(name, id, price, type, quan);
    this.model=model;
    }
     public electronics1(){
        
   }
   public String  add(product p){
    electronics1 e=(electronics1)p;
    ArrayList<electronics1>list=readFromFile();
    list.add(e);
    writeToFile(list);
    return "Product Added Successfully";
   }
   public String remove(int id){
    ArrayList<electronics1>list=readFromFile();
    //list.removeIf(e->e.getid()==id);
    for(electronics1 e:list){
        if(e.getid()==id){
            list.remove(e);
            writeToFile(list);
    return "Product removed successfully";
        }
    }
   
    return "Product not found";
   }
   public String update(int id,String s,int id1){
    ArrayList<electronics1>al=readFromFile();
    if(!al.isEmpty()){
    if(s.equalsIgnoreCase("i")){
        
        for(electronics1 e:al){
            if(id==e.getid()){
                int i=e.getquan()+id1;
                e.setquan(i);
                writeToFile(al);
                return "Product Quantity Increased Successfully";
            }
        }
    
    }
    else if(s.equalsIgnoreCase("r")){
         for(electronics1 e:al){
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
ArrayList<electronics1>al=readFromFile();
    if(!al.isEmpty()){
    for(electronics1 e:al){
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
    ArrayList<electronics1>al=readFromFile();
    if(!al.isEmpty()){
    for(electronics1 e:al){
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
     ArrayList<electronics1>al=readFromFile();
    if(!al.isEmpty()){
    for(electronics1 e:al){
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
     ArrayList<electronics1>al=readFromFile();
ArrayList<product>p=new ArrayList<>();

for(electronics1 e:al)
{
p.add((product)e);
}

return p ;
}
@SuppressWarnings("unchecked")
public ArrayList<electronics1>readFromFile(){
    ArrayList<electronics1>list=new ArrayList<>();
    try{
        File f1=new File(file);
        FileInputStream f=new FileInputStream(f1);
        ObjectInputStream ois=new ObjectInputStream(f);
        list=(ArrayList<electronics1>)ois.readObject();
        ois.close();
        f.close();
    }
        catch(Exception e){
            e.getMessage();
        }
        
        return list;
    }
    public void writeToFile(ArrayList<electronics1>list){

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

   

    
  



