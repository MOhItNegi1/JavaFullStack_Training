package oops.Abstraction;



/*

  Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.


### Explanation:

*Resizable Interface:*
   - The Resizable interface is defined with two methods: resizeWidth(int width) and resizeHeight(int height).

*Rectangle Class:*
   - The Rectangle class implements the Resizable interface.
   - It has private fields width and height to store the dimensions of the rectangle.
   - The class constructor initializes these fields.
   - Getter methods getWidth() and getHeight() are provided to access the dimensions.
   - The resizeWidth and resizeHeight methods are overridden to update the dimensions of the rectangle and print the new dimensions.
   - The toPrint method is to return a string representation of the rectangle's dimensions.

*Main Class:*
   - In the main method, a Rectangle object is created with initial dimensions.
   - The initial dimensions are printed.
   - The resizeWidth and resizeHeight methods are called to change the dimensions.
   - The updated dimensions are printed.


*/



//Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle class implementing Resizable interface
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor to initialize width and height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Getter methods
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Implement resizeWidth method
    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }

    // Implement resizeHeight method
    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }

    // Method to print rectangle dimensions
    public String display() {
        return "Rectangle [Width = " + width + ", Height = " + height + "]";
    }
}



public class rectangle {
        public static void main(String[] args) {
      
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Initial: " + rect.display());

        rect.resizeWidth(30);
        rect.resizeHeight(40);

        System.out.println("Updated: " + rect.display());
    }

}


