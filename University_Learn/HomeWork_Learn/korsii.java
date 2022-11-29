class Binary{
    static void print(int x,int n) {
    int mask = 1 << n-1;
    for (int i= 0 ; i < n ; i++){
    if ((x & mask ) == 0)
    System.out.print('0'); else
    System.out.print("1"); x<<=1;
    }
    System.out.println(); }
    }
    class TestBinary{
    public static void main (String args[]){
    int A =1234,B=9876;
    System.out.print("A
    System.out.print("B
    System.out.print("A&B
    System.out.print("A|B
    System.out.print("A^B
    System.out.print("A
    System.out.print("A>>4
    System.out.print("A<<4
    System.out.print("~A
    System.out.print("-A
    A=1;
    System.out.print("A>>4 =");
    System.out.print("A>>>4 ="); Binary.print(A>>>4,32); A=-1;
    System.out.print("A ="); Binary.print(A, 32); System.out.print("A>>4 ="); Binary.print(A>>4,32); System.out.print("A>>>4 ="); Binary.print(A>>>=4,32); System.out.println(A);
    } }