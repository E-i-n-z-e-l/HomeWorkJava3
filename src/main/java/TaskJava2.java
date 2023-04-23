/*
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего
списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры(можно через консоль).
Пример:
"Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
"Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
"Детектив", "Десять негритят".
"Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaskJava2 {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 2;
        List<ArrayList<String>> library = new ArrayList<>(rows);
        for (int i = 0; i < rows; i++) {
            ArrayList<String> innerList = new ArrayList<>(columns);
            for (int j = 0; j < columns; j++) {
                innerList.add(" ");
            }
            library.add(innerList);
        }

//        for (List<String> innerList : library) {
//            for (String element : innerList) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
//
//        library.get(0).set(1, "Какая-то фигня");
//
//        for (List<String> innerList : library) {
//            for (String element : innerList) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }

        addBooks(library, new String[]{"Фантастика:\t\t\t", "Марсианин\t\t\t", "Ангелы и демоны\t\t\t", "Гарри Поттер"});
        addBooks(library, new String[]{"Классика:\t\t\t", "Война и мир\t\t", "Анна Каренина\t\t"});
        addBooks(library, new String[]{"Детектив:\t\t\t", "Десять негритят\t\t"});
        addBooks(library, new String[]{"Фантастика:\t\t\t", "Хроники Нарнии\t\t", "Грозовой перевал"});

        for (List<String> innerList : library) {
            for (String element : innerList) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void addBooks(List<ArrayList<String>> catalog, String[] bookData) {
        // Получаем название жанра из первого элемента массива
        String genre = bookData[0];

        // Создаем новый внутренний список и заполняем его названиями книг
        ArrayList<String> books = new ArrayList<>();
        for (int i = 1; i < bookData.length; i++) {
            books.add(bookData[i]);
        }
        // Добавляем название жанра в начало списка книг
        books.add(0, genre);
        // Добавляем внутренний список в двумерный список
        catalog.add(books);
    }
}
