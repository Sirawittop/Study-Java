public class ArrayTwoD {
    public static void main(String[] args) {
        String product [][] = {{"apple", "banana", "orange", "pineapple", "strawberry", "watermelon"},
                                {"car", "bus", "truck", "motorcycle", "bike", "scooter"},
                                {"computer", "laptop", "desktop", "tablet", "phone", "smartphone"},
    };
    System.out.println(product[0][0]);
    System.out.println(product[0][1]);
    System.out.println(product[0][2]);
    System.out.println(product[0][3]);
    System.out.println(product[0][4]);
    System.out.println(product[0][5]);
    System.out.println(product[1][0]);
    System.out.println(product[1][1]);
    System.out.println(product[1][2]);
    System.out.println(product[1][3]);
    System.out.println(product[1][4]);
    System.out.println(product[1][5]);
    System.out.println(product[2][0]);
    System.out.println(product[2][1]);
    System.out.println(product[2][2]);
    System.out.println(product[2][3]);
    System.out.println(product[2][4]);
    System.out.println(product[2][5]);
    
    System.out.println("----------------------------------------------------");
    /////////////////////////////////////////////////////////////////////////////// solution one
    for (int i = 0; i < product.length; i++) {
        for (int j = 0; j < product[i].length; j++) {
            System.out.println(product[i][j]);
        }
    }
    }
}

