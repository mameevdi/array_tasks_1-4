import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1_2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static void task1_2 () {
        System.out.println("Задача 1-2"); //(зад. 1) объявить три массива и (зад. 2) вывести все их значения через запятую
        int [] integerArray = new int [6]; //целочисленный массив
        integerArray[0] = 7;
        integerArray[1] = 2;
        integerArray[2] = 3;
        integerArray[3] = 5;
        integerArray[4] = 4;
        integerArray[5] = 6;
        double [] doubleArray = {1.57, 7.654, 9.986}; //вещественный массив
        boolean[] booleanArray = new boolean[2]; // логический массив
        booleanArray[0] = true;
        booleanArray[1] = false;

        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i]);
            if (i < integerArray.length-1){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length-1){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.print(booleanArray[i]);
            if (i < booleanArray.length-1){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    public static void task3 () { //вывести на отдельной строчке элементы каждого массива в обратном порядке
        System.out.println("Задача 3");
        int [] integerArray = new int [6]; //целочисленный массив
        integerArray[0] = 7;
        integerArray[1] = 2;
        integerArray[2] = 3;
        integerArray[3] = 5;
        integerArray[4] = 4;
        integerArray[5] = 6;
        double [] doubleArray = {1.57, 7.654, 9.986}; //вещественный массив
        boolean[] booleanArray = new boolean[2]; // логический массив
        booleanArray[0] = true;
        booleanArray[1] = false;
        for (int i = integerArray.length-1; i >= 0; i--) {
            System.out.print(integerArray[i]);
            if (i > 0){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = doubleArray.length-1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = booleanArray.length-1; i >= 0; i--) {
            System.out.print(booleanArray[i]);
            if (i > 0){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
    public static void task4 () {
        System.out.println("Задача 4"); //все нечетные числа сделайть четными
        int [] integerArray = new int [6]; //целочисленный массив
        integerArray[0] = 7;
        integerArray[1] = 2;
        integerArray[2] = 3;
        integerArray[3] = 5;
        integerArray[4] = 4;
        integerArray[5] = 6;
        for (int i = 0; i < integerArray.length; i++) {

            if (integerArray[i]%2 != 0){
                integerArray[i]=integerArray[i]+1;

            }
        }
        System.out.println(Arrays.toString(integerArray));
    }
}