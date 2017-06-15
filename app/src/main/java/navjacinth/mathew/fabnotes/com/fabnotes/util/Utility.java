package navjacinth.mathew.fabnotes.com.fabnotes.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Navjacinth Mathew on 6/11/2017.
 */

public class Utility {

    /*Method to get time stamp to be stored for post*/
    public String getFormattedTime() {
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", Locale.US);

        Calendar calendar = Calendar.getInstance();
        String weekDay = dayFormat.format(calendar.getTime());

        SimpleDateFormat dateYear = new SimpleDateFormat("dd, yyyy | HH:mm", Locale.ENGLISH);
        String currentDateandTime = dateYear.format(new Date());

        String monthName = new SimpleDateFormat("MMMM", Locale.ENGLISH).format(calendar.getTime());

        String currentFormattedTimestamp = weekDay + ", " + monthName + " " + currentDateandTime;

        return currentFormattedTimestamp;
    }

}
