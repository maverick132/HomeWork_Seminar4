public class MyArrayException extends Exception{

    private int columSize;
    private int rawSize;


    public int getColumSize() {
        return columSize;
    }
    public int getRawSize() {
        return rawSize;
    }

    public MyArrayException(String msg, int columSize, int rawSize) {
        super(msg);
        this.columSize = columSize;
        this.rawSize = rawSize;
    }
    public MyArrayException(String msg) {
        super(msg);
    }

}
