package test;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class test {

    @Test
    public void testAdd(){
        assertEquals(42, Integer.sum(19, 23));
    }
}