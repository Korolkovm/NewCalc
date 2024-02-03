import java.io.FileNotFoundException;
import java.util.Scanner;



public class NewCalc1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение (Вам доступны числа от 1 до 10): ");
        String expression = scanner.nextLine();


        expression = expression.replaceAll("\\s", ""); //  "\\s"; // шаблон для поиска символов пробела

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


        int num1 = Integer.parseInt(numbers[0]);      // ввел целочисленную переменную
        if (num1 < 1 || num1 > 10) {// задал допустимые значения от 1 до 10 на ввод для пользователя( решил вместо  (&& и) ввести (|| или))
            throw new Exception("Введите число от 1 до 10");
        }


        int num2 = Integer.parseInt(numbers[1]);
        if (num2<1 || num2>10) {
            throw new Exception("Введите число от 1 до 10");
        }

        int result = 0;                   // применил оператор switch подсчета результата
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