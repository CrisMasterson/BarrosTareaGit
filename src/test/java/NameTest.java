import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    private Name name;
    @Before
    public void before(){
        this.name = new Name("Cristhian");
    }
    @Test
    public void methodReturn1(){
        assertEquals(9,this.name.methodReturn1() );
    }
    @Test
    public void methodReverse2(){
        assertEquals("naihtsirC",this.name.methodReverse2());
    }
}