public class ForLoopArray {
    public static void main(String[] args) {
        String [] name = {"John", "Mary", "Peter", "Tom", "Jerry", "Jack", "Alice"};
        /////////////////////////////////////////////////////////////////////////////// solution 1ß
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);
        System.out.println(name[6]);
        
        //////////////////////////////////////////////////////////////////////////////// solution 2
        for (int i = 0; i < name.length; i++) {
            //System.out.println("Name[" + i + "] = " + name[i]);
            System.out.println(name[i]);
        }
    }
}
