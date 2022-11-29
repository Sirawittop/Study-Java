public class MedthodSearchArray {
    public static void main(String[] args) {
        int [] numbersearch = {100,200,300,400,500,600,700};
        System.out.println(searchArray(numbersearch, 700));
        // if output == -1 mean con not find in array
        // if output == number 0 to infinity mean number = location of number

    }
    static int searchArray(int [] arr,int number){
        String a = "No search data";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    static void displayarray(int [] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}
