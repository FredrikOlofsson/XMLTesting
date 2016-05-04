package xmltesting;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Account {
    private int accountNumber;
    private String accountPassword;
    private JAXBContext context;

    public Account() {    }    
    public Account(int accountNumber, String accountPassword) {
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
    }
    ///////////////////////////////
    public void init() throws JAXBException{
        this.context = JAXBContext.newInstance(Account.class);
    }
  
    public void pack() throws JAXBException {
        this.context = JAXBContext.newInstance(Account.class);
        
        Marshaller marshaller = this.context.createMarshaller();
        marshaller.marshal(new Account(this.accountNumber,this.accountPassword),
                new File("AccountData2.xml"));
    }
    public void unpack() throws JAXBException {
        Unmarshaller unmarshaller = this.context.createUnmarshaller();
        Object unmarshal = unmarshaller.unmarshal(new File("bankDB.xml"));
        System.out.println("unmarshal = " + unmarshal);
    }
    
    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", accountPassword=" + accountPassword + '}';
    }
}
