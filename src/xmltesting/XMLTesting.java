package xmltesting;
import javax.xml.bind.JAXBException;

//Creates a file named "AccountData.xml".
public class XMLTesting {
    public static void main(String[] args) throws JAXBException{
        Account acc = new Account(123,"pass");
        acc.pack();
    }
} 