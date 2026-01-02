package constructor;

public class laptop {
    // instance variable 
    String brand;
    int  ramSize;
    double price;

    public laptop(){
        brand="Unknown";
        ramSize=8;
        price=50000.0;

    }

    public laptop( String brand){
        this();
        this.brand=brand;

    }
    public laptop(String brand, int ramSize){
        this(brand);
        this.ramSize=ramSize;

    }
    public laptop(String brand, int ramSize, double price){
        this.brand=brand;
        this.price=price;
        this.ramSize=ramSize;
    }

    public static void main(String[] args) {
        
        laptop ref1= new laptop("lenovo");
        System.err.println(ref1.brand);
    }



    
}
