class Sorted {
    private int current;

    public int FindSmallest(int[] theList) {
        current = 99999;
        for (int each : theList) {
            if (each > current)
                current = each;
        }
        return current;
    }

    public static void main (String[] args) {
        int[] theList = {33, 1, 98, 26, 10, 7, 9, 66, 3971, 6593, 12};
        int[] sortedList = new int[theList.length];
        int test = FindSmallest(theList);
        System.out.println(test);
    }
}
