package miniPrograms;

public class BitwiseOperation {
    public static void main(String args[])
    {
        int x = 50;
        System.out.println(Integer.toBinaryString(x));
        int y = x << 2;
        System.out.println("y: " + y);
        x += y + 1;
        System.out.println("x: " + x);

        int xx = -50;
        System.out.println(Integer.toBinaryString(xx));
        int yy = xx >> 2;
        System.out.println("yy: " + yy);
        System.out.println(Integer.toBinaryString(yy));

        int xxx = -50;
        xxx /= 4;
        System.out.println("xxx: " + xxx);
        System.out.println(Integer.toBinaryString(xxx));
        System.out.println(Double.valueOf("NaN"));
    }
}


