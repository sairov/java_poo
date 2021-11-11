package model;

import java.sql.Date;
import java.util.Calendar;

public class Person {
    static int personsQuantity;
    private int id;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String adress;
    private String dni;
    private String cuit;
    private int age;
    private String dateOfBirth;
    private boolean isClient;

    public Person(String name, String lastName, String phoneNumber, String adress, String dni, String cuit, String dateOfBirth) {
        this.id = ++this.personsQuantity;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.dni = dni;
        this.cuit = cuit;
        this.dateOfBirth = dateOfBirth;
        this.age =  Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(dateOfBirth.split("/")[2]); // 10/02/1976
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public int getAge() {
        return age;
    }

    // No lo necesito
    /* public void setAge(int age) {
        this.age = age;
    }*/

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isClient() {
        return isClient;
    }

    public void setClient(boolean client) {
        isClient = client;
    }


    public int getId() {
        return id;
    }

    static void getPersonsQuantity(){
        System.out.println(personsQuantity);
    }

}
