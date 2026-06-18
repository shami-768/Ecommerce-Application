package model;
import java.util.*;
public interface functions {
    String add(product e );
    String remove(int id);
    String update(int id,String s,int id1);
    String updatename(int id,String name);
    String updateid(int id,int id1);
    String updateprice(int id,int id1);
    ArrayList<product> display();
   

}
