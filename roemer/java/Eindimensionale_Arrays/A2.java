import java.util.Scanner;

public class A2{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in); // Create a Scanner object
        System.out.printf("Enter Array Size: ");
        int arrSize = inp.nextInt();

        int[] intArr = new int[arrSize];
        for (int i = 0; i < intArr.length; i++) {
            System.out.printf("Zahl Eingeben: ");
            intArr[i] = inp.nextInt();
        }
        inp.close();
        
        for (int j = (intArr.length -1); j >= 0; j--) {
            System.out.printf("%d ",intArr[j]);
        }
        System.out.printf("%n");
    }
}
    