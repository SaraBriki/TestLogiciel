package lab2;

public class SommeArgent {
    private int quantite;
    private String unite;

    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    public SommeArgent add(SommeArgent m) throws UniteDistincteException {
        if (!m.getUnite().equals(this.getUnite())) {
            throw new UniteDistincteException(this, m);
        } else return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject instanceof SommeArgent) {
            return (((SommeArgent) anObject).quantite == this.quantite && ((SommeArgent) anObject).unite == this.unite);
        }
        return false;
    }

    public String toString(){
        return Integer.toString(this.quantite) + this.unite;
    }
}
