import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    /*
    Дан массив из N целых чисел и целое число  K , найдите количество пар элементов в массиве, сумма которых равна K.
Пример 1:
Вход:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Вывод: 2 пары чисел
Объяснение:
arr[0] + arr[1] = 1 + 5 = 6
arr[1] + arr[3] = 5 + 1 = 6.

Пример 2:
Вход:
N = 4, К = 2
arr[] = {1, 1, 1, 1}
Выход: 6 пар чисел
     */
    public int inputArrayLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the array:");
        int arrayLength = scanner.nextInt();
        return arrayLength;
    }

    public int numberForCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number for check:");
        int numberForCheck = scanner.nextInt();
        return numberForCheck;
    }
    public int[] createArray(){
        int arrayLength = inputArrayLength();
        int[] array = new int[arrayLength];
        for (int i = 0; i <arrayLength; i++) {
            array[i]=(int) ((Math.random()*10)+1);
        }
        return array;
    }
    public void ourProgramTask2(){
        int[] array = createArray();
        int checkNumber = numberForCheck();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == checkNumber) {
                    counter++;
                }
            }
        }
        System.out.println("In random array with input length "+array.length+":");
        System.out.println(Arrays.toString(array));
        System.out.println("and input number "+checkNumber+":");
        System.out.println("There are "+counter+" case(s) when sum of two elements of array is equal to input number "
                +checkNumber+".");
    }
}
