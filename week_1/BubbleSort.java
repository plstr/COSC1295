import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args){
        int[] theList = {9, 1, 8, 2, 7, 3, 6, 4, 5, 0};
        int tempStore;
        boolean checkArray = true;
        while(checkArray){
            checkArray = false;
            System.out.println(Arrays.toString(theList));
            for(int i=0; i <= theList.length - 2; i++){
                if(theList[i] > theList[i+1]){
                    tempStore = theList[i];
                    theList[i] = theList[i+1];
                    theList[i+1] = tempStore;
                    checkArray = true;
                }
            }
        }
        System.out.println(Arrays.toString(theList) + "<-- final");
    }
}
