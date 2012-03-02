class Reverse {
    public static void main(String[] args) {
        int[] theList = {3, 44, 56, 65, 74, 21, 33689, 91};
        int[] reverseList = new int[theList.length];

        for(int i = 0; i <= theList.length - 1; i++) {
            reverseList[i] = theList[theList.length - 1 - i];
        }

        System.out.print("Reversed list is:");
        for (int each : reverseList) 
            System.out.print(" " + each);
        System.out.println("!");
    }
}
