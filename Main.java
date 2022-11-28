
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!!!!");
    
    Scanner input = new Scanner(System.in);
    
    int[][] arr = new int[3][3];

    for (int row =0;row < arr.length;row++){
      for (int col =0;col < arr[row].length;col++){
        arr[row][col] = input.nextInt();
      }
    }

    for (int[] j : arr){
      for (int k : j){
      System.out.print(k+" ");
    }
      System.out.println(" ");
  }
  }
}