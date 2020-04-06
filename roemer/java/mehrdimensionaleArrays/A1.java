import java.util.Random;
import java.util.Scanner;

public class A1{

    public static int[][] arr = new int[5][2];

    public static void main(String[] args){
        Random rnd = new Random();

        for(int in = 0;in < arr.length;in++){
            for(int out = 0;out < arr[0].length; out++){
                arr[in][out] = rnd.nextInt(100);
            }
        }
        printArray();
    }

    public static void printArray(){
        for(int in = 0;in < arr.length;in++){
            for(int out = 0;out < arr[0].length; out++){
                System.out.printf("%3d ",arr[in][out]);
            }
            System.out.printf("%n");
        }
    }
}