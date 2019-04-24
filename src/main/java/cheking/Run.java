package cheking;

import java.util.Objects;

public class Run {

    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        System.out.println(testClass.getFieldOne());

        testClass.setFieldOne(1);
        System.out.println(testClass.getFieldOne());

        testClass.process(testClass.getFieldOne());
        System.out.println(testClass.getFieldOne());

        Object o;
        Objects objs;

    }
}
