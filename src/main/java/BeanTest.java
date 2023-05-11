import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Album album1 = new Album(1, "Taylor Swift","1989", "2014", "10", "Pop");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album1));


        ArrayList<Album> albums = new ArrayList<>();

    }
}
