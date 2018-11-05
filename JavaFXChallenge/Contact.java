package sample;

import javafx.beans.property.SimpleStringProperty;

public class Contact {

    private SimpleStringProperty firstName = new SimpleStringProperty("");
    private SimpleStringProperty lastName = new SimpleStringProperty("");
    private SimpleStringProperty cellNumber = new SimpleStringProperty("");
    private SimpleStringProperty notes = new SimpleStringProperty("");

    public Contact(){

    }

    public Contact(String firstName, String lastName, String cellNumber, String notes) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.cellNumber.set(cellNumber);
        this.notes.set(notes);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public String getCellNumber() {
        return cellNumber.get();
    }

    public SimpleStringProperty cellNumberProperty() {
        return cellNumber;
    }

    public String getNotes() {
        return notes.get();
    }

    public SimpleStringProperty notesProperty() {
        return notes;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber.set(cellNumber);
    }

    public void setNotes(String notes) {
        this.notes.set(notes);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", cellNumber=" + cellNumber +
                ", notes=" + notes +
                '}';
    }


}
