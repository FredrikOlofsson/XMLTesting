package xmltesting;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author Itla
 */
public class AccountTest {

    private JAXBContext context;
    
    @Before
    public void init() throws JAXBException{
        this.context = JAXBContext.newInstance(Account.class);
    }

    @Test
    public void serialization() throws JAXBException {
        Marshaller marshaller = this.context.createMarshaller();
        marshaller.marshal(new Account(123,"password"), new File("bankDB.xml"));
    }
    
}
