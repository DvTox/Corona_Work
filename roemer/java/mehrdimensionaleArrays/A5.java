public class A5{
    public static void main(String[] args){
        int[][] arrToGive = {{1,2,3},{0,23,32},{1312,3132,3}};
        
        
        int[] toBeEindimensional = machEindimensional(arrToGive,3);

        for (int i = 0; i < toBeEindimensional.length; i++) {
            System.out.printf("%d ",toBeEindimensional[i]);
        }
        System.out.printf("%n");
    }
    public static int[] machEindimensional(int [][] arr,int collumSize) {
        int[] eindimensionalArr = new int[arr.length * collumSize];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < collumSize; j++) {
              eindimensionalArr[counter] = arr[i][j];  
              counter++;  
            }
        }
        return eindimensionalArr;
    }
}