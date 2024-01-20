
public class Appointment{
    private Date apptRequestDate;
    private Date apptDate;
    private Car car;
  
    public Appointment(String apptRequestDate, String apptDate, String car){
        this.apptRequestDate = apptRequestDate;
        this.apptDate = apptDate;
        this.car = car;
    }

   public int[] Conversion(String apptRequestDate){
        int trait1 = apptRequestDate.indexOf('-');
        int trait2 = apptRequestDate.lastIndexOf('-');

        int year = Integer.parseInt(apptRequestDate.substring(0, trait1));
        int month = Integer.parseInt(apptRequestDate.substring(trait1 + 1, trait2));
        int day = Integer.parseInt(apptRequestDate.substring(trait2 + 1));
        
        int[] array = {year, month, day};
        return array;
    }
     public Date Conversion(String apptRequestDate){
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

}
