class GlobalLocal{
    public static void main(String[] args) {
        //global variable
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        {
            //local variable
            int f = 100;
            System.out.println(f);
        }
        //System.out.println(f); //error
    }
}