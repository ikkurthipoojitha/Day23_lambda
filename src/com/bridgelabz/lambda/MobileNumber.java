package com.bridgelabz.lambda;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IMobileNumber {
    public String validate(String regex, String test);
}

public class MobileNumber {
    public static void main(String[] args) {

        System.out.println("enter mobile number");
        Scanner scanner = new Scanner(System.in);
        String mobileNumber = scanner.next();
        IFirstName isValid = (pattern,name) ->{
            return "Given mobile number is " + Pattern.compile(pattern).matcher(name).matches();
        };
        System.out.println(isValid.validate("^[0-9]{2}\\s{1}[6-9]{1}[0-9]{9}$", mobileNumber));
    }

}
