import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    JSONReadFromFile readFromFile = new JSONReadFromFile();
    String json = readFromFile.readFile("D:/Learning/JAVA/itacademy/course_project/properties.json");

}
    /*
    Вывод товаров
    Сортировка по имени (по умолчанию)
    Сортировка по цене
            Поиск
    По имени
    По диапазону цен
    Статистика и поиск
    Товары, поступившие в течение последней недели
    Поиск похожих товаров для выбранного
    Вывод средних оценок производителей*/

