import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("강한친구 대한육군\n");
        bw.write("강한친구 대한육군");
        bw.flush();
        bw.close();
    }
}