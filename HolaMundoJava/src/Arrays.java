public class Arrays {
    public static void main(String[] args) {
        String [] androidVersions = new String[17];
        String days[] = new String[7];

        String [][] cities = new String[4][2];

        int[][][] numbers = new int [3][3][2];
        int[][][][] numbers4 = new int [2][1][4][1];

        // La nomenclatura de los arreglos debe estar en plural

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length; i++){
            for (int j = 0; j < cities[i].length; j++){
                System.out.println(cities[i][j]);
            }
        }

        int i=1, j=2, k=3, m=2; System.out.println ((j >= i) || (k == m));
    }
}
