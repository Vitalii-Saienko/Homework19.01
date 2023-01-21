import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Task1 {
    /*
    First level: 1. Дан массив размера  N-1  , который должен содержать только целые числа в диапазоне от  1 до N .
    Каждое число представлено в одном экземпляре, кроме одного числа.  Найдите недостающий элемент.
    Вход:
    N = 10
    А[] = {6,1,2,8,3,4,7,10,5}
    Ответ: 9
     */
    public boolean checkElementArray(int[]array, int number) {
        boolean isNumberUnique = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isNumberUnique = false;
                break;
            }
        }
        return isNumberUnique;
    }
    public int[] createAndFillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length for array:");
        int n = scanner.nextInt();
        int[] array = new int[n - 1];
        array[0] = (int) (Math.random() * (n) + 1);
        for (int i = 1; i < array.length; i++) {
            int nextNumber = (int) (Math.random() * (n) + 1);
            while (!checkElementArray(array, nextNumber)) {
                nextNumber = (int) (Math.random() * (n) + 1);
            }
            array[i] = nextNumber;
        }
        return array;
    }

    public int findLostElement(int[] ourArray) {
        int[] completeArray = new int[ourArray.length+1];
        for (int i = 0; i < completeArray.length; i++) {
            completeArray[i] = i+1;
        }
        int lostElement=completeArray[0];
        for (int i = 0; i < completeArray.length; i++) {
            if (checkElementArray(ourArray,completeArray[i])){
                lostElement = completeArray[i];
                break;
            }
        }
        return lostElement;
        }

    public void ourProgramTask1(){
        int[]array = createAndFillArray();
        System.out.println("In array with unique random numbers and input length "+(array.length+1)+":");
        System.out.println(Arrays.toString(array));
        System.out.println("the lost element is:");
        System.out.println(findLostElement(array));
    }
    }


