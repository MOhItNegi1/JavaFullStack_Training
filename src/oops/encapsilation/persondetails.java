package oops.encapsilation;


/*
Q1. Write a Java program to create a class called Person with private instance variables name, age. and country.
 Provide public getter and setter methods to access and modify these variables.
*/



class person{
    private String name;
    private int age;
    private String country;


    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public String getcountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }



}

public class persondetails {
    public static void main(String[] args) {
        person p1=new person();

        p1.setname("Mohit");
        p1.setage(22);
        p1.setCountry("India");

    }

    
}
