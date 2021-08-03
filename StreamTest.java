import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;

public class StreamTest{
    public static void main(String[] args) throws Exception{
        InputStream in = System.in;

        // int a;
        // int b;
        // int c;

        // a = in.read();
        // b = in.read();
        // c = in.read();

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // byte[] a = new byte[3]; //byte로 배열을 만들때에는 무조건 길이를 정해야 한다.
        // in.read(a);

        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);

        // InputStreamReader reader = new InputStreamReader(in);
        // char[] a= new char[3];
        // reader.read(a);

        // System.out.println(a);

        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);



    }
}