/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Fraction {

    public int topN;
    public int btmN;

    public String toFraction() {
        return topN + "/" + btmN;
    }

    public String toFloat() {
        return "" + ((double) topN / (double) btmN);
    }

    public void addFraction(Fraction n) {
        if (this.btmN == n.btmN) {
            this.topN = this.topN + n.topN;
        } 
        else {
            this.topN = (this.topN * n.btmN) + (n.topN * this.btmN);
            this.btmN = this.btmN * n.btmN;
        }
    }
}
