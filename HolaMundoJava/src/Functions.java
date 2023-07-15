public class Functions {
    public static void main(String[] args) {
        double y = 3;

        // Área del círculo
        System.out.println(circleArea(y));
        // Área de una esfera
        System.out.println(sphereArea(y));
        // Volumen de una esfera
        System.out.println(sphereVolumen(y));

        System.out.println("PESOS A DÓLARES: " + convertToDolar(200, "MXN"));
        System.out.println("PESOS COL A DÓLARES: " + convertToDolar(1000, "COP"));
    }

    /**
     * Descripción: Función que calcula del área del círculo.
     * @param radio radio del círculo.
     * @return Devuelve el área del círculo.
     * */
    public static double circleArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    /**
     * Descripción: Función que calcula el área de una esfera.
     * @param radio radio de la esfera.
     * @return Devuelve el área de la esfera.
     * */
    public static double sphereArea(double radio){
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    /**
     * Descripción: Función que calcular el volumen de la esfera.
     * @param radio radio de la esfera.
     * @return Devuelve el volumen de la esfera.
     * */
    public static double sphereVolumen(double radio){
        return (4/3) * Math.PI * Math.pow(radio,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dólares
     * */
    public static double convertToDolar(double quantity, String currency){
        switch(currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
