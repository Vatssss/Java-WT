import java.io.*;

class learndatainpstream {
    public static void main(String args[]) {
        DataInputStream ds = new DataInputStream(System.in);
        int a = Integer.parseInt(ds.readLine());
        float b = Float.parseFloat(ds.readLine());
        System.out.print(a);
        System.out.print(b);
    }

}