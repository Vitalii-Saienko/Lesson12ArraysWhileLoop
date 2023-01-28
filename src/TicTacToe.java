import java.util.Scanner;

public class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean isWinPosition = false;
        if (field[0][0]==playerToCheck && field[0][1]==playerToCheck && field[0][2]==playerToCheck ){
            isWinPosition = true;
        }
        if (field[1][0]==playerToCheck && field[1][1]==playerToCheck && field[1][2]==playerToCheck ){
            isWinPosition = true;
        }
        if (field[2][0]==playerToCheck && field[2][1]==playerToCheck && field[2][2]==playerToCheck ){
            isWinPosition = true;
        }
        return isWinPosition;
    }
    public boolean isWinPositionForVertical(int[][] field, int playerToCheck) {
        boolean isWinPosition = false;
        if (field[0][0]==playerToCheck && field[1][0]==playerToCheck && field[2][0]==playerToCheck ){
            isWinPosition = true;
        }
        if (field[0][1]==playerToCheck && field[1][1]==playerToCheck && field[2][1]==playerToCheck ){
            isWinPosition = true;
        }
        if (field[0][2]==playerToCheck && field[1][2]==playerToCheck && field[2][2]==playerToCheck ){
            isWinPosition = true;
        }
        return isWinPosition;
    }
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        boolean isWinPosition = false;
        if (field[0][0]==playerToCheck && field[1][1]==playerToCheck && field[2][2]==playerToCheck ){
            isWinPosition = true;
        }
        if (field[2][0]==playerToCheck && field[1][1]==playerToCheck && field[0][2]==playerToCheck ){
            isWinPosition = true;
        }
        return isWinPosition;
    }
    public boolean isWinPosition(int[][] field, int playerToCheck){
        boolean isWinPosition = false;
        if (isWinPositionForHorizontals(field,playerToCheck)){
            isWinPosition = true;
        }
        if (isWinPositionForVertical(field,playerToCheck)){
            isWinPosition = true;
        }
        if (isWinPositionForDiagonals(field,playerToCheck)){
            isWinPosition = true;
        }
        return isWinPosition;
    }
    public boolean isDrawPosition(int[][] field){
        //draw appears when no empty space and no win position
        boolean isDrawPosition = false;
        boolean isEmptySpace = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j]==-1){
                    isEmptySpace = true;
                    break;
                }
            }
        }
        if (isWinPosition(field,0)==false && isEmptySpace == false){
            isDrawPosition = true;
        }
        if (isWinPosition(field,1)==false && isEmptySpace == false){
            isDrawPosition = true;
        }
        return isDrawPosition;
    }
    public int[][] createField(){
        int [][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }
    public TicTacToeMove getNextMove(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        System.out.println("Enter coordinate for row 1,2 or 3:");
        int x = scanner.nextInt()-1;
        while (x<0 || x > 2){
            System.out.println("Please enter correct number: 1,2 or 3:");
            x = scanner.nextInt()-1;
        }
        System.out.println("Enter coordinate for column 1,2 or 3:");
        int y = scanner.nextInt()-1;
        while (y<0 || y > 2){
            System.out.println("Please enter correct number: 1,2 or 3:");
            y = scanner.nextInt()-1;
        }
        return new TicTacToeMove(x,y);
    }
    public void printFieldToConsole(int[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void play(){
        int[][] field = createField();
        while (true){
            TicTacToeMove ticTacToeMovePlayer0 = getNextMove("Player0 - it is your turn.");
            while (field[ticTacToeMovePlayer0.getX()][ticTacToeMovePlayer0.getY()]!=-1){
                System.out.println("This place is busy. Choose another:");
                ticTacToeMovePlayer0 = getNextMove("Player0 - it is your turn.");
            }
            field[ticTacToeMovePlayer0.getX()][ticTacToeMovePlayer0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field,0)){
                System.out.println("Player 0 - WIN!");
                break;
            }
            if (isDrawPosition(field)){
                System.out.println("It's draw!");
                break;
            }
            System.out.println("");
            TicTacToeMove ticTacToeMovePlayer1 = getNextMove("Player1 - it is your turn.");
            while (field[ticTacToeMovePlayer1.getX()][ticTacToeMovePlayer1.getY()]!=-1){
                System.out.println("This place is busy. Choose another:");
                ticTacToeMovePlayer1 = getNextMove("Player1 - it is your turn.");
            }
            field[ticTacToeMovePlayer1.getX()][ticTacToeMovePlayer1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field,1)){
                System.out.println("Player 1 - WIN!");
                break;
            }
            if (isDrawPosition(field)){
                System.out.println("It's draw!");
                break;
            }
        }
    }
}
