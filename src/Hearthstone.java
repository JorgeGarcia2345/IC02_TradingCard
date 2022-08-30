import java.util.Objects;

public class Hearthstone extends TradingCard
{
    private String mCardClass;
    private boolean mGolden;

    // constructor
    public Hearthstone(String name, double price, String rarity, String cardClass, boolean golden)
    {
        super(name, price, rarity);
        mCardClass = cardClass;
        mGolden = golden;
    }

    // gets cardClass
    public String getCardClass() {
        return mCardClass;
    }

    // sets cardClass
    public void setCardClass(String cardClass) {
        mCardClass = cardClass;
    }

    // gets golden status
    public boolean isGolden() { return mGolden; }

    // sets golden status
    public void setGolden(boolean golden) {
        mGolden = golden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hearthstone that = (Hearthstone) o;
        return mGolden == that.mGolden && Objects.equals(mCardClass, that.mCardClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mCardClass, mGolden);
    }

    @Override
    public String toString() {
        return "Hearthstone{" +
                "Name=" + mName +
                ", Price=" + currency.format(mPrice) +
                ", Rarity=" + mRarity +
                ", Card Class=" + mCardClass +
                ", Golden=" + mGolden +
                '}';
    }
}
