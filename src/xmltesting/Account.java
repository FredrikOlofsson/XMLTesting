package xmltesting;

import javax.xml.bind.annotation.XmlElement;

public class Account {
    private String accountName;
    private int accountNumber;
    private String pin;
    private boolean userAuthenticated;

    public Account() { 
        this.userAuthenticated = false;
    }    
    public Account(String accountName, int accountNumber, String accountPassword) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = accountPassword;
        this.userAuthenticated = false;
    }
    ///////////////////
    
    //Setters & Getters
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountPassword(String accountPassword) {
        this.pin = accountPassword;
    }

    @XmlElement
    public String getAccountName() {
        return accountName;
    }
    @XmlElement
    public int getAccountNumber() {
        return accountNumber;
    }
    @XmlElement
    public String getAccountPassword() {
        return pin;
    }
       
    ///////////////////
    public boolean isUserAuthenticated() {
        return userAuthenticated;
    }
    public boolean validateUser(String userPIN){
        return (userPIN == null ? this.pin == null : userPIN.equals(this.pin));
    }

   
    
    @Override
    public String toString() {
        return accountNumber + " " + pin;
    }
}
