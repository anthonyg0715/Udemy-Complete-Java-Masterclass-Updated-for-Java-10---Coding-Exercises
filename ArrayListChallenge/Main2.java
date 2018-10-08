import java.util.Scanner;

public class Main2 {
    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("555-0123");
    public static void main(String[] args) {
        /**
         * create a class contacts for name and phoneNumber with return type String.
         * create a constructor, getters, and a method that stores the contacts records using the constructor with return
         * type Contact for the method.
         * Create a masterclass MobilePhone with an ArrayList that holds all contacts. The mobile phone class should have
         * the ability to store new contacts, modify contacts, remove, and query contacts.
         * Hint: When adding or updating be sure to check if the contact already exists using name
         * In the main menu be sure to implement options for printing list of contacts, adding, removing, update existing,
         * and search/find contact and quiting the program.
         */

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("Enter number to choose what to do: ");
            int action = scan.nextInt();
            scan.nextLine();
            switch(action){
                case 0:
                    System.out.println("Shutting Down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateExistingContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void updateExistingContact(){
        System.out.println("Enter existing name");
        String name = scan.nextLine();
        Contacts existingRecord = mobilePhone.queryContact(name);
        if(existingRecord == null){
            System.out.println("Contact Not Found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scan.nextLine();
        System.out.println("Enter new contact number");
        String newNumber = scan.nextLine();
        Contacts newContact = Contacts.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingRecord,newContact)){
            System.out.println("Updated Successfully");
        }else{
            System.out.println("Error Updating Record");
        }
    }

    private static void removeContact(){
        System.out.println("Enter existing name");
        String name = scan.nextLine();
        Contacts existingRecord = mobilePhone.queryContact(name);
        if(existingRecord == null){
            System.out.println("Contact Not Found");
            return;
        }

        if(mobilePhone.removeContact(existingRecord)){
            System.out.println("Successful Removal Of Record");
        }else{
            System.out.println("Error Deleting");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing name");
        String name = scan.nextLine();
        Contacts existingRecord = mobilePhone.queryContact(name);
        if(existingRecord == null){
            System.out.println("Contact Not Found");
            return;
        }

        System.out.println("Name: " + existingRecord.getName() + "Number " + existingRecord.getPhoneNumber());
    }

    private static void addNewContact(){
        System.out.println("Enter contact name");
        String name = scan.nextLine();
        System.out.println("Enter phone number");
        String number = scan.nextLine();
        Contacts contact = Contacts.createContact(name,number);
        if(mobilePhone.addContact(contact)){
            System.out.println("New Contact Added" + " with name " + name + " and number " + number);
        }else{
            System.out.println("Can't add " + name + " already on file");
        }
    }

    private static void startPhone(){
        System.out.println("Starting phone....");
    }

    private static void printActions(){
        System.out.print("\t 0 - To shutdown");
        System.out.print("\t 1 - To print contacts");
        System.out.print("\t 2 - To add new contacts");
        System.out.print("\t 3 - To update existing contact");
        System.out.print("\t 4 - To remove contact");
        System.out.print("\t 5 - To query if a contact exist");
        System.out.print("\t 6 - To print a list of available actions");
        System.out.println("Choose your action: ");
    }
}
