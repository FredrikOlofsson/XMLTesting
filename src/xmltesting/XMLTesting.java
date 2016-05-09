package xmltesting;
import java.io.File;
import javax.xml.bind.JAXBException;
import java.io.FilenameFilter;
import java.util.Arrays;


//Creates a file named "AccountData.xml".
public class XMLTesting {
    public static void main(String[] args) throws JAXBException{
        Account acc1 = new Account("fred", 141511136, "password");
        Account acc2 = new Account("ida", 312342335, "password");
        Account acc3 = new Account("olle", 212312675, "password");
        Account acc4 = new Account("oaa", 215212675, "password");
        
        DataBase d1 = new DataBase();
        d1.addAccount(acc1);
        d1.addAccount(acc2);
        d1.addAccount(acc3);
        d1.addAccount(acc4);
      
        XmlMagic xml = new XmlMagic(d1);
        xml.pack("Accounts");
        xml.unpack("Accounts");
        DataBase d2 = (DataBase) xml.getObject();
        
        // DataBase data = (DataBase) xml.unpack("placeholderName.xml");       
        
    }
} 