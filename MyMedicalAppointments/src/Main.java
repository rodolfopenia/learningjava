import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Rodolfo", "rdf@clase13.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        // System.out.println(myDoctor);

        User user = new Doctor("Rodo", "rdr@rdf.com");
        user.showDataUser();

        User userPa = new Patient("Jnr","jnr@knl.com");
        userPa.showDataUser();

        User user1 = new User("Bnr", "bnr@clase13.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();

        /*ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        ISchedulable iSchedulable1 = new AppointmentDoctor();
        iSchedulable1.schedule();*/

        /*for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

        /*System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpeciality());*/

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


