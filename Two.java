package mypackage;

public class Two {
    private int age;
    private String city;
    private boolean isActive;

    public Two(int age, String city, boolean isActive) {
        this.age = age;
        this.city = city;
        this.isActive = isActive;
    }

    public void voidMethod() {
        // Довільна логіка, що використовує значення змінних екземпляра класу
        System.out.println("Void method in Two class");
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Is Active: " + isActive);
    }

    public double typedMethod() {
        // Довільна логіка, що використовує значення змінних екземпляра класу
        double result = Math.sqrt(age) * 2.5;
        System.out.println("Typed method in Two class");
        System.out.println("Result: " + result);
        return result;
    }

    public void otherMethod(Three obj) {
        // Метод, що приймає екземпляр іншого класу в якості параметру
        // і використовує його для виконання додаткової логіки
        System.out.println("Other method in Two class");
        System.out.println("Color: " + obj.getColor());
        System.out.println("Is Available: " + obj.isAvailable());
    }

    public void dynamicMethod(int... numbers) {
        // Метод, що приймає параметри динамічної довжини
        System.out.println("Dynamic method in Two class");
        System.out.println("Received numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}