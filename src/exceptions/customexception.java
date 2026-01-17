package exceptions;

import java.util.Scanner;


class NotEligibleForVote extends Exception {
    public NotEligibleForVote(String msg) {
        super(msg);
    }
}

public class customexception {
    public static void main(String[] args) {
        System.out.println("Main Start");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = sc.nextInt();

        try {
            eligibleForVote(age);
        } catch (NotEligibleForVote e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

        System.out.println("Main method end ");
    }

    public static void eligibleForVote(int age) throws NotEligibleForVote {
        if (age >= 18) {
            System.out.println("eligible for vote");
        } else {
            throw new NotEligibleForVote("your age is below 18");
        }
    }
}


