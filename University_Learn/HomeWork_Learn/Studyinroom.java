public class Studyinroom {
    public static void main(String[] args) {
        A personone = new A();
        personone.getinput(20,30);
        System.out.println(personone.geta1());
        System.out.println(personone.getb1());
        personone.seta1(100);
        System.out.println(personone.geta1());
        personone.setb1(200);
        System.out.println(personone.getb1());

        
    }
}
class A {
    private int a1;
    private int b1;
    void getinput(int o , int f){
        this.a1 = o;
        this.b1 = f;
    }
    int geta1(){
        return this.a1;
    }
    int getb1(){
        return this.b1;
    }
    void seta1(int z){
        this.a1 = z;
    }
    void setb1(int y){
        this.b1 = y;
    }
}
