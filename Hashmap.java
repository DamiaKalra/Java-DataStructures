import java.util.*;
public class Hashmap {
    public static void main(String args[]){
        //create
        HashMap<String,Integer> hm=new HashMap<>();
        //Insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",200);
        System.out.println(hm);
        //get
        int population=hm.get("India");
        System.out.println(population);
        //containskey
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Nepal")); //false
        //remove
        System.out.println(hm.remove("India")); //true
        System.out.println(hm);
        //size
        System.out.println(hm.size());
        //isEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
