package lesson8.examples;

public class Watch {

    private static int count;
    private int nonStaticCount;

    public Watch() {
        count++;
        nonStaticCount++;
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getCount() {
        return count;
    }

    public static void test(int a, int b){
        System.out.println("test");
    }
}
