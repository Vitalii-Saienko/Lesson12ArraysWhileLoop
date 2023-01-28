import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //home-task with arrays
        ArrayContain arrayContain = new ArrayContain();
        int[] array = {-5,7,-5,0,6,15,7,7,7};
        System.out.println(arrayContain.isContain(array, 7));
        System.out.println("-----");
        System.out.println(arrayContain.countOccurrences(array,7));
        System.out.println("-----");
        arrayContain.changeNumberInArray(array,-5,999);
        System.out.println(Arrays.toString(array));
        System.out.println("-----");
        arrayContain.revert(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-----");
        arrayContain.sortArrayBubble(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-----");

        //home-task - create tic-tac-toe game
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play();
    }
}