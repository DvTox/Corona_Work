import java.util.Random;
import java.util.Scanner;

public class A2{

    public static int[][] arr = new int[7][10];

    public static void main(String[] args){
        Random rnd = new Random();

        for(int in = 0;in < arr.length;in++){
            for(int out = 0;out < arr[0].length; out++){
                arr[in][out] = rnd.nextInt((51-20)+20);
            }
        }

        printArray();
        System.out.println("---------------------------------------");
        arrayMitte();
    }

    public static void printArray(){
        for(int in = 0;in < arr.length;in++){
            for(int out = 0;out < arr[0].length; out++){
                System.out.printf("%3d ",arr[in][out]);
            }
            System.out.printf("%n");
        }
    }

    public static void arrayMitte(){
        int[] mitte = new int[10];

        for(int in = 0;in < arr[0].length;in++){
            for(int out = 0;out < arr.length; out++){
                mitte[in] = mitte[in] += arr[out][in];
            }
            mitte[in] = mitte[in] / arr.length;
            System.out.printf("%3d ",mitte[in]);
        }
        System.out.printf("%n");

    }
}