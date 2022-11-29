public class Return {
    public static void main(String[] args) {
        connectserver(200);
    }
    public static void connectserver(int ping){
        System.out.println("Ping = " + ping);
        if (ping > 100){
            System.out.println("Disconnect server");
            return;
        }
        System.out.println("connect server");

    }

}
