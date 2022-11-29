public class MedhtodLocationMinMax {
    public static void main(String[] args) {
        int [] numberone = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Min value in numberone is : " + fileMininArray(numberone));
        System.out.println("Location of Min value in numberone is : " + findminindex(numberone));
        System.out.println("Max value in numberone is : " + fileMaxinArray(numberone));
        System.out.println("Location of Max value in numberone is : " + findmaxindex(numberone));
        int [] numbertwo = {11,12,13,14,15,16,17,18,19,20};
        System.out.println("Min value in numbertwo is : " + fileMininArray(numbertwo));
        System.out.println("Location of Min value in numbertwo is : " + findminindex(numbertwo));
        System.out.println("Max value in numbertwo is : " + fileMaxinArray(numbertwo));
        System.out.println("Location of Max value in numbertwo is : " + findmaxindex(numbertwo));
        int [] numberthree = {21,22,23,24,25,26,27,28,29,30};
        System.out.println("Min value in numberthree is : " + fileMininArray(numberthree));
        System.out.println("Location of Min value in numberthree is : " + findminindex(numberthree));
        System.out.println("Max value in numberthree is : " + fileMaxinArray(numberthree));
        System.out.println("Location of Max value in numberthree is : " + findmaxindex(numberthree));
        int [] numberfour = {31,32,33,34,35,36,37,38,39,40};
        System.out.println("Min value in numberfour is : " + fileMininArray(numberfour));   
        System.out.println("Location of Min value in numberfour is : " + findminindex(numberfour));
        System.out.println("Max value in numberfour is : " + fileMaxinArray(numberfour));
        System.out.println("Location of Max value in numberfour is : " + findmaxindex(numberfour));
    }
    static int fileMaxinArray (int [] arr){
        //get the max number in the array and reqturns the array
        int maxvalue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
    static int fileMininArray (int [] arr){
        //get the max number in the array and reqturns the array
        int minvalue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
    }
    static int findmaxindex(int [] arr){
        int maxindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxindex){
                maxindex = i;
            }
        }
        return maxindex;
    }
    static int findminindex(int [] arr){
        int minindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minindex){
                minindex = i;
            }
        }
        return minindex;
    }
}
