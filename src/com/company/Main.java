package com.company;
import java.sql.Array;
import java.time.Year;
import java.util.Scanner;
class Customer {
    private int nr_account;
    private int balance_begin;
    private int item_total;
    private int credit_applied;
    private int credit_limit;
    private int newBalance;
    public Customer() {;}
    void new_balance(int credit_limit, int balance_begin, int item_total, int credit_applied) {
        int newBalance = balance_begin + item_total - credit_applied;
        if (newBalance > credit_limit) {
            System.out.println("Превышен кредитный лимит ");
        }
        if (balance_begin < 0) {
            System.out.println("Перепроверьте баланс счеата ");
        }
        System.out.println("Новый баланс: " + newBalance);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance_begin;
        int item_total;
        int credit_applied;
        int credit_limit;
        System.out.println("Кредитный лимит: ");
        credit_limit=input.nextInt();
        System.out.println("Баланс счета в начале месяца: ");
        balance_begin=input.nextInt();
        System.out.println("Начисления: ");
        item_total=input.nextInt();
        System.out.println("Оплаченные клиентом кредиты: ");
        credit_applied=input.nextInt();
        Customer cst=new Customer();
        cst.new_balance(credit_limit,balance_begin,item_total,credit_applied);
    }
}
