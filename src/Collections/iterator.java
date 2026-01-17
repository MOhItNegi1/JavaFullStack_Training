package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iterator {
    public static void main(String[] args) {
        String[]a={"Surav","mohit","rohan","ravi"};
        List<String> al=new ArrayList<String>();
        for(String i: a){
            al.add(i);
        }
        System.out.println(al);
        ListIterator<String> ltr=al.listIterator();
        // System.out.println(ltr.hasPrevious());  
        // System.out.println(ltr.previous());   No such element exception
        System.out.println("==forward==");
        while(ltr.hasNext()){
            System.out.println(ltr.next());

        }
        System.err.println("==backward==");
        while(ltr.hasPrevious()){
            System.err.println(ltr.previous());
        }
System.out.println("=====================================");


        while(ltr.hasNext()){
            System.out.print(ltr.next()+" ");

        }
        System.err.println();
        ltr.remove();

         while(ltr.hasPrevious()){
            ltr.previous();
        }

        while(ltr.hasNext()){
            System.out.print(ltr.next()+"  ");

        }

        System.out.println();
        ltr.remove();

        while(ltr.hasPrevious()){
            ltr.previous();

        }
    
        while(ltr.hasNext()){
            System.out.print(ltr.next()+" ");

        }
        ltr.remove();
        


    }




}



/*
Iterator():
    it is a cursor , it is a interface.
    to activate iterator cursor in a collection we have iterator() method.
    the return type  of iterator() method is iterator interface.

    with the help od this method we can access hasNext(), next() and remove() methods.

    hasNext():
        It is used to check weather next object is present or not.
        retur type is boolean

    next():
        It is used to return the next object of iteration.
        return type is Object;
        
    remove():
    it is used to remove the previous object of iteration.
    which means we can use remove after next() method.
    if try to use remove method before next() method it will throw IllegalStateException
    return type id void.

    with the help of iterator() we can travers only in forwad direction.


*/
