public class VariableAgument {
    public static void main(String[] args) {
        summation(10,20,30,40,50,30,50);
    }   
    //m////////////////////////////////////////////edthod solution one is so hard to wrtie if you want to use it in your program 
    //////////////////////////////////////////////////////////////////you can use agument as a parameter
    public static void summation(int a , int b){
        int sum = a + b;
        System.out.println("Summation of two numbers is : "+ sum);
    }
    public static void summation(int a , int b,int c){
        int sum = a + b + c;
        System.out.println("Summation of two numbers is : "+ sum);
    }
    public static void summation(int a , int b,int c,int d){
        int sum = a + b + c + d;
        System.out.println("Summation of two numbers is : "+ sum);
    }
    //////////////////////////////////////////////////////////////////solution two is easy to write so short very very very short
    public static void summation(int ...number){
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        System.out.println("Summation of two numbers is : "+ sum);
    }
}
