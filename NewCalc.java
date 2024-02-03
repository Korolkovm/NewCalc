

import java.io.FileNotFoundException;        // Корольков Максим Витальевич
import java.util.Scanner;



public class NewCalc {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение (Вам доступны числа от 1 до 10): ");
        String expression = scanner.nextLine();


        expression = expression.replaceAll("\\s", ""); //  "\\s";  шаблон для поиска символов пробела

        // Поиск оператора в выражении
        char operator = ' ';
        if (expression.contains("+")) {
            operator = '+';
        } else if (expression.contains("-")) {
            operator = '-';
        } else if (expression.contains("*")) {
            operator = '*';
        } else if (expression.contains("/")) {
            operator = '/';
        }


        String[] numbers = expression.split("[+\\-*/]");  //split разделяем строку


        int num1 = Integer.parseInt(numbers[0]);      // преобразуем строку в числе с помощью parseInt
        if (num1 < 1 || num1 > 10) {                // задал допустимые значения от 1 до 10 на ввод для пользователя( решил вместо  (&& и) ввести (|| или))
                System.out.println("Неккоректно. Введите число от 1 до 10:");
                return;
        }


        int num2 = Integer.parseInt(numbers[1]);
        if (num2<1 || num2>10) {
            System.out.println("Неккоректно. Введите число от 1 до 10:");
            return;
        }

        int result = 0;                   // применил оператор switch для подсчета результата
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                break;
            default:
                System.out.println("Некорректный оператор");
                return;
        }

        // Вывод конечного рузультата пользователя
        System.out.println("Результат: " + result);
    }
}