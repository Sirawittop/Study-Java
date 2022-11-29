public class CharracterPro{
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////////////solution one
        char alphabet = 'a';
        char [] groupchar = {'a', 'b', 'c'};
        System.out.println("alphabet = " + alphabet);
        System.out.println("groupchar = " + groupchar[1]);
        ////////////////////////////////////////////////////////////////////////////////solution two
        char x = '2';
        System.out.println("alphabet solution two = "+alphabet);
        System.out.println("Is alphabettwo is letter ? = "+ Character.isLetter(alphabet)); //check if it is a letter
        System.out.println("Is alphabettwo is Digit ? = "+ Character.isDigit(x)); //check if it is a digit
        System.out.println("Is alphabettwo is UppleCase ? = "+ Character.isUpperCase(alphabet)); //check if it is a uppleCase
        System.out.println("Is alphabettwo is LowerCase ? = "+ Character.isLowerCase(alphabet)); //check if it is a lowerCase

        System.out.println("before  = " + alphabet);
        char result = Character.toUpperCase(alphabet);
        System.out.println("after = " + result);


    }

        

}
