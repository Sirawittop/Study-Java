public class Makearray {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////////////////// solution 1
        int [] number = new int[4];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        /////////////////////////////////////////////////////////////////////////////// solution 2
        int [] number2 = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250};
        /////////////////////////////////////////////////////////////////////////////// change value of array
        System.out.println("Position two (number2)(before) = " + number2[2]);
        number2[2] = 100;
        System.out.println("Position two (number2)(after) = " + number2[2]);

        /////////////////////////////////////////////////////////////////////////////// count number of element in array
        System.out.println("Number of element in number2 = " + number2.length);
        /////////////////////////////////////////////////////////////////////////////// solution 2 to count number of element in array
        int size = number2.length;
        System.out.println("Number of element in number2 = " + size);

        
    }
}
