public class MyArrays {
    static String[][] arr1 = new String[][] {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };
    static String[][] arr2 = new String[][] {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "!!!"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };
    static String[][] arr3 = new String[][] {
            {"1", "2", "3"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };
    static String[][] arr4 = new String[][] {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
    };

    public static void printArr(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
