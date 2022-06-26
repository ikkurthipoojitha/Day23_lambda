package com.bridgelabz.lambda;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IFirstName {
    public String validate(String regex, String test);
}

public class FirstName {
    public static void main(String[] args) {

        System.out.println("enter first name");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        IFirstName isValid = (pattern,name) ->{
            return "Given first name is " + Pattern.compile(pattern).matcher(name).matches();
        };
        System.out.println(isValid.validate("^[A-Z][a-z]{2}$", firstName));
    }

}
