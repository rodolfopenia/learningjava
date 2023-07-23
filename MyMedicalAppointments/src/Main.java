import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Rodolfo", "Cirujano");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(myDoctor);

        /*for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

        System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpeciality());

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);
        /*patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        System.out.println(Day.MONDAY.getSpanish());*/

    }

    public enum Day{
        MONDAY("Lunes"),
        TUESDAY("Jueves"),
        FRIDAY("viernes"),
        SATURDAY("Sábado");

        private String spanish;
        private Day(String s){
            spanish = s;
        }
        private String getSpanish(){
            return spanish;
        }
    }
}


