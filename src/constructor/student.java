package constructor;

public class student {
    int id;
    String name;
    int marks[]=new int[3];

    public student(int id, String name,int marks[]){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public student(student obj){
        this.id=obj.id;
        this.name=obj.name;
        this.marks=new int[obj.marks.length];
        for (int i=0;i<obj.marks.length;i++){
            this.marks[i]=obj.marks[i];
        }

    }

    public static void main(String[] args) {
        int []arr={50,67,35};
        student s1=new student(1,"mohit",arr);
        student s2=new student(s1);
        s2.marks[0]=55;
        s2.marks[1]=100;
        s2.marks[2]=99;
        int []arr1={65,77,44};
        student s3=new student(3,"negi",arr1);
        System.out.println("student 1 ");
        System.out.println(s1.id);
        System.out.println(s1.name);
        for(int x:s1.marks){
            System.out.println(x);
        }

        System.out.println("student 2 ");
        System.out.println(s2.id);
        System.out.println(s2.name);
        for(int x:s2.marks){
            System.out.println(x);
        }


        
    }
    
}
