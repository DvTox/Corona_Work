public class A3{
    public static void main(String[] args){
        int[][] arrToGive = {{1,2,3},{0,23,32},{1312,3132,3}};
        
        
        int[][] arrToRecive = kopiere(arrToGive);

        if (arrToGive.equals(arrToRecive)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
    public static int[][] kopiere(int [][] arr) {
       int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = arr[i][j];
            }
            
        }
        return arr;
    }
}