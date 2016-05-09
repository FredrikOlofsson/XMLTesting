package xmltesting;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlMagic {
    private final JAXBContext context;
    private Object object;

    public XmlMagic(Object object) throws JAXBException {
        this.object = object;
        this.context = JAXBContext.newInstance(this.object.getClass());
    }
    public Object getObject() {
        return object;
    }
    public void pack(String fileName) throws JAXBException {        
        System.out.println("Packing into an XML!");
        Marshaller marshaller = this.context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(this.object, new File(fileName + ".xml"));
    }   
    public void unpack(String fileName) throws JAXBException {
        System.out.println("Unpacking XML!");
        Unmarshaller unmarsh = this.context.createUnmarshaller();
        this.object = unmarsh.unmarshal(new File(fileName + ".xml")); 
    }
    
    
        // DataBase data = (DataBase) xml.unpack("placeholderName.xml");  
}
