/*
Создайте класс ArrayService и реализуйте в нём метод
для проверки содержит ли массив целых чисел заданное число.
 */
public class ArrayContain {
    public boolean isContain(int[] array, int numberToFind) {
        boolean hasNumber = false;
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            if (array[i] == numberToFind) {
                hasNumber = true;
                break;
            } else {
                i++;
            }
        }
        return hasNumber;
    }

    /*
    Добавьте в класс ArrayService метод для подсчёта вхождений
указанного целого числа в массив целых чисел.
     */
    public int countOccurrences(int[] array, int numberToFind) {
        int counter = 0;
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            if (array[i] == numberToFind) {
                counter++;
                i++;
            } else {
                i++;
            }
        }
        return counter;
    }

    /*
    Добавьте в класс ArrayService метод для замены  вхождения
указанного числа в массиве целых чисел на другое число.
     */
    public void changeNumberInArray(int[] array, int numberToChange, int newNumber) {
        boolean flag = false;
        int i = 0;
        int counter = 0;
        int j = array.length - 1;
        while (i <= j) {
            if (array[i]==numberToChange){
                array[i]=newNumber;
                flag = true;
                counter++;
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println(flag? "For "+counter+" times "+numberToChange+" was replaced to number "+newNumber:
                "There are no replacements");
    }
    /*
    Добавьте в класс ArrayService метод для переворота массива целых чисел.
     */
    public int[] revert(int[]array){
        int i = 0;
        while (i <= array.length/2) {
            int temp = 0;
            temp = array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1] = temp;
            i++;
        }
        return array;
    }
    /*
    Добавьте в класс ArrayService любой метод для для сортировки массива целых чисел.
     */
    public void sortArrayBubble(int[]array){
        boolean isSorted = false;
        int temp = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }

}