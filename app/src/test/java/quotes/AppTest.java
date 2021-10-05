/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void jsonFileObjectTest(){
        ArrayList<Quotes> quotes= new ArrayList<>();
        try {
            FileReader jsonFile = new FileReader("/home/nawal/401/quotes/app/src/main/resources/recentquotes.json");
            quotes = App.readJsonFile(jsonFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals("Charles Dickens",quotes.get(1).getAuthor());
        assertEquals("18651 likes",quotes.get(0).getLikes());

    }
}
