public class MedhtodCompareArray {
    public static void main(String[] args) {
        int [] numberA = {100,200,300,400,500};
        int [] numberB = {100,200,300,400,500};
        System.out.println("comparison results : " + compareArray(numberA, numberB));
    }
    static Boolean  compareArray(int [] a,int [] b){
        if (a.length != b.length) return false;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
} 
