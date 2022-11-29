public class StringPro2 {
    public static void main(String[] args) {
        
        String maseg = "Happy New Year 2020| Happy Birthday 2020";
        String hoang = maseg.replace("2020", "2021");
        String honag2 = maseg.replaceFirst("2020", "2021");
        System.out.println(maseg);
        System.out.println(hoang);
        System.out.println(honag2);

        //split string
        String data = "Apple,Banana,Grange,Grape";
        String fruits[] = data.split(",");
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);

        //substring
        String name = "Johnsocuteverymuchintheworld";
        System.out.println(name.substring(0,4));

        //delete blank space
        String name4 = "    han toth em aan  ";
        String namesatu = name4.trim();
        System.out.println(namesatu);

        //convert number(int) to string
        int number = 100;
        String result = String.valueOf(number);
        System.out.println(result); 

        //convert number(double) to string
        double number2 = 100.5;
        String result2 = String.valueOf(number2);
        System.out.println(result2);
        
    }
}
