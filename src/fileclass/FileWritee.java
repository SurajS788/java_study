package fileclass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritee {

    public static void main(String[] args)throws IOException {
        File file = new File("E:\\javatest\\testfile.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("this is just a example to how to write in file");
        fw.flush();
        fw.close();

    }
}
