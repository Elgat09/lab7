import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String currentDir = Path.of("").toAbsolutePath().toString();
        final String FILE_NAME=currentDir + "\\res\\fileToCreate.txt";
        Path newFilePath = Paths.get(FILE_NAME);
        Files.createFile(newFilePath);


        try {

            FileWriter fileWriter = new FileWriter(FILE_NAME);

            fileWriter.write("Hello Java files");

            fileWriter.close();

            System.out.println("Fisierul a fost creat si scris cu succes.");
        } catch (IOException e) {
            System.out.println("A aparut o eroare la operatiile de scriere in fisier: " + e.getMessage());
        }
    }
}

