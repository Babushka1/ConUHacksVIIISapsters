import java.util.Calendar;
import java.util.Date;
public class Appointment{
    private Date apptRequestDate; //MAKE PRIVATE!
    private Date apptDate;
    private Car car;
  
    public Appointment(String apptRequestDate, String apptDate, String car){
        this.apptRequestDate = conversion(apptRequestDate);
        this.apptDate = conversion(apptDate);
        this.car = new Car(carType(car));
    }

    public Date conversion(String apptRequestDate){
        int slash1 = apptRequestDate.indexOf('-');
        int slash2 = apptRequestDate.lastIndexOf('-');
        int space = apptRequestDate.indexOf(' ');
        int colon = apptRequestDate.indexOf(':');
        
        int year = Integer.parseInt(apptRequestDate.substring(0, slash1));
        int month = Integer.parseInt(apptRequestDate.substring(slash1+1, slash2))-1;
        int day = Integer.parseInt(apptRequestDate.substring(slash2+1, space));
        int hour = Integer.parseInt(apptRequestDate.substring(space+1 , colon));
        int min = Integer.parseInt(apptRequestDate.substring(colon+1));
        
        Calendar calendar = Calendar.getInstance();

        calendar.set(year ,month ,day,hour,min,0);

        Date date1 = calendar.getTime();

        return date1;
    }
   public int carType(String car)
   {
       if (car.equals("compact"))
       {
           return 0;
       }
       else if (car.equals("medium"))
       {
           return 1;
       }
       else if (car.equals("full-size"))
       {
           return 2;
       }
       else if (car.equals("class 1 truck"))
       {
           return 3;
       }
       else if (car.equals("class 2 truck"))
       {
           return 4;
       }
       else
       {
           return -1;
       }
   }

       private int convertDays(Date date)
   {
	   if (date.getDate() == 9)
	   {
		   return date.getDate() - 1;
	   }
	   else 
	   {
		   return date.getDate() - 1 + 30;
	   }
   }
   	
   private int convertMinutes(Date date)  
   {
	   return (date.getHours() - 7) * 60 + date.getMinutes();
   }
   
   public int isAvailable()
   {
	   for (int i = 5; i <= 9; i++)
	   {
		   if((Main.baySchedule[convertDays(apptDate)][i].isEmpty(convertMinutes(apptDate), car.serviceTime[car.getType()])))
		   {
			  return i;
		   }
	   }
	   if(Main.baySchedule[convertDays(apptDate)][car.getType()].isEmpty(convertMinutes(apptDate), car.serviceTime[car.getType()]))
	   {
		   return car.getType();
	   }
	   else
	   {
		   return -1;
	   }
   }

    public String toString(){
        return ("APPOINTMENREQUESTDATE: "+apptRequestDate+"\nAPPOINTMENTDATE: "+apptDate+"\nCAR: "+car+"\n------------------------------------");
    }

    public Date getApptRequestDate(){
        return apptRequestDate;
    }
}
