package prueba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CC1Test {

    private CC1 Obj;

    @Before
    public void before() {
        Obj = new CC1();
    }

    @Test
    public void testM1() {
        assertEquals("m1", Obj.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m1", Obj.m1());
    }

}
