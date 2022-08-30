import javax.swing.*;
import java.text.NumberFormat;
import java.util.Objects;


public abstract class TradingCard
{
    // Specify fields
    protected String mName;
    protected double mPrice;
    protected String mRarity;

    protected static NumberFormat currency = NumberFormat.getCurrencyInstance();

    protected TradingCard(String name, double price, String rarity)
    {
        mName = name;
        mPrice = price;
        mRarity = rarity;
    }

    // gets name
    public String getName()
    {
        return mName;
    }
    // gets price
    public double getPrice()
    {
        return mPrice;
    }
    // get rarity
    public String getRarity()
    {
        return mRarity;
    }

    // sets name
    public void setName(String name)
    {
        mName = name;
    }
    // sets price
    public void setPrice(double price)
    {
        mPrice = price;
    }
    //sets rarity
    public void setRarity(String rarity)
    {
        mRarity = rarity;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradingCard that = (TradingCard) o;
        return Double.compare(that.mPrice, mPrice) == 0 && mName.equals(that.mName) && mRarity.equals(that.mRarity);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(mName, mPrice, mRarity);
    }


}
