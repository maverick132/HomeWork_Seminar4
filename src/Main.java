// Задача 1:
//
//1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
//подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3 В методе main() вызвать полученный метод, обработать возможные исключения
//MyArraySizeException и MyArrayDataException и вывести результат расчета.
public class Main {
    public static void main(String[] args) throws MyArrayException {
        int[][]arr1;
        int[][]arr2;
        int[][]arr3;
        int[][]arr4;

        System.out.println("Массив №1");
        MyArrays.printArr(MyArrays.arr1);
        System.out.println("Конвертируем в int");
        try{
            arr1 = MyArraySolution.convertArrToInt(MyArrays.arr1);
            System.out.print("Сумма всех элементов: ");
            System.out.println(MyArraySolution.sumAllElementsArr(arr1));
            System.out.println("Успешно");
        }
        catch (MyArrayException e){
            System.out.println(e.getMessage());
        }



        System.out.println("Массив №2");
        MyArrays.printArr(MyArrays.arr2);
        System.out.println("Конвертируем в int");
        try{
            arr2 = MyArraySolution.convertArrToInt(MyArrays.arr2);
            System.out.print("Сумма всех элементов: ");
            System.out.println(MyArraySolution.sumAllElementsArr(arr2));
            System.out.println("Успешно");
        }
        catch (MyArrayException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Массив №3");
        MyArrays.printArr(MyArrays.arr3);
        System.out.println("Конвертируем в int");
        try{
            arr3= MyArraySolution.convertArrToInt(MyArrays.arr3);
            System.out.print("Сумма всех элементов: ");
            System.out.println(MyArraySolution.sumAllElementsArr(arr3));
            System.out.println("Успешно");
        }
        catch (MyArrayException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Массив №4");
        MyArrays.printArr(MyArrays.arr4);
        System.out.println("Конвертируем в int");
        try{
            arr4 = MyArraySolution.convertArrToInt(MyArrays.arr4);
            System.out.print("Сумма всех элементов: ");
            System.out.println(MyArraySolution.sumAllElementsArr(arr4));
            System.out.println("Успешно");
        }
        catch (MyArrayException e){
            System.out.println(e.getMessage());
        }






    }
}