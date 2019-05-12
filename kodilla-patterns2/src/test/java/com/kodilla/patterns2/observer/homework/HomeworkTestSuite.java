package com.kodilla.patterns2.observer.homework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testUpdateTask() {
        //Given
        Student terryHolland = new Student("Terry Holland");
        Student steffMiller = new Student("Steff Miller");
        Student franSutton = new Student("Fran Sutton");
        Mentor rowanBaker = new Mentor("Rowan Baker");
        Mentor jodySharp = new Mentor("Jody Sharp");

        terryHolland.registerObserver(rowanBaker);
        steffMiller.registerObserver(rowanBaker);
        franSutton.registerObserver(jodySharp);

        //When
        terryHolland.addTask(new Task("Try_Finally",
                "try {\n" +
                        "    return true;\n" +
                        "} finally {\n" +
                        "    return false;\n" +
                        "}"));
        terryHolland.addTask(new Task("Random number generator",
                "public int getRandomNumber() {\n" +
                        "    return 5;\n" +
                        "}"
                ));
        steffMiller.addTask(new Task("Boolean_Filter", "public boolean IsTrue(boolean b)\n" +
                "{\n" +
                "        if (b == true)\n" +
                "        {\n" +
                "                return true;\n" +
                "        }\n" +
                "        return false;\n" +
                "}"
                ));
        franSutton.addTask(new Task("Sleeper",
                "// sleep 150s\n" +
                "for (int i = 0; i < 150 ; i++ ) { \n" +
                "      sleep(1);\n" +
                "}"
                ));
        franSutton.addTask(new Task("Exception_handling",
                "try {\n" +
                        "    // something...\n" +
                        "}\n" +
                        "catch (Exception ex) \n" +
                        "{\n" +
                        "    string uriToLaunch = \"http://stackoverflow.com/search?q=\" + ex.Message;\n" +
                        "    var uri = new Uri(uriToLaunch );\n" +
                        "    var success = await Windows.System.Launcher.LaunchUriAsync(uri );\n" +
                        "}"
                ));

        //Then
        assertEquals(3, rowanBaker.getUpdateCount());
        assertEquals(2, jodySharp.getUpdateCount());
    }
}
