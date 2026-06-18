package model;

import java.io.Serializable;

public class product implements Serializable {
   private static final long serialVersionUID=1L;
    private String name;
    private int id;
    private int price;
    private String type;
    private int quan;
    public product()
    {
        
    }
    product(String name,int id,int price,String type,int quan){
        this.name=name;
        this.id=id;
        this.price=price;
        this.type=type;
        this.quan=quan;
    }
    public String getname(){
        return name;
    }
     public String gettype(){
        return type;
    }
     public int getid(){
        return id;
    }
    public int getprice(){
        return price;
    }
    public int getquan(){
        return quan;
    }
    public void setname(String name){
        this.name=name;
    }
    public void settype(String type){
        this.type=type;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setprice(int price){
        this.price=price;
    }
    public void setquan(int quan){
        this.quan=quan;
    }
   
}
