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
        Bay[] bays = new Bay[10];
        
        for (int i=0; i<bays.length; i++){
            if (i>4) bays[i]=new Bay(5);

            else bays[i]= new Bay(i);
        }


        for (int i=0; i<10000; i++){
            String currentLine = scan.nextLine();
            appointments[i] = new Appointment(currentLine.substring(0,currentLine.indexOf(",")),currentLine.substring(currentLine.indexOf(",")+1,currentLine.lastIndexOf(",")),currentLine.substring(currentLine.lastIndexOf(",")+1));
        }


        for (int i=0;i<10000;i++){
            System.out.println(appointments[i].apptRequestDate+" ||| "+appointments[i].apptDate+" ||| Type "+appointments[i].car);
        }

        for (int i=0;i<appointments.length; i++){

        }
        


        scan.close();
    }
    static void swap(Appointment[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static int partition(Appointment[] array, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];
 
        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            // If current element is smaller than the pivot
            if (array[j].getApptRequestDate().compareTo(array[pivot].getApptRequestDate())) {
 
                // Increment index of smaller element
                i++;
                swap(array, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
}
