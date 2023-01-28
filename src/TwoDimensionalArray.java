import java.util.Arrays;

public class TwoDimensionalArray {
    /*
    Создайте класс TwoDimensionalArray и в нём напишите программу в которой:
  - создайте двумерный массив;
  - заполните двумерный массив случайными числами;
  - посчитайте сумму всех чисел в двумерном массиве.
     */
    public int[][] createTwoDimensionalArray(){
        int [][] array = new int[(int)(Math.random()*10+1)][(int)(Math.random()*10+1)];
        return array;
    }
    public int[][] fillArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*10+1);
            }
        }
        return array;
    }
    public int sumOfElements(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }
    public void ourProgram(){
        int [][] array = createTwoDimensionalArray();
        fillArray(array);
        System.out.println(Arrays.deepToString(array));
        System.out.println("Sum of elements is equal "+sumOfElements(array));
    }
}
