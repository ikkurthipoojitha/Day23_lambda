package com.bridgelabz.lambda;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IPassword {
    public String validate(String regex, String test);
}

public class Password {
    public static void main(String[] args) {

        System.out.println("enter password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        IFirstName isValid = (pattern,name) ->{
            return "Given password is " + Pattern.compile(pattern).matcher(name).matches();
        };
        System.out.println(isValid.validate("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$", password));
    }

}

