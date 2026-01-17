package oops.Abstraction;


interface  Father {
    abstract public void test();
    abstract public int add(int a, int b);

    
}

class son implements Father{
    @Override
    public void test(){
        System.out.println("Abstract method override");
    }
    @Override
    public int add(int a,int b){
        return a+b;
    }
}

public class a1 {
    public static void main(String[]args){
        System.out.println("Main Start");
//        Father ref = new Father();  CTE cannot instantiate the type father
        Father ref = new son();
        ref.test();
        System.out.println(ref.add(10,20));
        System.out.println("Main End ");
    }

    
}



