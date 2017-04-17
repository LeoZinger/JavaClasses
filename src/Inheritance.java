/**
 * Created by leo.zinger on 4/17/17.
 */
abstract class Inheritance {
    public Inheritance(){
        System.out.println("class Inheritance - abstract base class constructor");
    }
    void methodA(){
        System.out.println("abstract base class");
    }
}

class A extends Inheritance
{
    public A()
    { /* ... */
        System.out.println("class A: myMethod");
    }
}

class B extends A
{
    public B()
    { /* ... */
        System.out.println("class B: myMethod");
    }
}

class C extends B
{
    public C()
    { /* Another code */
        System.out.println("class C: myMethod");
        //super.myMethod();
    }

    public static void main (String s[]){
        C c = new C();
    }
}