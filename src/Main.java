import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    /*
    First level: 1. Дан массив размера  N-1  , который должен содержать только целые числа в диапазоне от  1 до N .
    Каждое число представлено в одном экземпляре, кроме одного числа.  Найдите недостающий элемент.
    Вход:
    N = 10
    А[] = {6,1,2,8,3,4,7,10,5}
    Ответ: 9
     */
        Task1 task1 = new Task1();
        task1.ourProgramTask1();

        System.out.println("---------");

        Task2 task2 = new Task2();
        task2.ourProgramTask2();

        System.out.println("---------");
        System.out.println("Home-task - work with string builder:");
        /*
        Дано два числа, например 3 и 56, значение которых хранятся в переменных.
a)Необходимо составить следующие текстовые строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используйте метод StringBuilder.append().
b)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
c)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
         */
        StringBuilder stringBuilder = new StringBuilder();
        int a = 3, b = 56;
        int c = a+b, c1=a-b, c2=a*b;
        String c1Str = c1+"";
        String c2Str = c2+"";

        System.out.println("Task1:");
        stringBuilder.append(a);
        stringBuilder.append(" + ");
        stringBuilder.append(b);
        stringBuilder.append(" = ");
        stringBuilder.append(c);
        System.out.println(stringBuilder);
        System.out.println("-----");
        stringBuilder.replace(2,3,"-");
        stringBuilder.replace(9,11,c1Str);
        System.out.println(stringBuilder);
        System.out.println("-----");
        stringBuilder.replace(2,3,"*");
        stringBuilder.replace(9,12,c2Str);
        System.out.println(stringBuilder);
        System.out.println("-----");
        System.out.println("Task2:");
        stringBuilder.delete(7,8);
        stringBuilder.insert(7,"равно");
        System.out.println(stringBuilder);
        System.out.println("-----");
        System.out.println("Task3:");
        stringBuilder.replace(7,12,"=");
        System.out.println(stringBuilder);
    }
}