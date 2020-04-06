import java.util.Random;

public class A2{

    public static int[][] arr = new int[7][10];

    public static void main(String[] args){
        Random rnd = new Random();

        for(int in = 0;in < arr.length;in++){
            for(int out = 0;out < arr[0].length; out++){
                arr[in][out] = rnd.nextInt((51-20)+20);
            }
        }

        arrayMitte();
    }

    public static void printArray(double[] mitteTag,double[] mitteStation){
        for(int in = 0;in < arr.length;in++){
            for(int out = 0;out < arr[0].length; out++){
                System.out.printf("%5d ",arr[in][out]);
            }
            System.out.printf(" | %.2f%n",mitteTag[in]);
        }
        System.out.println("-------------------------------------------------------------");
        for (double element : mitteStation) {
            System.out.printf("%5.2f ",element);
        }
        System.out.printf("%n");
    }

    public static void arrayMitte(){
        double[] mitteStation = new double[10];
        double[] mitteTag = new double[7];

        for(int in = 0;in < arr[0].length;in++){
            for(int out = 0;out < arr.length; out++){
                mitteStation[in] = mitteStation[in] += arr[out][in];
            }
            mitteStation[in] = mitteStation[in] / arr.length;
            //System.out.printf("%3d ",mitteStation[in]);
        }

        for(int tag = 0; tag < arr.length; tag++){
            for(int station = 0;station < arr[0].length;station++){
                mitteTag[tag] = mitteTag[tag] += arr[tag][station];
            }
            mitteTag[tag] = mitteTag[tag] / arr[0].length;
        }
        printArray(mitteTag,mitteStation);
        

    }
}