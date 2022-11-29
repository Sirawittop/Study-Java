public class Test {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        st1.eat();
        st2.eat();
        st1.sleep();
        st2.sleep();
        st1.eat("Kanomjeen");
        String manulist[] = {"Karproooo","Mookrob","Kaidaw"};
        st2.eat(manulist);
    }
}
