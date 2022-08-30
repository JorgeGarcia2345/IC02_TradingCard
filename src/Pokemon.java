import java.util.Objects;

public class Pokemon extends TradingCard
{
    private String mEnergyType;
    private int mHitPoints;

    // constructor
    public Pokemon(String name, double price, String rarity, String energyType, int hitPoints) {
        super(name, price, rarity);
        mEnergyType = energyType;
        mHitPoints = hitPoints;
    }

    // gets energyType
    public String getEnergyType() {
        return mEnergyType;
    }
    // set energyType
    public void setEnergyType(String energyType) {
        mEnergyType = energyType;
    }
    // gets hitPoints
    public int getHitPoints() {
        return mHitPoints;
    }
    // sets hitPoints
    public void setHitPoints(int hitPoints) {
        mHitPoints = hitPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pokemon pokemon = (Pokemon) o;
        return mHitPoints == pokemon.mHitPoints && Objects.equals(mEnergyType, pokemon.mEnergyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mEnergyType, mHitPoints);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "Name=" + mName +
                ", Price=" + currency.format(mPrice) +
                ", Rarity=" + mRarity +
                ", Energy Type=" + mEnergyType +
                ", Hit Points=" + mHitPoints +
                '}';
    }
}
