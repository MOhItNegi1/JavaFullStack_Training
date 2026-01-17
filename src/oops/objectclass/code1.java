package oops.objectclass;

public class code1 {
    int id;
    String name;
    public code1(int id, String name){
        this.id=id;
        this.name=name;
    }

    public boolean equals(Object obj){
        code1 ref= (code1)obj;
        return this.id==ref.id && this.name==ref.name;
    }
public static void main(String[]args){
    code1 ref1=new code1(1,"Mohit");
    code1 ref2=new code1(1,"Mohit");

    System.out.println("ref1: "+ref1);
    System.out.println("ref1: "+ref2);
    System.out.println(ref1.equals(ref2));  //true 
}    
    
}
