package bitwise;

public class BitOperations {

    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        //System.out.println(Integer.toBinaryString(a));  //  without leading zeros
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));  //  with leading zeros
        System.out.println(String.format("%8s", Integer.toBinaryString(-a)).replace(' ', '0'));

        System.out.println("wrong middle of diapason: " + (( 2147483640+ 2147483644) >> 1));
        System.out.println("wright middle of diapason: " + (( 2147483640+ 2147483644) >>> 1));

        Integer a1 = 50;
        Integer a2 = 50;
        Integer b1 = 128;
        Integer b2 = 128;
        System.out.println(a1==a2);
        System.out.println(b1==b2);

    }

}
