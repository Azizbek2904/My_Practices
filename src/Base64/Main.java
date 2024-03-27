package Base64;

import java.io.*;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws Exception {
        String files ="/home/azizbek/IdeaProjects/My_Practices/img.png";
        String outputFiles ="set.txt";

        File file = new File(files);
        byte[] fileContents = new byte[(int) file.length()];
            FileInputStream inputStream = new FileInputStream(file);
            inputStream.read(fileContents);

            Base64.Encoder encoder =Base64.getEncoder();
            String encoderString =encoder.encodeToString(fileContents);

        try (FileWriter writer = new FileWriter(outputFiles)) {
            writer.write(encoderString);
        }

        System.out.printf("turi->" + outputFiles);
    }
}
