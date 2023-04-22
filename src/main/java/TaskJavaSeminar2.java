/*
Задача 2. Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
Это Задание 3 из Домашнего задания: (3. Доделать задание 2.2 участникам семинара)
 */


import java.util.ArrayList;
import java.util.Random;

public class TaskJavaSeminar2 {
    public static void main(String[] args) {
        String[] planetNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"}; // дан список планет
        ArrayList<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            randomSolarSystem.add(planetNamesStringArray[random.nextInt(planetNamesStringArray.length)]); // в рандомном порядке заполняем список названиями планет
        }
        System.out.println(randomSolarSystem);

        for (int i = 0; i < randomSolarSystem.size(); i++) {
            String element = randomSolarSystem.get(i);
            if (randomSolarSystem.indexOf(element) != i) { // // если элемент повторяется
                randomSolarSystem.remove(i); // удаляем его
                i--; // уменьшаем счетчик, чтобы не пропустить следующий элемент
            }
        }
        System.out.println(randomSolarSystem);
    }

}
