public class MedthodSwapArray {
    public static void main(String[] args) {
        int [] setofnumberswap = {10,20,30,40,50};
        SwapinArray(setofnumberswap, 0, 4);
        //swap position 0 to position 4  Ex.{10,20,30,40,50} to {50,20,30,40,10}
        displayarray(setofnumberswap);
    }
    static void SwapinArray(int [] a,int x ,int y){
        //x = start position
        //y = position to move
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    static void displayarray(int [] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
    }
}
