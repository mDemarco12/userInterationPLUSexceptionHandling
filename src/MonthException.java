public class MonthException extends Exception {
    //Extends Throwable

    public  MonthException(){
        super();

        System.out.println("This is a no argument constructor ばか。。。。");
    }

    public MonthException(String message) {

        super(message);


    }




}
