package mypackage;

public class Main {
    public static void main(String[] args) {
        One obj1 = new One(1, 2.5, "Object 1");
        Two obj2 = new Two(20, "New York", true);
        Three obj3 = new Three("Red", 5.3, false);

        obj1.voidMethod();
        obj1.typedMethod(10);
        obj1.otherMethod(obj2);
        obj1.dynamicMethod("Hello", "World");

        obj2.voidMethod();
        obj2.typedMethod();
        obj2.otherMethod(obj3);
        obj2.dynamicMethod(1, 2, 3, 4, 5);

        obj3.voidMethod();
        obj3.typedMethod(3);
        obj3.otherMethod(obj1);
        obj3.dynamicMethod("Java", "is", "awesome");
    }
}