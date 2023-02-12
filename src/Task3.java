package homework3;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.round;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(-50, 50);
            list1.add(val);
        }
        System.out.printf("Заданный список %s\n", list1);
        int max = max(list1);
        int min = min(list1);
        int maxItem = list1.get(0);
        int minItem = list1.get(0);
        int sumItems = 0;
        for (int item : list1) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/list1.size();

        System.out.printf("Найдено максимальное: %s\n", maxItem);

        System.out.printf("Найдено минимальное: %s\n", minItem);

        System.out.printf("Найдено среднее арифметическое: %s\n", average);
    }
}