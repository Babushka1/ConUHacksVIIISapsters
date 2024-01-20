import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new  File("C:\\Users\\jovro\\Desktop\\SAP\\datafile.csv");
        Scanner scan = new Scanner(file);

        Appointment[] appointments = new Appointment[10000];


        /*for (int i=0; i<10000; i++){
            String currentLine = scan.nextLine();
            appointments[i] = new Appointment(currentLine.substring(0,currentLine.indexOf(",")),currentLine.substring(currentLine.indexOf(",")+1,currentLine.lastIndexOf(",")),currentLine.substring(currentLine.lastIndexOf(",")+1));
        }


        for (int i=0;i<10000;i++){
            System.out.println(appointments[i]);
        }*/

        Calendar calendar = Calendar.getInstance();

        calendar.set(2023, 0, 8, 0, 0, 0);

        Date date1 = calendar.getTime();

        calendar.set(2024, 0, 20, 0, 0, 0);

        Date date2 = calendar.getTime();

        System.out.println(date1);
        System.out.println(date2);


        scan.close();
    }
}
