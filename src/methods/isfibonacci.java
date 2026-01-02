package methods;




public class isfibonacci {



    
public void isfibo(int n) {
    if (n == 0 || n == 1) {
        System.out.println("yes");
        return;
    }

    int a = 0;
    int b = 1;
    int c = 0;

    while (c < n) {
        c = a + b;
        a = b;
        b = c;
    }

    if (c == n) {
        System.out.println("yes");
    } else {
        System.out.println("no");
    }
}

    
}
