package Json;

 import com.google.gson.Gson;
 import com.google.gson.reflect.TypeToken;
 import org.ietf.jgss.GSSContext;

 import java.nio.file.Files;
 import java.nio.file.Path;
 import java.util.List;
 import java.util.stream.Collectors;

public class StudentsAvarageColculator {
    public static void main(String[] args) throws Exception {
     String Jsonfiles="/home/azizbek/IdeaProjects/My_Practices/studentsAvarage.json";
     String resultsAvarage= "StudentsAvarage.txt";

     String Jsons = Files.readString(Path.of(Jsonfiles));
        Gson gson =new Gson();
        List<Students> students = gson.fromJson(Jsons, new TypeToken<List<Students>>() {}.getType());

        double average =students.stream().collect((Collectors.averagingDouble(Students::getAge)));

        String avaragText ="Avarage age of Students-> " +average;
        Files.writeString(Path.of(resultsAvarage),avaragText);
    }
}
