public class A4{
    public static void main(String[] args){
        int[][] arrToGive = {{1,2,3},{0,23,32},{1312,3132,3}};
        
        
        int[] arrZeile= gibZeile(arrToGive,2);
    }
    public static int[] gibZeile(int [][] arr,int zeile) {
        int[] zeileArr = new int[3];
        for (int i = 0; i < arr[zeile].length; i++) {
           zeileArr[i] = arr[zeile][i];
           System.out.println(zeileArr[i]);
        }
        return zeileArr;
    }
}