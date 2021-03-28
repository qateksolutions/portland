package practice;

public class Child extends Parent{
    @Override
    public void show() {
        super.show();
        System.out.println("Child show()");
    }
}
