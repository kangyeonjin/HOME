package home_0606_static;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public static String getCurrenDate(String fmt){

        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }

}
