import java.util.ArrayList;
import java.util.List;

/*
# 1
Допустим, у вас есть List целых чисел. Напишите метод, который формирует List, в котором будут цифры из первого листа, которые больше некоторого заданного значения
Например: дано 10,44, 7, 6,12,89 значение 33  результат: 44, 89


# 2


Допустим, у вас есть List целых чисел. Напишите метод, который формирует List, в котором будут индексы цифр из первого листа, которые больше некоторого заданного значения
Например: дано 10,44,7,6,12,89 значение 33  результат: 1, 5




# 3 Чуть сложнее
Допустим, мы пишем программу для онлайн магазина. Программа выводит на экран список товаров (каждый товар имеет номер, название и цену).
Пользователь, используя сканнер вводит номера товаров, тем самым добавляя их к себе в корзину. Как только пользователь заканчивает ввод (например , вместо номера товара вводит 0) программа выдает список покупок.


 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 44, 7, 6, 12, 89);
        System.out.println(ifNumber(numbers,33));
        System.out.println(index(numbers,33));

    }

    public static List<Integer> ifNumber(List<Integer> numbers, int value) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number > value) {
                result.add(number);
            }
        }
        return result;
    }

    public static List<Integer> index(List<Integer> numbers, int value) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number > value) {
                result.add(numbers.indexOf(number));
            }
        }
        return result;
    }
}