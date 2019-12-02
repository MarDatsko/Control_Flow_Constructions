package com.homework_2;

public class OrdinaryArray {
    public static void main(String[] args) {
        Integer[] simpleArray = {3, 4, 1, 2, 11};
        Integer[] hardArray = {3, 2, 3, 1, 4, 2, 8, 3};

        System.out.print("Initial array : ");
        printArray(simpleArray);
        sortInReverseOrder(simpleArray);
        addPositiveNumbers(simpleArray);
        showAverageValue(simpleArray);

        System.out.print("Initial array : ");
        printArray(hardArray);
        replaceDuplicateValues(hardArray);
    }

    private static void sortInReverseOrder (Integer[] array) {
        for (int i = 0; i < array.length; ++i) {
            Integer max = array[i];
            for (int j = i; j < array.length; ++j) {
                if (array[j] > max) {
                    max = array[j];
                    array[j] = array[i];
                }
                array[i] = max;
            }
        }
        System.out.print("\n" + "After sorted in descending order  : ");
        printArray(array);
    }

    private static void addPositiveNumbers(Integer[] array) {
        int result = 0;
        for (int i = 0; i < array.length; ++i) {
            if ((array[i] % 2) == 0) {
                result += array[i];
            }
        }
        System.out.println("\n" + "Result of the sum all positive numbers : " + result);
    }

    private static void showAverageValue(Integer[] array) {
        double result = 0.0d;
        for (int i = 0; i < array.length; ++i) {
            result += array[i];
        }
        result /= array.length;
        System.out.println("Average value of the array : " + result);
    }

    private static void replaceDuplicateValues(Integer[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i].equals(array[j])) {
                    array[j] = 0;
                }
            }
        }
        System.out.print("\n" + "After replacing duplicate values  : ");
        printArray(array);
    }

    private static void printArray(Integer[] array) {
        for (Integer item : array) {
            System.out.print(item + " ");
        }
    }
}