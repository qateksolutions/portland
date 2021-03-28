package practice;

public class Variables {

    protected int salary = 1002;

    protected void intVariables() {
        adamSalary();
        System.out.println("My salary is: " + salary);
    }

    void adamSalary() {
        System.out.println("Adam salary is: " + salary);
    }

    void davidSalary() {
        System.out.println("David salary is: " + salary);
    }

    public void floatVariables() {
        float price = 45.6f;
        System.out.println("Product price is: " + price);
    }

    public void booleanVariables() {
        boolean red = true;
        boolean green = false;
        System.out.println("Red light is: " + red + " Green light is: " + green);
    }

    public void characterVariables() {
        char alphabet = 'A';
        System.out.println("Alphabet is: " + alphabet);
    }

    public void stringVariables() {
        String name = "Robin";
        String city = "Philadelphia";
        System.out.println("My name is: " + name + " I live in: " + city);
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

}
