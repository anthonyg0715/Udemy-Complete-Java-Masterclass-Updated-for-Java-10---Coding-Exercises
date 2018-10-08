import java.util.ArrayList;

public class MobilePhone {
    public String myNumber;
    ArrayList<Contacts> phoneFunctionality;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.phoneFunctionality = new ArrayList<Contacts>();
    }

    public boolean addContact(Contacts contact){
        if(findContact(contact.getName()) >= 0){
            return false;
        }
        phoneFunctionality.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }else if(findContact(newContact.getName()) == findContact(oldContact.getName())){
            System.out.println("Contact with name " + newContact.getName() + " already exists");
            return false;
        }

        this.phoneFunctionality.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());

        return true;
    }

    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }

        this.phoneFunctionality.remove(foundPosition);
        System.out.println(contact.getName() + " was removed");
        return true;
    }

    private int findContact(Contacts contact){
        return phoneFunctionality.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0; i<this.phoneFunctionality.size(); i++){
            Contacts contact = this.phoneFunctionality.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0){
            return contact.getName() + " was found";
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.phoneFunctionality.get(position);
        }
        return null;
    }

    public void printContacts(){
        for(int i=0; i<this.phoneFunctionality.size(); i++){
            System.out.println("List of contacts: " + this.phoneFunctionality.get(i).getName() + " " +
                                                      this.phoneFunctionality.get(i).getPhoneNumber());
        }
    }
}
