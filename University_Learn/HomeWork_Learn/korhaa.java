public class korhaa {
    public static void main(String[] args) {
        printName("Trin","Teen",10);
        printName("Love","Teen",5);
        printName("Dad","Teen",5);
        printName("O","Teen",5);
        printName("MakMak","Teen",5);
        
    }
    static void printName(String a , String b, int x){
        String nameupper = b.toUpperCase();
        String namelower = a.toLowerCase();
        for (int trinlovedad_o = 1 ; trinlovedad_o <= x; trinlovedad_o++){
            System.out.println(a+" "+nameupper+" "+namelower+" *"+trinlovedad_o);
        }
        System.out.println("_____________________\n");
    }
}
