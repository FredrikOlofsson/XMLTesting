package xmltesting;

import java.io.File;
import java.io.FilenameFilter;

public class Login {    
    private Keypad keypad;
    private String accountName;
    private String accountPin;
    
    //ask for account name and password
    //find xml depending on account name
    //unpack xml
    //check if password is same as %account%.xml
    //if all is working print "works" else "error"    

    public Login() {
        this.keypad = new Keypad();
    }
    ///////////////////
    
    public void startNewLogin(){
        System.out.println("\nPlease enter your account name: ");
        this.accountName = keypad.getString();
        System.out.println("\nEnter your Pin: ");
        this.accountPin = keypad.getString();
    }
    
    private boolean foundXML(String accountName){
        File folder = new File("user.dir");
        File[] listOfFiles = folder.listFiles();
        for (File file: listOfFiles){
            String fileName = file.getName();
            if (fileName.equals(accountName))
               return true;
        }   
            return false;
    }
        
        
    
private void authenticateUser(Account accountName){
        System.out.println("\nPlease enter your account number: ");
        this.accountName = keypad.getString();
        System.out.println("\nEnter your Pin: ");
        this.accountPin = keypad.getString();
        
        
        //check if authentication was succsessful
        if(!accountName.isUserAuthenticated()){
            accountName.validateUser(accountPin);
        } else{
            System.out.println("\nPlease enter your account number: ");
        }        
    }
}