package ro.siit.homework7;

import org.junit.Test;

import java.time.LocalTime;

import static junit.framework.TestCase.assertEquals;

public class AppTest {

    @Test
    public void testTime(){

        Athlete a = new Athlete("10","Mihai Ion","RO","00:29:30","xxxox","oxoox","xxxox");
        assertEquals(a.getFinalTime(), LocalTime.parse("00:30:20"));
    }



}
