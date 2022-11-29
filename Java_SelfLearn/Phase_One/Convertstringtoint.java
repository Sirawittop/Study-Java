public class Convertstringtoint {
    public static void main(String[] args) {
        //convert string to int
        String str = "123";
        String str2 = "456";
        int i = Integer.parseInt(str);
        int j = Integer.parseInt(str2);
        System.out.println(i+j);
        
        //convert int to string
        int k = 123;
        String str3 = String.valueOf(k);
        System.out.println(str3);
        
        //convert string to double
        String str4 = "123.456";
        double d = Double.parseDouble(str4);
        System.out.println(d);
        
        //convert double to string
        double d2 = 123.456;
        String str5 = String.valueOf(d2);
        System.out.println(str5);
        
        //convert string to boolean
        String str6 = "true";
        boolean b = Boolean.parseBoolean(str6);
        System.out.println(b);
        
        //convert boolean to string
        boolean b2 = true;
        String str7 = String.valueOf(b2);
        System.out.println(str7);
        
        //convert string to char
        String str8 = "a";
        char c = str8.charAt(0);
        System.out.println(c);
        
        //convert char to string
        char c2 = 'a';
        String str9 = String.valueOf(c2);
        System.out.println(str9);

        //check variable type
        Integer i2 = 123;
        Double d3 = 123.456;
        String str10 = "123";
        Boolean b3 = true;
        Character c3 = 'a';
        System.out.println(i2 instanceof Integer);
        System.out.println(d3 instanceof Double);
        System.out.println(str10 instanceof String);
        System.out.println(b3 instanceof Boolean);
        System.out.println(c3 instanceof Character);
    
    }


    
}
