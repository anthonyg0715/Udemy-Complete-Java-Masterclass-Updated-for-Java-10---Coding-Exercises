package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller{

    @FXML
    private BorderPane mainPanel;
    private ContactData cd;
    @FXML
    private TableView<Contact> contactsTable;

    public void initialize(){
        cd = new ContactData();
        cd.loadContacts();
        contactsTable.setItems(cd.getContacts());
    }

    @FXML
    public void showActionDialog(){
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainPanel.getScene().getWindow());
        dialog.setTitle("Add New Contact");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactdialog.fxml"));
        try{
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }catch(IOException ioe){
            System.out.println(ioe + " did not load");
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            ContactController cc = fxmlLoader.getController();
            Contact contact = cc.getContact();
            cd.addContact(contact);
            cd.saveContacts();
        }
    }

    public void showEditContactDialog(){
        Contact selectedContact = contactsTable.getSelectionModel().getSelectedItem();
        if(selectedContact == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Contact Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select the contact you want to edit");
            alert.showAndWait();
        }

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainPanel.getScene().getWindow());
        dialog.setTitle("Edit Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactdialog.fxml"));
        try{
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }catch(IOException ioe){
            System.out.println(ioe + " did not load");
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        ContactController cc = fxmlLoader.getController();
        cc.editContact(selectedContact);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            cc.updateContact(selectedContact);
            cd.saveContacts();
        }
    }

    @FXML
    public void deleteContact(){
        Contact selectedContacted = contactsTable.getSelectionModel().getSelectedItem();
        if(selectedContacted == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Contact Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select contact you want to delete");
            alert.showAndWait();
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Contact Selected");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to delete the contact: " + selectedContacted.getFirstName() +
                             " " + selectedContacted.getLastName());

        Optional<ButtonType> optional = alert.showAndWait();
        if(optional.isPresent() && optional.get() == ButtonType.OK){
            cd.deleteContact(selectedContacted);
            cd.saveContacts();
        }
    }

    public void exitApplication(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exiting Application");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to exit the application?");

        Optional<ButtonType> optional = alert.showAndWait();
        if(optional.isPresent() && optional.get() == ButtonType.OK){
            Platform.exit();
        }else if(optional.isPresent() && optional.get() == ButtonType.CANCEL){
            alert.close();

        }

    }

}
