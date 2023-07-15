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

    public static double circleArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public static double sphereArea(double radio){
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public static double sphereVolumen(double radio){
        return (4/3) * Math.PI * Math.pow(radio,3);
    }

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
