package lab2;

import javax.sound.sampled.Port;
import java.util.HashMap;

public class PorteMonnaie {
    private HashMap<String, Integer> contenu;

    public HashMap<String, Integer> getContenu() {
        return contenu;
    }

    public PorteMonnaie() {
        contenu = new HashMap<String, Integer>();
    }

    public void ajouteSomme(SommeArgent sa) {
        String key = sa.getUnite();
        Integer value = sa.getQuantite();
        if (contenu.containsKey(key)) {
            value += contenu.get(key);
        }
        contenu.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("In my wallet, I have ");
        for (String currency : contenu.keySet()) {
            SommeArgent sa = new SommeArgent(contenu.get(currency), currency);
            sb.append(sa.toString() + ", ");
        }
        sb.append("and that's it :( \n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PorteMonnaie)) return false;
        PorteMonnaie pm = (PorteMonnaie) obj;
        HashMap<String, Integer> otherContent = pm.getContenu();
        if (otherContent.size() != contenu.size()) return false;
        for (String currency : contenu.keySet()) {
            if (!contenu.get(currency).equals(otherContent.get(currency)) || !otherContent.containsKey(currency))
                return false;
        }
        return true;
    }
}
