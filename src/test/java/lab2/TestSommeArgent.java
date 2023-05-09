package lab2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class TestSommeArgent {
    SommeArgent m12CHF, m14CHF, m14USD;
    private static int preCount = 0;
    private static int postCount = 0;

    @Before
    public void setUp() {
        m12CHF = new SommeArgent(12, "CHF");
        m14CHF = new SommeArgent(14, "CHF");
        m14USD = new SommeArgent(14, "USD");
        System.out.println("Passage No. " + ++preCount + " before test case execution.");
    }

    @After
    public void tearDown() {
        System.out.println("Passage No. " + ++postCount + " after test case execution.");
    }

    @Test
    public void Testing2SumAddition() {
        SommeArgent expected = new SommeArgent(26, "CHF");
        try {
            SommeArgent result = m12CHF.add(m14CHF);
            Assert.assertTrue(expected.equals(result));
        } catch (UniteDistincteException e) {
            System.out.println(e.toString());
        }
    }

    @Test
    public void TestingEquals() {
        Assert.assertTrue(!m12CHF.equals(null));
        Assert.assertEquals(m12CHF, m12CHF);
        Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
        Assert.assertTrue(!m12CHF.equals(m14CHF));
        Assert.assertTrue(!m14USD.equals(m14CHF));
    }

    @Test(expected = UniteDistincteException.class)
    public void TestingDistinctCurrencies() throws UniteDistincteException {
        m14CHF.add(m14USD);
    }
}
