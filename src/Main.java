public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
    }

    public static void task1_2 () {
        System.out.println("Задача 1-2"); //(зад. 1) объявить три массива и (зад. 2) вывести все их значения через запятую
        int [] integerArray = new int [3]; //целочисленный массив
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
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
        int [] integerArray = new int [3]; //целочисленный массив
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
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
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 2
    }
}