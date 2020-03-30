public class A1{
    public static void main(String[] args){
        int[] testArray = {22,55,73,2,1,0};

        System.out.printf("%d %d %d %d %d %d%n",testArray[0],testArray[1],testArray[2],testArray[3],testArray[4],testArray[5]);
        
        System.out.println(testArray.length);

        for (int i = 0; i < testArray.length; i++) {
            System.out.printf("%d ",testArray[i]);
        }
        System.out.printf("%n");

        for (int arr : testArray) {
            System.out.printf("%d ",arr);
        }
        System.out.printf("%n");
    }
}