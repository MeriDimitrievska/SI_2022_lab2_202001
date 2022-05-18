import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import  static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void everyStatementTest()
    {
        Exception e=assertThrows(IllegalArgumentException.class, ()->SILab2.function(new ArrayList<>()));
        String expected="List length should be greater than 0";
        String actual=e.getMessage();
        assertTrue(actual.contains(expected));

        String [] strings1={"0", "#", "0"};
        Exception e1=assertThrows(IllegalArgumentException.class, ()->SILab2.function(Arrays.stream(strings1).toList()));
        String expected1="List length should be a perfect square";
        String actual1=e1.getMessage();
        assertTrue(actual1.contains(expected1));

        String [] strings={"#", "0", "#", "0"};
        String [] strings2={"#", "1", "#", "1"};
        assertArrayEquals(strings2, SILab2.function(Arrays.stream(strings).toList()).toArray());

        String [] strings3={"#", "0", "0", "0"};
        String [] strings4={"#", "1", "1", "0"};
        assertArrayEquals(strings4, SILab2.function(Arrays.stream(strings3).toList()).toArray());

        String [] strings5={"#", "#", "0", "0"};
        String [] strings6={"#", "#", "1", "1"};
        assertArrayEquals(strings6, SILab2.function(Arrays.stream(strings5).toList()).toArray());

    }

    @Test
    public void everyBranchTest()
    {
        Exception e=assertThrows(IllegalArgumentException.class, ()->SILab2.function(new ArrayList<>()));
        String expected="List length should be greater than 0";
        String actual=e.getMessage();
        assertTrue(actual.contains(expected));

        String [] strings1={"0", "0", "0"};
        Exception e1=assertThrows(IllegalArgumentException.class, ()->SILab2.function(Arrays.stream(strings1).toList()));
        String expected1="List length should be a perfect square";
        String actual1=e1.getMessage();
        assertTrue(actual1.contains(expected1));

        String [] strings={"#", "0", "#", "0"};
        String [] strings2={"#", "1", "#", "1"};
        assertArrayEquals(strings2, SILab2.function(Arrays.stream(strings).toList()).toArray());

        String [] strings3={"#", "0", "0", "0"};
        String [] strings4={"#", "1", "1", "0"};
        assertArrayEquals(strings4, SILab2.function(Arrays.stream(strings3).toList()).toArray());

        String [] strings5={"#", "#", "0", "0"};
        String [] strings6={"#", "#", "1", "1"};
        assertArrayEquals(strings6, SILab2.function(Arrays.stream(strings5).toList()).toArray());
    }
}
