
public class Appointment{
    private Date apptRequestDate;
    private Date apptDate;
    private Car car;
  
    public Appointment(String apptRequestDate, String apptDate, String car){
        this.apptRequestDate = conversion(apptRequestDate);
        this.apptDate = conversion(apptDate);
        this.car = new Car(carType(car));
    }

     public Date conversion(String apptRequestDate){
        int trait1 = apptRequestDate.indexOf('-');
        int trait2 = apptRequestDate.lastIndexOf('-');

        int year = Integer.parseInt(apptRequestDate.substring(0, trait1));
        int month = Integer.parseInt(apptRequestDate.substring(trait1 + 1, trait2));
        int day = Integer.parseInt(apptRequestDate.substring(trait2 + 1, 10));
        int hour = Integer.parseInt(apptRequestDate.substring(11, 13));
        int min = Integer.parseInt(apptRequestDate.substring(14));

        Calendar calendar = Calendar.getInstance();

        calendar.set(year , month , day, hour, min);

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
