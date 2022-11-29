public class NestedLoop {
    public static void main(String[] args) {
        //loop outside
        for(int i = 1; i <= 3 ; i++ ){
        System.out.println("round of i = "+ i);
            //loop inside
            for(int j = 1; j <= 5 ; j++ ){
            System.out.println("round of j = "+ j);
            }
        }

        /////////////////////////////////////////////// while loop
        int i = 1, j = 1;
        while(i <= 3){
            System.out.println("round of i solution 2 = "+ i);
            while(j <= 5){
                System.out.println("round of j solution 2  = "+ j);
                j++;
            }
            i++;
        }
    }
}