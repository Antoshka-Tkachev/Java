package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        String email;
        String gender;

        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter email: ");
        email = in.nextLine();
        System.out.print("Enter gender: ");
        gender = in.nextLine();

        Author first = new Author(name, email, gender.charAt(0));
        System.out.println("\nInformation\n" + first);

        System.out.print("\nSet email: ");
        first.setEmail(in.nextLine());

        System.out.println("\nNew information\n" + first);
    }
}
