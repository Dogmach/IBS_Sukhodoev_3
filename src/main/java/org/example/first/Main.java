package org.example.first;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[20];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(-10, 10);
            System.out.print(ar1[i] + ", ");
        }

        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] < 0 && ar1[i] > maxNegative) {
                maxNegative =ar1[i];
            } else if (ar1[i] > 0 && ar1[i] < minPositive) {
                minPositive = ar1[i];
            }
        }

        System.out.println(" ");
        System.out.println("Минимальный положительный элемент в массиве: " + minPositive);
        System.out.println("Максимальный отрицательный элемент в массиве " + maxNegative);
        System.out.println();
        System.out.println("Смена найденных значений MIN и MAX в массиве: ");
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] == maxNegative) {
                ar1[i] = minPositive;
            } else if (ar1[i] == minPositive) {
                ar1[i] = maxNegative;
            }
        }
        System.out.println(Arrays.toString(ar1));
    }
}
