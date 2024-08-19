package fileclass;

import java.io.File;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\javatest\\testfile.txt");
        file.createNewFile();
        System.out.println(file.canWrite()); // is file readable

        System.out.println(file.canRead()); // is file writable
        System.out.println(file.isAbsolute());//path absolute
        System.out.println(file.isDirectory());  //we have provided file path so it will be false

        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.toPath());
        System.out.println(file.toURI());

    }
}
