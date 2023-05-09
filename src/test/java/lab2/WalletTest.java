package lab2;

import org.junit.Assert;
import org.junit.Test;

public class WalletTest {
    @Test
    public void testingAddSumToWallet() {
        PorteMonnaie wallet1 = new PorteMonnaie();
        SommeArgent sa1 = new SommeArgent(70, "EUR");
        SommeArgent sa2 = new SommeArgent(30, "EUR");
        SommeArgent sa3 = new SommeArgent(200, "TND");
        wallet1.ajouteSomme(sa3);
        wallet1.ajouteSomme(sa1);
        wallet1.ajouteSomme(sa2);

        PorteMonnaie wallet2 = new PorteMonnaie();
        SommeArgent sa4 = new SommeArgent(200, "TND");
        SommeArgent sa5 = new SommeArgent(100, "EUR");
        wallet2.ajouteSomme(sa4);
        wallet2.ajouteSomme(sa5);

        PorteMonnaie wallet3 = new PorteMonnaie();
        SommeArgent sa6 = new SommeArgent(200, "USD");
        SommeArgent sa7 = new SommeArgent(100, "EUR");
        wallet3.ajouteSomme(sa6);
        wallet3.ajouteSomme(sa7);

        System.out.println(wallet1.toString());
        System.out.println(wallet2.toString());
        System.out.println(wallet3.toString());

        Assert.assertTrue(wallet1.equals(wallet2));
        Assert.assertTrue(!wallet1.equals(wallet3));
        Assert.assertTrue(!wallet2.equals(wallet3));
    }
}
