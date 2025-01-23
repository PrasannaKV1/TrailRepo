public class Test4 {
    public static void main(String[] args) {
        int array[] = {13, 14, 15, 17, 18};
        System.out.println(isSorted(array));
    }


    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }

        }
        return true;
    }
}


