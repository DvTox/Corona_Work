import java.util.Random;

public class A7{
    public static void main(String[] args){
        Random rdm = new Random();

        int[] rdmArr = new int[6];
   for (int rdmNumber = 0; rdmNumber < rdmArr.length; rdmNumber++) {
       rdmArr[rdmNumber] = (rdm.nextInt(501) +1);
   }
        int index = minDistanz(rdmArr);

        for (int idx : rdmArr) {
            System.out.printf("%d ",idx);
        }
        System.out.printf("%nIndex: %d%n",index);
    }

    static int minDistanz(int[] inpArr){
       int minDistanzCount = 0,minDistanzCount1 = -1,minDistanzIndex = 0;

      for (int j = 0; j < (inpArr.length -1); j++) {
        minDistanzCount = Math.abs(Math.abs(inpArr[j]) - Math.abs(inpArr[j +1]));
        if (j == 0) {
            minDistanzCount1 = minDistanzCount;
            minDistanzIndex = j;
        }else{
            if (minDistanzCount < minDistanzCount1) {
            minDistanzCount1 = minDistanzCount;
            minDistanzIndex = j;
            }
        }

      }
        return minDistanzIndex;
    }
}
    