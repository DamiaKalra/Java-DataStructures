import java.util.*;
public class IterationHM {
public static void main(String args[]){
    //create
    HashMap<String,Integer> hm=new HashMap<>();
    //Insert
    hm.put("India",100);
    hm.put("China",150);
    hm.put("USA",200);
    hm.put("Nepal",300);
    hm.put("Australia",650);
    hm.put("SriLanka",800);
    //Iterate
    //hm.entrySet()
    Set<String>keys=hm.keySet();
    System.out.println(keys);
    for(String k:keys){
        System.out.println("key="+k+",value="+hm.get(k));
    }
}
}