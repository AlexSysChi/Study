
package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Nio2Test {

    public static void main(String[] args) throws IOException {

        // Get file info
        String srcFileName = "src/main/resources/source.txt";
        Path srcPath = Paths.get(srcFileName);
        boolean exists = Files.exists(srcPath);
        boolean isDirectory = Files.isDirectory(srcPath);
        boolean isHidden = Files.isHidden(srcPath);
        boolean isReadable = Files.isReadable(srcPath);
        boolean isRegularFile = Files.isRegularFile(srcPath);
        boolean isWritable = Files.isWritable(srcPath);

        System.out.println(srcFileName + "\n\texists: " +  exists +
                "\n\tisDirectory: " + isDirectory +
                "\n\tisHidden: " + isHidden +
                "\n\tisReadable: " + isReadable +
                "\n\tisRegularFile: " + isRegularFile +
                "\n\tisWritable: " + isWritable);

        // Copy file
        String trgFileName = "src/main/resources/target.txt";
        Path trgPath = Paths.get(trgFileName);
        //if (!Files.exists(trgPath)){
            Files.copy(srcPath, trgPath);
        //}

        //  Read a text file
        List<String> lines = Files.readAllLines(srcPath);
        for (String line: lines) {
            System.out.println(line);
        }

        // Delete file
        Files.delete(trgPath);
    }
}
