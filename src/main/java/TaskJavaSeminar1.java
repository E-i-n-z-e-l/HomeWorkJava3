/*
Задача 1.
Заполнить список названиями планет солнечной системы в произвольном порядке с повторениями.
Вывести названия каждой планеты с количеством его повторений в списке.
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class TaskJavaSeminar1 {
    public static void main(String[] args) {
        String[] planetNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"}; // дан список планет
        ArrayList<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            randomSolarSystem.add(planetNamesStringArray[random.nextInt(planetNamesStringArray.length)]); // в рандомном порядке заполняем список названиями планет
        }

        randomSolarSystem.sort(Comparator.naturalOrder()); // По алфавиту сортируем список, чтобы планеты шли по порядку(алфавитному)

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < planetNamesStringArray.length; i++) {
            count = 0;
            for (String item : randomSolarSystem) {
                if (item.equals(planetNamesStringArray[i]))
                    count++;
            }
            sb.append(planetNamesStringArray[i]).append(" :").append(count).append("\n");
        }
        System.out.println(sb);
    }
}
