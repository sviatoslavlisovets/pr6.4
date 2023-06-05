package mypackage;

public class One {
    private int number;
    private double value;
    private String name;

    public One(int number, double value, String name) {
        this.number = number;
        this.value = value;
        this.name = name;
    }

    public void voidMethod() {
        // Довільна логіка, що використовує значення змінних екземпляра класу
        System.out.println("Void method in One class");
        System.out.println("Number: " + number);
        System.out.println("Value: " + value);
        System.out.println("Name: " + name);
    }

    public int typedMethod(int parameter) {
        // Довільна логіка, що використовує значення змінних екземпляра класу та параметр
        int result = number + (int) value + parameter;
        System.out.println("Typed method in One class");
        System.out.println("Result: " + result);
        return result;
    }

    public void otherMethod(Two obj) {
        // Метод, що приймає екземпляр іншого класу в якості параметру
        // і використовує його для виконання додаткової логіки
        System.out.println("Other method in One class");
        System.out.println("City: " + obj.getCity());
        System.out.println("Is Active: " + obj.isActive());
    }

    public void dynamicMethod(String... strings) {
        // Метод, що приймає параметри динамічної довжини
        System.out.println("Dynamic method in One class");
        System.out.println("Received strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}