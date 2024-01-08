import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        // Current date // Added a new Date for testing
        Date currentDate = new Date();
        Date currentDate2 = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd ");
        String formattedDate = formatter.format(currentDate);
        String formattedDate2 = formatter2.format(currentDate2);

        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Formatted Date 2:" + formattedDate2);

        // Adding 5 days // Adding 10 days for testing
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();
        // Adding 10 days for testing
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(currentDate);
        calendar2.add(Calendar.DAY_OF_MONTH, 10);
        Date futureDate2 = calendar2.getTime();

        // Future date
        String formattedFutureDate = formatter.format(futureDate);
        String formattedFutureDate2 = formatter.format(futureDate2);

        System.out.println("Date after 5 days: " + formattedFutureDate);
        System.out.println("Date after 10 days: " + formattedFutureDate2);

    }
}