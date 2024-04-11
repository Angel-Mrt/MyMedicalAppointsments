import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;
import ui.UIMenu;

import java.util.Date;

public class Main {
    public static void main(String[]args){

    UIMenu.showMenu();
/*
        Doctor myDoctor = new Doctor("Angel Martinez", "angelmrt@gmail.com");
        myDoctor.addAvailableAppoinment(new Date(),"4 pm");
        myDoctor.addAvailableAppoinment(new Date(),"10 pm");
        myDoctor.addAvailableAppoinment(new Date(),"11 pm");
*
        System.out.println(myDoctor);


        User user =  new Doctor("Angel", "fa55553585@gmail.com");
        user.showDataUser();
        User userPa =  new Patient("Angel", "fa55553585@gmail.com");
        userPa.showDataUser();

        User user1 = new User("Salo", "asalo@gamial.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor \n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatria");
            }
        };
        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedulable(Date date, String time) {

            }
        };
/*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " +  aA.getTime());
        }
*/
        /*
        System.out.println();
        System.out.println();

        Patient patient = new Patient("Fernando", "ferhmrt@gmail.com");
        Patient patient2 = new Patient("Angel", "angelmrt@gmail.com");
        System.out.println(patient);

         */

    }

}