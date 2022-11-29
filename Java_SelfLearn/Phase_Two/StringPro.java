public class StringPro {
    public static void main(String[] args) {
        String name = "John";                           
        String city = new String ("New York");
        //concatenation
        System.out.println(name +" live in "+ city);
        //or
        String namecity = name + " live in " + city;
        System.out.println(namecity);
        System.out.println(namecity.concat(" and I am a student")); // can use conact() method to concatenate our + sign
        //length
        System.out.println("The Character of name + city = "+namecity.length());  //Combine letters and blank spaces 
        //charAt find location of character
        System.out.println("The Character of name + city = "+namecity.charAt(0)); //first character
        System.out.println("The Character of name + city = "+namecity.charAt(namecity.length()-1)); //last character
        //equals and equalsIgnoreCase if name1 = name2 then it will return true else false
        String name1 = "John";
        String name2 = "john";
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2)); //ignore case UPPER and lower case
        // UPPER String with toUpperCase()
        String top = "Java";
        String hoang = top.toUpperCase();
        System.out.println(hoang);
        //startWith and endWith search the first and last character or string output true or false
        String name3 = "John";
        System.out.println(name3.startsWith("Jo"));
        System.out.println(name3.endsWith("n"));
        System.out.println(name3.endsWith("top")); 

        //convert string to char
        String hoangvandung = "Siriwit kamchoom";
        char [] alphabet = hoangvandung.toCharArray(); 
        System.out.println(alphabet[0]);

        //convert char(list) to string
        char [] alphabet2 = {'J','o','h','n'};
        String result = String.copyValueOf(alphabet2);
        System.out.println(result);

        //delete blank space
        String name4 = "ha nto them aan  ";
        String realname = name.trim();
        System.out.println(realname);

    }
}