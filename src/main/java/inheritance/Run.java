package inheritance;

public class Run {
    public static void main(String[] args) {
        SuperClass superClass = new SubClassA();

        //.out.println(superClass.getClass().getSimpleName());

        superClass = new SubClassB();
        //System.out.println(superClass.getClass().getSimpleName());

        System.out.println(new SubClassA().type);
    }
}
