
public class Appointment{
    private Date apptRequestDate;
    private Date apptDate;
    private Car car;
  
    public Appointment(String apptRequestDate, String apptDate, String car){
        this.apptRequestDate = conversion(apptRequestDate);
        this.apptDate = conversion(apptDate);
        this.car = new Car(carType(car));
    }

    public Date Conversion(String apptRequestDate){

        int year = Integer.parseInt(apptRequestDate.substring(1, 5));
        int month = Integer.parseInt(apptRequestDate.substring(6, 8));
        int day = Integer.parseInt(apptRequestDate.substring(9, 11));
        int hour = Integer.parseInt(apptRequestDate.substring(12, 14));
        int min = Integer.parseInt(apptRequestDate.substring(15));

        Calendar calendar = Calendar.getInstance();

        calendar.set(year ,month ,day,hour,min);

        Date date1 = calendar.getTime();

        return date1;
    }

       	public int carType(String car)
   	{
   		if (car.equals(" compact"))
   		{
   			return 0;
   		}
   		else if (car.equals(" medium"))
   		{
   			return 1;
   		}
   		else if (car.equals(" full-size"))
   		{
   			return 2;
   		}
   		else if (car.equals(" class 1 truck"))
   		{
   			return 3;
   		}
   		else if (car.equals(" class 2 truck"))
   		{
   			return 4;
   		}
   		else
   		{
   			return -1;
   		}
   	}

}
