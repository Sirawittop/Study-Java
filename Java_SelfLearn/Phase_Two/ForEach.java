public class ForEach {
    public static void main(String[] args) {
        int [] number = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250};
        String [] fruit = {"apple", "banana", "orange", "pineapple", "strawberry", "watermelon"};
        for(int num : number) {
            System.out.println(num);
        }
        for(String fru : fruit) {
            System.out.println(fru);
        }
        /////////////////////////////////////////////////////////////////////////////// calculate sum of array
        int sum = 0;
        for(int data : number) {
            sum += data;
    }
    System.out.println(sum);
}
}