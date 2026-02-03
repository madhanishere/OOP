public class Inheritance {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj.w);
    }
}

class A {
    int w;

    A(int w) {
        this.w = w;
    }
}

class B extends A {
    int l;

    B(int w) {
        super(w);      // calls A constructor
        this.l = l;
    }
}

class C extends B {
    int b;

    C() {
        super(20); // passes values to B → A
        this.b = 20;
    }
}
