package Collections;
/*
Map is an interface , present inside java.util package.
It is used to store key value pair.
one key value pair is known as entry.
keyts must be unique.
values can be duplicate.
map does not comes under collection because in collection we store object but in map we store key value pair.
map has 3 implimenting classes such as HashMap LinkedHashMap, and TreeMap.

Put(Object key, object value):
    it is used to add entry inside map.
    return type is object.
    it will return previous value of key, if we are adding 

containsKey(Object Key):
    It is used to check whether the given key is present or not,
    return type is boolean.
    
containsValue()


*/


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class mapp {
    // public static void main(String[] args) {
    //     Map map = new HashMap();
    //     System.out.println(map.put(1, "Kabir"));  //gives null for the first time
    //     System.out.println(map.put(1, "Kabir"));    //Overrides null for key 1
    //     System.out.println(map.put(12.2,12.5));
    //     System.out.println(map.put(1,"Mohit"));  //return previous value of key 1
    //     System.out.println(map.put(1, "Mohit"));

    //     System.out.println(map);

    //     System.out.println(map.remove(1));  //removes and returns key value  pair of key 1
    //     //we get null if we dont have the specific key we are removing

    //     System.out.println(map.containsKey(12.2));  //returns true if the key is present
    //     System.out.println(map.containsValue("Mohit"));
    //     System.out.println(map.containsValue(12.5));  //returns true if the value is present
    //     System.out.println(map.containsKey(1));

    //     System.out.println(map.put(1, "Mohit"));

    //     System.out.println(map.get(12.2));  //returns values of the key

    //     Set x = map.entrySet();
    //     System.out.println(x+" ");  //converts all entries of map to set interface

    //     Set k = map.keySet();
    //     System.out.println(k+" ");  //prints only keys

    //     Iterator itr= k.iterator();
    //     while(itr.hasNext()){
    //         System.out.println(itr.next());
    //     }
    //}

        



// Q. WAJP to manage employee salary details using map.
	//1. add atleast 6 employee records 
	//2. print only those employees whose salary  is greater than 50000


        public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap();
        hm.put(1,40000);
        hm.put(2, 50000);
        hm.put(3,80000);
        hm.put(4,76000);
        hm.put(5,78566);
        Iterator itr=hm.keySet().iterator(); 
        while(itr.hasNext()){
            Integer key = (Integer) itr.next();
            Integer salary = hm.get(key);
            if(salary > 50000){
                System.out.println("Employee " + key + ": " + salary);
            }
        }
    }
            

    }


    
