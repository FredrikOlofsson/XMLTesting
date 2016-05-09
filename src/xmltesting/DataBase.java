package xmltesting;

import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DataBase {
    private ArrayList<Account> list;
    JAXBContext context;

    public DataBase() {
        list = new ArrayList<>();
    }
    ///////////////////
    public void init() throws JAXBException{
        this.context = JAXBContext.newInstance(DataBase.class);
    }
    public void setDatabaseAccounts(ArrayList<Account> databaseAccounts) {
        this.list = databaseAccounts;
    }
    
    @XmlElement
    public ArrayList<Account> getList() {
        return list;
    }
    ///////////////////
    
    public final void addAccount(Account newAccount){
        this.list.add(newAccount);
    }  
    public void printAccountsInfo() {
        System.out.println("Accounts : " + list.size());
        for (Account i : list){
            System.out.println(i.toString());
        }
    } 

    @Override
    public String toString() {
        return "AccountsArray : " + "databaseAccounts :\n" + list;
    }
}
