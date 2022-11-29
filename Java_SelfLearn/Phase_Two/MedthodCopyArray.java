public class MedthodCopyArray {
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50,60,70,80};
        int [] numberB = copyArray(numberA);
        displayarray(numberA);
        displayarray(numberB);
    }
    static int[] copyArray(int [] arr){
        int [] newarr = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            newarr[i] = arr[i];
        }
        return newarr;

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
