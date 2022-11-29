public class Medthodone {
    public static void main(String[] args) {
        
        display();
        plus();
        openvideo();
        playvideo();
        closevideo();
        exisprogram();
        

    }
    static void display(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
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
}
