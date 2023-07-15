public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI);
        System.out.println(Math.E);

        // Ceil: devuelve un entero redondeo hacia arriba
        System.out.println(Math.ceil(x));
        // Floor: devuelve un entero redondeo hacia abajo
        System.out.println(Math.floor(x));
        // Pow: Eleva un número a la potencia
        System.out.println(Math.pow(x, y));
        // Max: devuelve el número mayor
        System.out.println(Math.max(x, y));
        // Sqrt: devuelve la raíz cuadrada de un número
        System.out.println(Math.sqrt(y));
        // Área de un círculo
        // PI * r2
        System.out.println(Math.PI * Math.pow(y,2));
        // Área de una esfera
        // 4 * PI * R2
        System.out.println(4 * Math.PI * Math.pow(y,2));
        // Volumen de una esfera
        // 4/3 * PI * r3
        System.out.println((4 / 3) * Math.PI * Math.pow(y,3));
    }
}
