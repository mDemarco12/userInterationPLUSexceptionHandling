
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MonthException,DayException,YearException  {

        //Housekeeping!
        //Set each variable
        int yearDate = 1000, monthDate = 1, dayDate = 1;

        Scanner scan = new Scanner(System.in);

        //Loop
        for( int i = 0; i < 4; i++) {

            /* Prompt */
            System.out.println("Enter date to parse (MM/DD/YYYY format):");
            //Create a scanner to request user input
            String input = scan.next();


            //Create an array which contains Strings of each Month
            String[] date =
                    {"January", "February", "March", "April", "May", "June", "July"
                            , "August", "September", "October", "November", "December"};
            String[] dates =  input.split("/");

            monthDate = Integer.parseInt(dates[0]);

            //Loop, then break;
            while (true) {

                try {

                    if (monthDate < 1 || monthDate > 12) {

                        throw new MonthException("Invalid month.   Reenter a valid month:");

                    }

                } catch (MonthException e) {

                    System.out.println(e.getMessage());
                    monthDate = scan.nextInt();
                    // monthDate = Integer.parseInt(date[0]);
                }
                dayDate = Integer.parseInt(dates[1]);
                yearDate = Integer.parseInt(dates[2]);

                try {
                    if (dayDate < 1 || dayDate > 31) {
                        throw new DayException("Invalid day.   Reenter a valid day:");
                    }else if(monthDate == 2 && dayDate > 28) {
                        throw new DayException("Invalid day.   Reenter a valid day:");
                    }else if(monthDate == 4 && dayDate >30){
                        throw new DayException("Invalid day.   Reenter a valid day:");
                    }else if(monthDate ==6 && dayDate >30){
                        throw new DayException("Invalid day.   Reenter a valid day:");
                    }else if(monthDate == 9 && dayDate> 30){
                        throw new DayException("Invalid day.   Reenter a valid day:");
                    }else if( monthDate == 11 && dayDate > 30){
                        throw new DayException("Invalid day.   Reenter a valid day:");
                    }

                } catch (DayException e) {
                    System.out.println(e.getMessage());
                    dayDate = scan.nextInt();
                    //dayDate = Integer.parseInt(date[1]);
                }
                //yearDate = Integer.parseInt(date[2]);
                try {
                    if (yearDate < 1000 || yearDate > 3000) {
                        throw new YearException("Invalid year.   Reenter a valid year:");
                    } //else {
                    //continue;
                    // }
                } catch (YearException e) {
                    System.out.println(e.getMessage());
                    yearDate = scan.nextInt();

                    //yearDate = Integer.parseInt(date[2]);
                }
                System.out.println("Parsed date:   " + date[monthDate - 1] + " " + dayDate + ", " + yearDate );
                System.out.println();
                break;


            }
        }
    }//End of psvm
}//end of main