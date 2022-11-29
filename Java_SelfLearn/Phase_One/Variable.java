class Variable {
    public static void main(String[] args) {
        int a = 10; //นิยามตัวแปรแบบระบุค่าเริ่มต้น
        int b = 20;
        int numberone; //นิยามตัวแปรแบบไม่ระบุค่าเริ่มต้น
        boolean status;
        int x, y, z; //นิยามตัวแปรในบรรทัดเดียว
        final int MAX = 100; //นิยามตัวแปรที่ไม่สามารถเปลี่ยนแปลงค่าได้ and ไม่สามรถกำหนดเป็นตัวแปรไม่ระบุค่าได้
        int c = a + b; //คำนวณตัวแปร
        System.out.println(c); //แสดงผลออกจากหน้าจอ
    }
}