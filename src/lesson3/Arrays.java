package lesson3;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//1
        int[] arr = {1,3,4};
        for (int i : arr) {
            System.out.println(i);
        }
//2
        int[] arr1 = {1,66,2,8,33,5,2};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        System.out.println(arr1[5]);
        System.out.println(arr1[6]);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr[i]);
        }

        int sum = getArrSum(arr1);

        double average = (double)sum/arr1.length;

        int min1 = getArrayMin(arr1);
        int max1 = getArrayMax(arr1);
//3
        int[] arr2 = {1,2,5};
        int[] arr2Copy = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr2Copy[i] = arr2[i];
        }

//4-5
        Scanner sc = new Scanner(System.in);
        System.out.println("Kokio dydzio masyvas?");
        int input = sc.nextInt();
        int[] newArr = new int[input];

        for (int i = 0 ; i < input; i++){
            System.out.printf("Ivesti masyvo %d nari", i+1);
            int arrItem = sc.nextInt();
            newArr[i] = arrItem;
        }
        System.out.println("Masyvo nariai");
        for (int i : newArr) {
            System.out.println(i);
        }
        System.out.println("Suma");
        System.out.println(getArrSum(newArr));
        System.out.println("Vidurkis");
        double newAverage = (double) getArrSum(newArr)/newArr.length;
        System.out.println(newAverage);
        System.out.println("Sandauga");
        int multiplication = multiplyArr(newArr);
        System.out.println(multiplication);
//6
        boolean equal = arraysEqual(arr, arr1);
//7
        boolean repeat = true;
        int numCount = 0;
        System.out.println("Vesti skaicius");
        while(repeat){
            int num = sc.nextInt();
            numCount++;
            if (num == -1){
                repeat = false;
            }
        }
        System.out.printf("Ivesta %d skaciu\n", numCount);
//8
        int index = findIndex(arr2, 34);
//9
        String arrayString = toStringArray(arr2);

    }

    private static String toStringArray(int[] arr2) {
        String result = "";
        for (int i : arr2) {
            result+= Integer.toString(i) + ",";
        }
        return result;
    }

    private static int findIndex(int[] arr2, int x) {
        int result = -1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == x){
                result = i;
                break;
            }
        }

        return result;
    }

    private static boolean arraysEqual(int[] arr, int[] arr1) {
        if (arr.length != arr1.length){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]){
                return false;
            }
        }

        return true;
    }

    private static int multiplyArr(int[] newArr) {
        int result = newArr[0];
        for (int i : newArr) {
            result*=i;
        }
        return result;
    }

    private static int getArrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int getArrayMin(int[] arr1) {
        int min = arr1[0];
        for (int item: arr1) {
            if (min > item){
                min = item;
            }
        }
        return min;
    }

    private static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int item : arr) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }
}
