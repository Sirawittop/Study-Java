public class AllofMedthod {
    public static void main(String[] args) {

    }
    //medthod 1
    static void display(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    //medthod 2
    static void plus(){
        int a = 100;
        int b = 200;
        int c = a + b;
        System.out.println("sum = "+c);
    }
    static void openvideo(){
        System.out.println("open video");
    }
    static void playvideo(){
        System.out.println("play video");
    }
    static void closevideo(){
        System.out.println("close video");
    }
    static void exisprogram(){
        System.out.println("Clean memory");
        System.out.println("Exit program");
    }
    static void display(String name){ // name is a parameter
        System.out.println("Hello : "+ name);
    }
    static void fullname(String firstname, String lastname){ // firstname and lastname are parameters
        System.out.println("Your full name is : "+firstname+" "+lastname);
    }
    //medthod 3
    static void plus(int firstnumber ,int secondnumber){
        int a = firstnumber;
        int b = secondnumber;
        int c1 = a + b;
        int c2 = a - b;
        int c3 = a * b;
        int c4 = a / b;
        System.out.println("The sum of the two numbers is: " + c1);
        System.out.println("The difference of the two numbers is: " + c2);
        System.out.println("The product of the two numbers is: " + c3);
        System.out.println("The quotient of the two numbers is: " + c4);
    }
    //medthod 4
    static Double getbonus(){
        return 5000.0;
    }
    //medthod 5
    static int maxnumber(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static int minnumber(int a,int b){
        if(a>b){
            return b;
        }
        else{
            return a;
        }
    }
    //medthod compareArray
    static Boolean compareArray(int [] a,int [] b){
        if (a.length != b.length) return false;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    //medthod getdisplayArray
    static void displayarray(int [] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
    //get Array return
    static int fileMaxinArray (int [] arr){
        //get the max number in the array and reqturns the array
        int maxvalue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
    static int fileMininArray (int [] arr){
        //get the max number in the array and reqturns the array
        int minvalue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
    }
    static int findmaxindex(int [] arr){
        int maxindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxindex){
                maxindex = i;
            }
        }
        return maxindex;
    }
    static int findminindex(int [] arr){
        int minindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minindex){
                minindex = i;
            }
        }
        return minindex;
    }
    //medthod copyArray
    static int[] copyArray(int [] arr){
        int [] newarr = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            newarr[i] = arr[i];
        }
        return newarr;

    }
    //medthod searchArray
    static int searchArray(int [] arr,int number){
        String a = "No search data";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    //medthod swapArray
    static void SwapinArray(int [] a,int x ,int y){
        //x = start position
        //y = position to move
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}