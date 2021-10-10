public class Member
{
    // instance variables - replace the example below with your own
    private String email;
    private int membershipNumber;
    private boolean loggedInStatus;
    private Holiday holiday;
    private Website website;

    /**
     * Constructor for objects of class Member
     */
    public Member(String userEmail, int userMembershipNumber)
    {
        email = userEmail;
        membershipNumber = userMembershipNumber;
        loggedInStatus = false;
        holiday = null;
        website = null;
    }
    
        public Member()
    {
        email = "Subhaan@gmail.com";
        membershipNumber = 6732;
        loggedInStatus = false;
        holiday = null;
        website = null;
    }

    public void setLoggedInStatus(boolean userLogInStatus) {
        loggedInStatus = userLogInStatus;
    }
    
    public boolean getLoggedInStatus() {
        return loggedInStatus;
    }
    
    public void setEmail(String userEmail) {
        email = userEmail;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setMembershipNumber(int userMembershipNumber) {
        membershipNumber = userMembershipNumber;
    }
    
    public int getMembershipNumber() {
        return membershipNumber;
    }
    
    public void selectHoliday(Holiday holiday) {
        if (loggedInStatus == true) {
            this.holiday = holiday;
            System.out.println("member ID : " + membershipNumber);
            System.out.println("holiday ref number : " + holiday.getRefNumber());
            System.out.println("holiday type : " + holiday.getType());
            System.out.println("holiday price : £" + holiday.getPrice());
        }
        else if (loggedInStatus == false) {
            System.out.println("Please login before selecting a holiday.");
        }
        
    }
    
    public void payForHoliday() {
        if (holiday != null) {
            website.checkout(this, holiday);
        }
        else {
            System.out.println("Please select a holiday before trying to pay.");
        }
    }
    
    public void setWebsite(Website newWebsite) {
        website = newWebsite;
    }
    
    public Website getWebsite() {
        return website;
    }
}
