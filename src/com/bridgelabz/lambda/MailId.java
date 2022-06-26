package com.bridgelabz.lambda;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IMail {
    public String validate(String regex, String test);
}

public class MailId {
    public static void main(String[] args) {

        System.out.println("enter mail idabc");
        Scanner scanner = new Scanner(System.in);
        String mailId = scanner.next();
        IFirstName isValid = (pattern,name) ->{
            return "Given mail is " + Pattern.compile(pattern).matcher(name).matches();
        };
        System.out.println(isValid.validate("^[a-z]{3}[_][a-z0-9]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][a-z]{2,5}$", mailId));
    }

}

