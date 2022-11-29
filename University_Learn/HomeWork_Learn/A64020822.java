// created by นายสิรวิชญ์ คำชุ่ม 64020822
public class A64020822 {
    public static void main(String[] args) {
        showRect( 'X' , 4 , 10);
        showRect('#' , 3.3 , 5);
        showRect('P', 6, 20);
    }
    static void showRect(char c, int w, int h){
        for (int trin = 1 ; trin <= 1;trin ++){
            for (int trintrintrin = 0;trintrintrin <= h-1;trintrintrin ++){
                System.out.print(c);
            }
            if(trin > 1 || trin < (w-1)){
                for(int trintrin = 1;trintrin <= (w-2);trintrin++){
                    String baknknk =" ";
                    String aoentu ="";
                    for(int round = 0; round <= (h-3) ;round++){
                        aoentu += baknknk;
                    }
                    System.out.println(aoentu);
                    System.out.print(c+""+aoentu+""+c);
                }
                 System.out.print("\n");
            }
            for (int trintrintrin = 0;trintrintrin <= h-1;trintrintrin ++){
                System.out.print(c);
            }
        }
        System.out.print("\n");
    }
    static void showRect(char c, double w, double h){
        for (int trin = 1 ; trin <= 1;trin ++){
            for (int trintrintrin = 0;trintrintrin <= h-1;trintrintrin ++){
                System.out.print(c);
            }
            if(trin > 1 || trin < (w-1)){
                for(int trintrin = 1;trintrin <= (w-2);trintrin++){
                    String baknknk =" ";
                    String aoentu ="";
                    for(int round = 0; round <= (h-3) ;round++){
                        aoentu += baknknk;
                    }
                    System.out.println(aoentu);
                    System.out.print(c+""+aoentu+""+c);
                }
                 System.out.print("\n");
            }
            for (int trintrintrin = 0;trintrintrin <= h-1;trintrintrin ++){
                System.out.print(c);
            }
        }
        System.out.print("\n");
    }
}





