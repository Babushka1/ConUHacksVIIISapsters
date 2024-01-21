import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.NoSuchElementException;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new  File("C:\\Users\\jovro\\Desktop\\SAP\\unsorteddatafile.csv");
        Scanner scan = new Scanner(file);

        int lines = 0;
        try {
            while (true) {
                scan.nextLine();
                lines++;
            }
        } catch (java.util.NoSuchElementException e){
            
        }

        scan = new Scanner(file);

        Appointment[] appointments = new Appointment[lines];


        for (int i=0; i<lines; i++){
            String currentLine = scan.nextLine();
            appointments[i] = new Appointment(currentLine.substring(0,currentLine.indexOf(",")),currentLine.substring(currentLine.indexOf(",")+1,currentLine.lastIndexOf(",")),currentLine.substring(currentLine.lastIndexOf(",")+1));
        }
        
        quickSort(appointments, 0, lines-1);

        for (int i=0;i<lines;i++){
            System.out.println(appointments[i].getApptRequestDate());
        }

        //scan.close();
    }
    static void swap(Appointment[] array, int i, int j)
    {
        Appointment temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static int partition(Appointment[] array, int low, int high)
    {

        Date pivot = array[high].getApptRequestDate();

        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            if (array[j].getApptRequestDate().compareTo(pivot)<0) {
 
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }
    static void quickSort(Appointment[] array, int low, int high)
    {
        if (low < high) {
 
            int pi = partition(array, low, high);
 
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
}
