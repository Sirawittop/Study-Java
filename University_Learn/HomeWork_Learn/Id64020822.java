// create by 64020574 นายฐิติวัฒน์ ขอนทอง
// create by 64020619 นายธาดาศักดิ์ กระแสเทพ
// create by 64020822 นายสพลดนัย พรหมศรี
// create by 64020822 นายสิรวิชญ์ คำชุ่ม
import java.lang.Math;
public class Id64020822 {
    public static void main(String[] args) {
        BankAccount personone = new BankAccount();
        BankAccount persontwo = new BankAccount();
        BankAccount personthree = new BankAccount();
        BankAccount personfour = new BankAccount();
        System.out.println("________________________________");
        personone.setsetset("Thitiwat","Khonthong",60000,64020574);
        persontwo.setsetset("Thadasak","Krasaethep",300000,64020619);
        personthree.setsetset("Sapoldanai","Phromsri",40000,64020811);
        personfour.setsetset("Sirawit","Kamchoom",500000,64020822);
        System.out.print(personone.getfirstname());
    }
}
class BankAccount{
    private String first;
    private String last;
    private int bankknumber;
    private int amount;
    private int interest = 2 ;
    private int sumofnumborxxx;
    String getfirstname(){
        return first;
    }
    String getlastname(){
        return last;
    }
    int getamount(){
        return amount;
    }
    int getbankknumber(){
        return bankknumber;
    }
    void setsetset(String trintrin,String trintrintrin,int trint,int trintrintrintrin){
        this.bankknumber = trint;
        this.first = trintrin;
        this.last = trintrintrin;
        this.amount = trintrintrintrin;
        showanything(bankknumber,first,last,amount);
    }
    void showanything(int iiinitint , String first, String last,int amount){
        System.out.println("BankAccount : "+amount);
        System.out.println("Fullname : "+first +" "+ last);
        System.out.println("Money : "+iiinitint + " BATH");
        System.out.println("Interest : "+ callinterest(this.interest,iiinitint));
        System.out.println("SumofMoney : "+(iiinitint+callinterest(this.interest,iiinitint)) + " BATH");
        System.out.println("________________________________");
    }
    int callinterest(int oo,int ooo){
        sumofnumborxxx = (Math.multiplyExact(oo,ooo)) / 100;
        return sumofnumborxxx;
    }
}