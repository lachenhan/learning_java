package chapter02;

public class java03_datatype {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String name = "Xiao";
        // bit 数据运算的最小单位
        // byte 数据的最小储存单位  1 byte = 8 bit
        // 1024 Byte = 1024 Kilobyte 
        // 1024 KB = 1 MegaByte
        // 1024 MB = 1 GegaByte
        // 1024 Gegabyte = 1 TeraByte

        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = 10.0F; // float must end with F/f
        double bb = f;
        System.out.println(bb);

        int i_new = (int)f; // datatype change by force, must use ()
        System.out.println(i_new); 
    }
    
}
