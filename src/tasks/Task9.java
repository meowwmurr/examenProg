package tasks;

import java.lang.reflect.Array;
import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> l = cin(new ArrayList<>());
        List<Integer> l2 = cin(new ArrayList<>());
        System.out.print("Элементы представленые по 1 разу");
        System.out.print(inList1NotInList2(l, l2));
    }

    public static List<Integer> inList1NotInList2(List<Integer> list1, List<Integer> list2){
        Collections.sort(list1);
        Collections.sort(list2);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++){ // элементы которые в 1 листе, но не во 2
            if(!list2.contains(list1.get(i))){
                list.add(list1.get(i));
            }
        }
        for(int i = 0; i < list2.size(); i++){ // элементы которые во 2 листе, но не во 1
            if(!list1.contains(list2.get(i))){
                list.add(list2.get(i));
            }
        }
        // Используем Set для удаления дубликатов
        Set<Integer> uniqueSet = new HashSet<>(list);

        // Преобразуем обратно в List
        return new ArrayList<>(uniqueSet);
    }

    public static List<Integer> cin(List<Integer> list){
        System.out.print("Введите кол-во элементов списка: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Введите элементы списка: ");
        for(int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }
}
