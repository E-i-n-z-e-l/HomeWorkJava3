/*
Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TaskJava1 {
    public static void main(String[] args) {
        String[] arraysStringAndInteger = {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"};
        ArrayList<String> stringAndInteger = new ArrayList<>();
        stringAndInteger.addAll(Arrays.asList(arraysStringAndInteger));
        System.out.println(stringAndInteger);
        for (int i = 0; i < stringAndInteger.size(); i++) {
            if (stringAndInteger.get(i).matches("\\d+")) {
                stringAndInteger.remove(i); // удаляем элемент, если он целое число
                i--; // уменьшаем индекс, чтобы не пропустить следующий элемент после удаления
            }
        }
        System.out.println(stringAndInteger);
    }
}
/*
.get(i) - позволяет проходиться по списку;
matches("\\d+") - ищет числа в списке;
*/
