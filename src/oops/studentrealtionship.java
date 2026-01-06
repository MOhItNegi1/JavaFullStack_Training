package oops;

// HAS -A relationship :    Aggregation 
class Address{
    String city;
    String state;
    public Address(String city,String state){
        this.city=city;
        this.state=state;
    }
    public void display_address(){
        System.out.println("CITY: "+this.city);
        System.err.println("STATE: "+this.state);
    }

}

class Student{
    int id;
    String name;
    double marks;
    Address address;

    public Student(int id, String name, double marks,Address address ){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.address=address;

    }






}


public class studentrealtionship {

    
}
