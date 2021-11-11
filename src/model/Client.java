package model;

public class Client {
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
    private int productId;

    public Client(String name, String lastName, String phoneNumber, String dni, String cuit, String dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.dni = dni;
        this.cuit = cuit;
        this.dateOfBirth = dateOfBirth;
    }

    public Client(int id, String name, String lastName, String phoneNumber, String adress, String dni, String cuit, int age, String dateOfBirth, boolean isClient) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.dni = dni;
        this.cuit = cuit;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.isClient = isClient;
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


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isClient() {
         return isClient;
    }

    public void setClient() {
        if (this.productId != -1) {
            isClient = true;
        }

    }
}
