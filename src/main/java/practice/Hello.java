package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        //HomeWork work = new HomeWork();
        //System.out.println(work.word0(new String[] {"a", "b", "a", "c", "b"}));
        //System.out.println(work.wordLen(new String[] {"this", "and", "that", "and"}));
        //System.out.println(Arrays.toString(work.fizzArray(5)));
        //System.out.println(work.countHi("hihi"));
//        System.out.println(work.loneSum(1, 2, 3));
//        int a = 3;
//        int b = 2;
//        int c = 3;
//        System.out.println(String.format("loneSum(%d, %d, %d) -> %d", a, b, c, work.loneSum(a, b, c)));

//        LearnException exception = new LearnException();
//        exception.testException();
//        exception.sum();
//        exception.multiplication();
//        LearnEnum test = new LearnEnum(Day.valueOf("SATURDAY"));
//        test.dayIsLike();

//        MountainBike mb = new MountainBike(3, 20, 15);
//        System.out.println(mb.displayInformation());
//        mb.applyBreak(5);
//        System.out.println(mb.displayInformation());
//        mb.speedUp(10);
//        mb.setHeight(20);
//        System.out.println(mb.displayInformation());
//        Sum s = new Sum();
//        System.out.println(s.sum(10, 20));
//        System.out.println(s.sum(10, 20, 40));
//        System.out.println(s.sum(10.15, 56.12));

//        Parent p = new Parent();
//        p.show();
//        Child child = new Child();
//        child.show();

//        Encapsulate obj = new Encapsulate();
//        obj.setAge(20);
//        obj.setName("John");
//        obj.setRoll(50);
//
//        System.out.println("Name is: " + obj.getName());
//        System.out.println("Age is: " + obj.getAge());
//        System.out.println("Roll is: " + obj.getRoll());

//        Pig obj = new Pig();
//        obj.animalSound();
//        obj.sleep();

        Exam exam = new Exam();
        System.out.println(exam.search(6, new Integer[] {1,2}));
//        System.out.println(exam.sumsToTarget(new Integer[] {-1, 4, 2, 1}, 5));
//        List<String> list = new ArrayList<>();
//        list.add("ab");
//        list.add("bbb");
//        //list.add("alu");
//        System.out.println(exam.filterStrings(list));
    }
}
