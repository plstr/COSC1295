import java.util.Arrays;

class InsertionSort{
    static public void main(String[] args){
        int[] theList = {1,0,2,9,4,8,5,7,6};
        int arrKey, i, j;

        for(j = 1; j < theList.length; j++) {
            arrKey = theList[j];
            for (i = j - 1; (i >= 0) && (theList[i] < arrKey); i--){
                theList[i + 1] = theList[i];
            }
            theList[i + 1] = arrKey;
        }
        System.out.println(Arrays.toString(theList));
    }
}
