public class IncrementDecrement {
    public static void main(String[] args) {
        // post fija
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);

        lives--;
        System.out.println(lives);

        lives++;
        System.out.println(lives);

        // pre fija
        // Gana un regalo por ganar una vida
        int gift = 100 + ++lives; // postfijo Suma 4 antes de incrementar
        // prefijo después de incrementar
        System.out.println(gift);
        System.out.println(lives);
    }
}
