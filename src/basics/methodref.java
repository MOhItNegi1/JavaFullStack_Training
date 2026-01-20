

/*
Method Reference:
    method reference is just a shortcut for a lambda that only calls an existing method.
    If a lambda expression contains only one statement and that statement simply calls an existing method,
    then a method reference can be used instead of the lambda.


*/
 package basics;
    
    import java.util.Arrays;
    import java.util.List;
    
    // ...existing code...
    @FunctionalInterface
    interface F12{
        int add(int a,int b);
    }
    
    public class methodref {
        public static void main(String[] args) {
            F12 obj1= (a,b)-> a+b;
            System.out.println("Using lambda function exp: "+obj1.add(20,30));
    
            F12 obj2= Integer :: sum;
            System.out.println("Using method reference: "+obj2.add(10,20));
            
            List<String> names=Arrays.asList("kabir","nitish","mohit");
            System.out.println("\nNames: "+names);
            System.out.println("using lambda function: ");
            names.forEach(name-> System.out.println(name));
            System.out.println("using method reference ");
            names.forEach(System.out::println);
    
        }
        
    }
    

