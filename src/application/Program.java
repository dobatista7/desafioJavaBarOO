package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.print("SEXO: ");
        bill.gender = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        bill.beer= sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink= sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        double consumo = bill.feeding();
        double couvert = bill.cover();
        double ingresso = bill.ticket();
        double conta = bill.total();

        System.out.println();
        System.out.println("RELATÓRIO: ");
        System.out.printf("CONSUMO = R$ %.2f\n",consumo);
        if (consumo > 30.00){
            System.out.println("Insento de Couvert");
        }else {
            System.out.printf("COUVERT = R$ %.2f\n", couvert);
        }
        System.out.printf("Ingresso = R$ %.2f\n",ingresso);
        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f\n",conta);

        sc.close();

        }
    }
