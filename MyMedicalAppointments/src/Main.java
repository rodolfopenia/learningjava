import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        showMenu();

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


