import model.Account;
import model.Person;
import view.Atm;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Person pablo = new Person(
                "Pablo",
                "Rovira",
                "1123234545",
                "Calle Falsa 123",
                "10123456",
                "20-10123456-7",
                "18/05/1992");

        Person lucia = new Person(
                "Lucia",
                "Cordoba",
                "1123234545",
                "Calle Falsa 124",
                "10123457",
                "27-10123457-3",
                "07/03/1998");


        System.out.println(pablo.getId());
        System.out.println(lucia.getId());

        // System.out.println(pablo.age); -> NO PUEDO HACER ESTO EN VARIABLES PRIVADAS
        int edadPablo = pablo.getAge(); // En cambio si puedo hacer esto
        System.out.println(edadPablo);

        Account pabloAccount = new Account(pablo.getId(),"Caja de Ahorro", "PESOS", 0.00);
        Account luciaAccount = new Account(lucia.getId(),"Caja de Ahorro", "PESOS", 0.00);

        // CON VARIABLES PÚBLICAS EL ACCESO A LOS DATOS ES INSEGURO
        //System.out.println(pabloAccount.getCustomerId());
        // pabloAccount.accountBalance = 2000.00;
        //System.out.println(pabloAccount.getAccountBalance()); // Pablo deposita 2000
        //System.out.println(pablo.getId());
        //pabloAccount.setCustomerId(lucia.getId()); // Aqui estoy cambiando la cuenta a nombre de Pablo a Lucia
        //System.out.println(pabloAccount.getCustomerId());
        // System.out.println(pabloAccount.customerId);
        //System.out.println(pabloAccount.getAccountBalance()); // Lucia se fija cuanto dinero hay
        //pabloAccount.withdraw(2000.00); // Lucia intenta retirar el dinero
        //System.out.println(pabloAccount.getAccountBalance()); // El dinero sigue ahi
        //luciaAccount.deposit(pabloAccount.accountBalance);// Lucia retira nuestro dinero igual
        //pabloAccount.accountBalance = 0;
        //System.out.println(pabloAccount.getAccountBalance()); // Pablo le hace juicio al banco y le tienen que pagar 10 veces lo robado.


        // ----------------------------------- //

       Atm.operate(pabloAccount, luciaAccount);


    }
}
