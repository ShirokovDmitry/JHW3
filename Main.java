// 1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел. 
// Удалить из первого списка элементы отсутствующие во втором списке. 
// Отсортировать первый список методом sort класса Collections.
// 2 * Отсортировать второй список методом sort списка и компаратором по уменьшению.
package Java.HW.HW3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(20));
        }
        for (int i = 0; i < 20; i++) {
            list2.add(rnd.nextInt(20));
        }
        
        list.forEach(n -> System.out.print(n+" "));
        System.out.println();
        list2.forEach(n -> System.out.print(n+" "));
        System.out.println();
        // list.removeAll(list2);
        list.retainAll(list2);
        list.forEach(n -> System.out.print(n+" "));
        System.out.println();

        list.sort(new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1) {
                return t0 - t1;

            }
        });
        System.out.println(list);

        list2.sort(new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1) {
                return t1 - t0;

            }
        });
        System.out.println(list2);
    }    
}
