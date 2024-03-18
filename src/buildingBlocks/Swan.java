package buildingBlocks;

public class Swan {
    int eggs = 1;
    String bName;
    public Swan() {
        bName = "b1";
    }
    public static void main(String[] args) {
        Swan m1 = new Swan();
        Swan m2 = new Swan();
        m1.eggs = 2;
        m2.bName = "b2";
        System.out.println("m1's eggs: " + m1.eggs + ", m1's baby: " + m1.bName);
        System.out.println("m2's eggs: " + m2.eggs + ", m2's baby: " + m2.bName);
    }

}
