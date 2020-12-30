package ru.geekbrains.lesson2;

public class LessonsTwo {

    public static void replacement() {

        int arr1[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else if (arr1[i] == 0) {
                arr1[i] = 1;
            }
            System.out.print(arr1[i]);

        }
        System.out.println();
    }

    public static void fill() {

        int arr2[] = new int[8];
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i - 1] + 3;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }

        System.out.println();
    }

    public static void choice() {

        int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i]);
        }
        System.out.println();
    }


    public static void square() {

        int arr4[][] = new int[3][3];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(" " + arr4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void numberMinMax() {
        int arr5[] = {2, 4, 5, 6};
        int min = arr5[0], max = arr5[0];
        int imin = 0;
        int imax = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < min) {
                min = arr5[i];
                imin = i;
            } else if (arr5[i] > max) {
                max = arr5[i];
                imax = i;
            }
        }
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
    }


    private static boolean compare(int[] arr6) {

        int sumLeft = 0;
        int sumRigth = 0;
        int summ = 0;

        for (int i = 0; i < arr6.length; i++) {
            summ += arr6[i];
        }
        for (int i = 0; i < arr6.length; i++) {
            sumLeft += arr6[i];
            sumRigth = summ - sumLeft;
            if (sumLeft == sumRigth) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        replacement();
        fill();
        choice();
        square();
        numberMinMax();
        System.out.println(compare(new int[]{1, 1, 1, 2, 1}));
    }
}



