package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;

public class ContactController {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField cellNumberField;
    @FXML
    private TextField notesField;

    public Contact getContact(){
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String cellNumber = cellNumberField.getText();
        String notes = notesField.getText();
        Contact newContact = new Contact(firstName,lastName,cellNumber,notes);
        return newContact;
    }

    public void editContact(Contact contact){
            firstNameField.setText(contact.getFirstName());
            lastNameField.setText(contact.getLastName());
            cellNumberField.setText(contact.getCellNumber());
            notesField.setText(contact.getNotes());

    }

    public void updateContact(Contact contact){
            contact.setFirstName(firstNameField.getText());
            contact.setLastName(lastNameField.getText());
            contact.setCellNumber(cellNumberField.getText());
            contact.setNotes(notesField.getText());
    }

}
