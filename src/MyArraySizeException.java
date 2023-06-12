public class MyArraySizeException extends  MyArrayException{
    MyArraySizeException(String msg){
        super(msg + "Массив должен быть 4х4!");
    }
}
