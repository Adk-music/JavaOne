package geekbrains.lessons.LessonTwo;

import java.util.Arrays;

public class LessonTwo {

    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();

    }

    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
   private static void one() {
       int[] arr = {0, 1, 0, 1, 1, 0};
       for (int i = 0; i < arr.length; i++){
           if (arr[i] == 0 ){
               arr[i] = 1;
           } else if (arr[i] == 1){
               arr[i] = 0;
           }
       }
       System.out.println(Arrays.toString(arr));
   }
//Задать пустой целочисленный массив размером 8.
// Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
  private static void two (){
        int[] arr = new int[8];
        int x = 1;
      for (int i = 0; i < arr.length; i++){
          arr[i] = x;
          x = x + 3;
      }
      System.out.println(Arrays.toString(arr));
   }

//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
// написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
  private static void three(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1} ;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
      System.out.println(Arrays.toString(arr));
   }

// Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
  private static void four(){
        int[] arr = {4, 10, 6, 1, 11, 8, 10, 4, 8, 8, 9, 2};
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            } else if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
  }
  //* Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
  // заполнить его диагональные элементы единицами, используя цикл(ы);
    private static void five(){
        int length = 5;
        int width = 5;
        int[][] arr = new int[length][width];
        for (int i = 0; i < length; i++){
          for(int j = 0; j < width; j++){
              if (i == j){
                  arr[i][j] = 1;
              }
          }

        }
    }
// * * Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
// checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||,
// эти символы в массив не входят.

    //скажу честно, мне помогли разобраться как решить данную задачу, но я даже не стала писать решение, т.к.
    // оно не на сто процентов мое. А я хочу понимать, а не тупо получать оценки.

//* * * Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным,
// или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
}
