public class DayException extends Exception {


    public DayException(){

        super();

        System.out.println("This is a no argument constructor ばか。。。。");
    }

    public DayException(String message){

        super(message);
    }
}
