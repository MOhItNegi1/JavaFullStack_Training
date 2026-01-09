package oops.upcastdowncast;

class level1 {
    void a() {
        System.out.println("I am Level 1 ");
    }
}

class level2 extends level1 {
    void b() {
        System.out.println("I am Level 2");
    }
}

class level3 extends level2 {
    void c() {
        System.out.println("I am Level 3 ");
    }
}

class level4 extends level3 {
    void d() {
        System.out.println("I am Level 4 ");
    }
}

public class candycrush {
    public static void main(String[] args) {

        // upcast
        level1 l1 = new level4();  

       // l1.d();    compile time error :can only access level1 or the parent class or super class
        l1.a();
        // downcast
        level4 l4 = (level4) l1;
        l4.a();
        l4.b();
        l4.c();
        l4.d();
    }
}
