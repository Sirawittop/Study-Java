public class DoWhile {
    public static void main(String[] args) {
        //////////////////////////////////////////// solution for loop
        int i = 0;
        do {
            System.out.print(i);
            System.out.println(" Hello");
            i++;
        } while (i < 10);
        //////////////////////////////////////////// solution for loop
        int j = 0;
        do {
            if(j == 5) break;
            System.out.print(j);
            System.out.println(" Hello");
            j++;
        } while (j < 10);
    }
}
//" do{ condition to repeat
//}while(condition);

// do while = do before while
// while = while after do
    