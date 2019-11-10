package geekbrains.lessons.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int winConditionCount;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';

    private static void initField() {
        fieldSizeX = 5;
        fieldSizeY = 5;
        winConditionCount = 4;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }
    private static void showField() {
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print("|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.printf("Введите координаты X и Y (от 1 до %d) через %s>>> ", fieldSizeX, "пробел");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }
    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }
    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }
    private static boolean checkWin(char c) {
        boolean[] diagonalResult = new boolean[fieldSizeX];
        boolean[] backDiagonalResult = new boolean[fieldSizeY];

       for (int i = 0; i < fieldSizeY; i++){
           boolean[] verticalResult = new boolean[fieldSizeY];
           boolean[] horizontalResult = new boolean[fieldSizeX];
           for (int j = 0; j< fieldSizeY; j++ ){
               horizontalResult[j] = field[i][j] == c;
               verticalResult[j] = field[j][i] == c;
           }
           diagonalResult[i] = field[i][i] == c;
           backDiagonalResult[i] = field[i][fieldSizeY - 1 - i] == c;

           if (checkWinCombination(verticalResult) || checkWinCombination(horizontalResult)){
               return true;
           }
           }
        return checkWinCombination(diagonalResult) || checkWinCombination(backDiagonalResult);
    }

    private static boolean checkWinCombination(boolean[] resultLine){
        int successCount = 0;
        for (int i = 0; i < resultLine.length; i++) {
             if (resultLine[i]){
                 successCount++;
                 if (successCount == winConditionCount){
                     return true;
                 }
             } else {
                 return false;
             }
        }
        return true;
    }
    private static boolean isDraw() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initField();
        showField();
        while (true) {
            humanTurn();
            showField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Human win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            showField();
            if (checkWin(DOT_AI)) {
                System.out.println("Computer win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
        }

    }

    private static void method(String s, Object... b) {
        b[0] = 1;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }


}
