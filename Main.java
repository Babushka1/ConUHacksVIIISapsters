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


        for (int i=0; i<10000; i++){
            String currentLine = scan.nextLine();
            appointments[i] = new Appointment(currentLine.substring(0,currentLine.indexOf(",")),currentLine.substring(currentLine.indexOf(",")+1,currentLine.lastIndexOf(",")),currentLine.substring(currentLine.lastIndexOf(",")+1));
        }


        for (int i=0;i<10000;i++){
            System.out.println(appointments[i].apptRequestDate+" ||| "+appointments[i].apptDate+" ||| Type "+appointments[i].car);
        }

        

        scan.close();
    }
}
