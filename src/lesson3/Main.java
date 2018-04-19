package lesson3;

public class Main {
    public static void main(String[] args) {

//        int x = 1;
//
//        if (x == 1 || x == 2){
//
//        }
//        switch (x){
//            case 1:
//            case 2:
//                System.out.println("Vienetas arba Dvejetas");
//                break;
//            default:
//                System.out.println("Kitas Skaicius");
//        }
        myMethod("dvejetas");
    }

    static int myMethod(int x) {
        switch (x) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 1232;
        }
    }

    static void myMethod(String x) {
        switch (x) {
            case "vienetas1":
                System.out.println("1");
            case "dvejetas":
                System.out.println("2");
                break;
            case "trejetas":
                System.out.println("3");
                break;
            default:
                System.out.println("4");
                break;
        }
    }


}
