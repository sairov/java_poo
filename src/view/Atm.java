package view;

import model.Account;

import java.util.Scanner;

public class Atm {

     public static void operate(Account userAccount, Account transferAccount) {

     Scanner sc = new Scanner(System.in);

        int opt = -1;
        do {
            System.out.println("Bienvenido al Sistema, ingrese la opción que desee realizar: ");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Depositar dinero.");
            System.out.println("3. Retirar Dinero.");
            System.out.println("4. Transferir Dinero.");
            System.out.println("0. Salir");
            opt = sc.nextInt();
            double amount;
            switch (opt) {
                case 1:
                    System.out.println("Su saldo es: " + userAccount.getAccountBalance());
                    System.out.println("Presione 1 para volver al menu o 0 para salir");
                    opt = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Ingrese el monto a depositar");
                    amount = sc.nextDouble();
                    userAccount.deposit(amount);
                    System.out.println("Operación exitosa, su nuevo saldo es: " + userAccount.getAccountBalance());
                    System.out.println("Presione 1 para volver al menu o 0 para salir");
                    opt = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar");
                    amount = sc.nextDouble();
                    if (userAccount.canWithdraw(amount)){
                        userAccount.withdraw(amount);
                        System.out.println("Operación exitosa, su nuevo saldo es: " + userAccount.getAccountBalance());
                    } else {
                        System.out.println("Lo siento, no tienes suficiente dinero.");
                    }
                    System.out.println("Presione 1 para volver al menu o 0 para salir");
                    opt = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Ingrese el monto a transferir");
                    amount = sc.nextDouble();
                    if (userAccount.canWithdraw(amount)){
                        userAccount.withdraw(amount);
                        transferAccount.deposit(amount);
                        System.out.println("Transferencia exitosa, su nuevo saldo es: " + userAccount.getAccountBalance());
                    } else {
                        System.out.println("Lo siento, no tienes suficiente dinero.");
                    }
                    System.out.println("Presione 1 para volver al menu o 0 para salir");
                    opt = sc.nextInt();
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro servicio");
                    System.out.println("Presione 1 para volver al menu o 0 para salir");
                    opt = sc.nextInt();
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
                    System.out.println("Presione 1 para volver al menu o 0 para salir");
                    opt = sc.nextInt();
                    break;
            }
        } while (opt != 0);

    }
}
