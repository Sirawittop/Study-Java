public static void main(String[] args) {
    showRect(10,4,'x');
    showRect(5,3,'#');
    showRect(7,6,'P');
    }
    
    private static void showRect(int w,int h,char c) {
    printHorizontal(w,c);
    for(int j=0;j<h-2;j++) {
    printVertical(w,c);
    }
    printHorizontal(w,c);
    }
    
    private static void printVertical(int w, char c) {
    System.out.print(c);
    for (int j = 0; j < w-2; j++) {
    System.out.print(' ');
    }
    System.out.println(c);
    }
    
    private static void printHorizontal(int w,char c) {
    for (int j = 0; j < w-1; j++) {
    System.out.print(c);
    }
    System.out.println(c);
    }