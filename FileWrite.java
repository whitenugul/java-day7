import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

// import java.io.*; // -> 전체를 가져오면 io에 속한 모든 것을 가져오니 메모리 소모가 심할 수 있다.
public class FileWrite {
    public static void main(String[] args) throws IOException{
        // FileOutputStream output = new FileOutputStream("out.txt");

        // for (int i = 1; i < 11; i++){
        //     String data = i + " Line. \r\n ";
        //     output.write(data.getBytes());
        // }


        // output.close();

        FileWriter fw = new FileWriter("out.txt");
        for (int i = 1; i < 11; i++){
            String data = i + " Line. \r\n ";
            fw.write(data);
        }
        fw.close();

        PrintWriter pw = new PrintWriter("out2.txt");
        for (int i = 1; i < 11; i++){
            String data = i + " 안영준.";
            pw.println(data);
        }
        pw.close();


        FileWriter fw2 = new FileWriter("out.txt", true);
        for (int i = 11; i < 21; i++){
            String data = i + " line.\r\n";
            fw2.write(data);
        }
        fw2.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("out2.txt", true));
        for (int i = 11; i < 21; i++){
            String data = i + " 안영준.";
            pw2.println(data);
        }
        pw2.close();
    }
}
