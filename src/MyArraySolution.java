public class MyArraySolution {

    public static int[][] convertArrToInt(String[][] arrS) throws MyArrayException {
        int[][] result = new int[4][4];
        if (checkSizeArr(arrS)){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        result[i][j] = Integer.parseInt(arrS[i][j]);
                    }
                    catch (NumberFormatException e){
                        throw new MyArrayDataException(e.getMessage() + String.format("В %d строке %d столбце неверный формат данных", i,j));
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        return result;
    }

    public static int sumAllElementsArr(int[][] arr){
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum +=arr[i][j];
            }
        }
        return sum;
    }

    public static boolean checkSizeArr(String[][] arrS) throws MyArraySizeException {
        int countColum = 0;
        int countRaw = 0;
        boolean result = true;
        for (int i = 0; i < arrS.length; i++) {
            for (int j = 0; j < arrS[i].length; j++) {
                countColum++;
            }
            if (countColum != 4) {
                throw new MyArraySizeException(String.format("Ошибка! В строке %d -  %d элемента(ов)!", countRaw, countColum));
//                result = false;
            }
            countColum = 0;
            countRaw++;
        }
        if (countRaw != 4)
        {
            throw new MyArraySizeException(String.format("Ошибка! В столбце %d -  %d элемента(ов)!", countColum, countRaw));
//            result = false;
        }
        return result;
    }
}
