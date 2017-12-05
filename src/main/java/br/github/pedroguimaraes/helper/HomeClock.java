package br.github.pedroguimaraes.helper;

import br.github.pedroguimaraes.view.Home;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class HomeClock extends Thread{
    
    
    

   
    public String getHour() {
        GregorianCalendar calendar = new GregorianCalendar();
        int Hour    = calendar.get(GregorianCalendar.HOUR_OF_DAY);
        int minute  = calendar.get(GregorianCalendar.MINUTE);
        int second  = calendar.get(GregorianCalendar.SECOND);
         
        return Hour + ":" + minute + ":" + second;
    }
    
    public String getDate() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(date);
    }
}
