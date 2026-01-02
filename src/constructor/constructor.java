package constructor;

public class constructor {
    int id;
    String name;

    public constructor(int id, String name){
        this.id=id;
        this.name=name;
    }
    public constructor(constructor obj){
        this.id=obj.id;
        this.name=obj.name;


    }

    public static void main(String[] args) {
        System.out.println("main start");
        constructor ref1=new constructor(1,"rohit");
        System.out.println(ref1.id);
        System.out.println(ref1.name);

        System.out.println("after copy constructor");
        constructor ref2= new constructor(ref1);
        System.out.println(ref2.id);
        System.out.println(ref2.name);

    }
    
}
