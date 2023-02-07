package tutorials;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class FileOperations {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/mac/Desktop/Java/Java Tutorial/input.txt");
        boolean exists = Files.exists(path);
        FileTime lastModifiedTime = Files.getLastModifiedTime(path);
        UserPrincipal owner = Files.getOwner(path);

        Path newDirectory = Files.createDirectory(path.getParent().resolve("newDirectory"));
        Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));

        System.out.println(newFile);
    }
}
