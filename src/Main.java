import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 44, 7, 6, 12, 89);//numlist #1


        System.out.println(ifNumber(numbers,33));//task #1


        System.out.println(index(numbers,33));//task#2


        List<Product> productList = new ArrayList<>();//task #3
        productList.add(0,new Product(0,"iphone",1000));
        productList.add(1,new Product(1,"android",500));
        productList.add(2,new Product(2,"xiaomi",200));
        System.out.println("Here are our products:");
        for (Product product : productList) {
            System.out.println(product);
        }
        List<Integer> ints = getIntsFromScanner();
        List<Product> bucket = addToBucket(ints, productList);

        System.out.println("Your selected products:");
        for (Product product : bucket) {
            System.out.println(product);
        }


    }

    public static List<Integer> getIntsFromScanner() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        while (true) {
            System.out.println("Enter product number or 0 to exit ");
            int number = scanner.nextInt();
            if (number == 0) {
                return result;
            } else if (number > 0 && number <= 2) {
                System.out.println(result.add(number));
            } else {
                System.out.println("incorect");
            }
        }
    }

    public static List<Integer> ifNumber(List<Integer> numbers, int value) {// task #1
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number > value) {
                result.add(number);
            }
        }
        return result;
    }
    public static List<Integer> index(List<Integer> numbers, int value) {//task #2
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number > value) {
                result.add(numbers.indexOf(number));
            }
        }
        return result;
    }

    public static List<Product> addToBucket(List<Integer> bucket, List<Product> products) {//task #3
        List<Product> bucketList = new ArrayList<>();
        for (int number : bucket) {
            for (Product product : products) {
                if (product.getNumber() == number) {
                    bucketList.add(product);
                }
            }
        }
        return bucketList;
    }
}