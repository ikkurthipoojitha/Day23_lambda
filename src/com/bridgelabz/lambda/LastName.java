package com.bridgelabz.lambda;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface ILastName {
    public String validate(String regex, String test);
}

public class LastName {
    public static void main(String[] args) {

        System.out.println("enter last name");
        Scanner scanner = new Scanner(System.in);
        String lastName = scanner.next();
        IFirstName isValid = (pattern,name) ->{
            return "Given last name is " + Pattern.compile(pattern).matcher(name).matches();
        };
        System.out.println(isValid.validate("^[A-Z][a-z]{2}$", lastName));
    }

}

