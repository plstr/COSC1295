import java.util.Arrays;

class ExchangeSort {

    public static void main(String[] args){
        int[] theList = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
        int temp;
        boolean flag = true;

        for(int i=0; i <= theList.length - 2; i++){
            for(int j = i + 1; j <= theList.length - 1; j++){
                if(theList[i] > theList[j]){
                    temp = theList[i];
                    theList[i] = theList[j];
                    theList[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(theList));
    }
}
