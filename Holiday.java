
/**
 * Write a description of class Holiday here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Holiday
{
    // instance variables - replace the example below with your own
    private String refNumber;
    private String type;
    private int price;

    /**
     * Constructor for objects of class Holiday
     */
    public Holiday(String userRefNumber, String userType, int userPrice)
    {
        refNumber = userRefNumber;
        type = userType;
        price = userPrice;
    }
    
    public Holiday()
    {
        refNumber = "W1473";
        type = "touring";
        price = 550;
    }
    
    public String getRefNumber() {
        return refNumber;
    }
    
    public void setRefNumber(String newRefNumber) {
        refNumber = newRefNumber;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String newType) {
        type = newType;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int newPrice) {
        price = newPrice;
    }
    
}
