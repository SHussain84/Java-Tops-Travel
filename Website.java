public class Website
{
    // instance variables - replace the example below with your own
    private String websiteName;
    private int hits;
    private float salesTotal;

    /**
     * Constructor for objects of class Website
     */
    public Website(String userWebsiteName)
    {
        websiteName = userWebsiteName;
        hits = 0;
        salesTotal = 0;
    }
    
    public Website()
    {
        websiteName = "Club 18";
        hits = 9;
        salesTotal = 100;
    }

    public void memberLogin(Member member)
    {
        member.setLoggedInStatus(true);
        System.out.println(websiteName + " welcomes member " + member.getMembershipNumber() + ", you are now logged in");
        hits += 1;
        member.setWebsite(this);
    }
    
    public void memberLogout(Member member) {
        member.setLoggedInStatus(false);
        System.out.println("You are now logged out.");
    }
    
    public String getWebsiteName() {
        return websiteName;
    }
    
    public void setWebsiteName(String newWebsiteName) {
        websiteName = newWebsiteName;
    }
    
    public int getHits() {
        return hits;
    }
    
    public void setHits(int newHits) {
        hits = newHits;
    }
    
    public float getSalesTotal() {
        return salesTotal;
    }
    
    public void setSalesTotal(float newSalesTotal) {
        salesTotal = newSalesTotal;
    }
    
    public void checkout(Member member, Holiday holiday) {
        checkHitDiscount();
        float finalPrice = holiday.getPrice();
        if (checkHitDiscount() == true) {
            System.out.println("Congratulations, you are one of the chosen members for a 10% discount!");
            finalPrice *= 0.9f;
            System.out.println(finalPrice);
            salesTotal += finalPrice;
            System.out.println(salesTotal);
        }
        else if (checkHitDiscount() == false) {
            salesTotal += finalPrice;
        }
        System.out.println("Your transaction has been completed!");
        memberLogout(member);
    }
    
    public boolean checkHitDiscount() {
        if (hits % 10 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
