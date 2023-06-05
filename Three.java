package mypackage;

public class Three {
    private String color;
    private double weight;
    private boolean isAvailable;

    public Three(String color, double weight, boolean isAvailable) {
        this.color = color;
        this.weight = weight;
        this.isAvailable = isAvailable;
    }

    public void voidMethod() {
        // Довільна логіка, що використовує значення змінних екземпляра класу
        System.out.println("Void method in Three class");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Is Available: " + isAvailable);
    }

    public int typedMethod(int parameter) {
        // Довільна логіка, що використовує значення змінних екземпляра класу та параметр
        int result = (int) (weight * parameter);
        System.out.println("Typed method in Three class");
        System.out.println("Result: " + result);
        return result;
    }

    public void otherMethod(One obj) {
        // Метод, що приймає екземпляр іншого класу в якості параметру
        // і використовує його для виконання додаткової логіки
        System.out.println("Other method in Three class");
        System.out.println("Value: " + obj.getValue());
        System.out.println("Name: " + obj.getName());
    }

    public void dynamicMethod(String... strings) {
        // Метод, що приймає параметри динамічної довжини
        System.out.println("Dynamic method in Three class");
        System.out.println("Received strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}