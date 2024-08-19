package fileclass;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("E:\\javatest\\testfile.txt");
//        int i;
//        while((i=fr.read())!=-1){
//            System.out.print((char) i);
//        };

        System.out.println(fr);

    }
}

