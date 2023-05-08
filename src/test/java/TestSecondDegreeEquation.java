import org.junit.Test;
import test.lab1.SecondDegreeEquation;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
public class TestSecondDegreeEquation {
    @Test
    public void test2Racines(){
        SecondDegreeEquation eq = new SecondDegreeEquation(1,1,-2);
        double solutions[] = {1, -2};
        assertArrayEquals(solutions, eq.calculRacines(), 0);
    }

    @Test
    public void test1Racine(){
        SecondDegreeEquation eq = new SecondDegreeEquation(1,-2,1);
        double solutions[] = {1};
        assertArrayEquals(solutions, eq.calculRacines(), 0);
    }

    @Test
    public void testPasDeRacineReelle(){
        SecondDegreeEquation eq = new SecondDegreeEquation(1,1,1);
        assertNull(eq.calculRacines());
    }
}
