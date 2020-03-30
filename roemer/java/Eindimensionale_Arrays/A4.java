import java.util.Scanner;

public class A4{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in); // Create a Scanner object

        int[] intArr = new int[10];

        int[] kopieArr = new int[10];

        System.out.println("Eingabe Arr1");
        for (int i = 0; i < intArr.length; i++) {
            System.out.printf("Zahl %d Eingeben: ",(i +1));
            intArr[i] = inp.nextInt();
        }
        inp.close();

        for (int j = 0; j < kopieArr.length; j++) {
            kopieArr[j] = intArr[j];
        }
        System.out.printf("%n%n%nArray2: ");
        for (int arr : kopieArr) {
            System.out.printf("%d ",arr);
        }
        System.out.printf("%n");
    }
}
    