package demo;

public class Demo {
    public static void main(String[] args) {


    }
}


/*
Loops using Print n numbers

 Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }

* */

/*
 //  Grading System Problem
    Scanner scn = new Scanner(System.in);

        int marks = scn.nextInt();

        if (marks > 90) {
            System.out.println("Excellent");
        } else if (80 < marks) {
            System.out.println("Good");
        } else if (70 < marks) {
            System.out.println("Fair");
        } else if (60 < marks) {
            System.out.println("Meet Expectations");
        } else {
            System.out.println("Below par");
        }
* */

/*
Check number  conditions equal  , grater ,lesser
Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        if (n2 == n1) {
            System.out.println(n1 + " is Equal to " + n2);
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " is grater than " + n2);
            } else {
                System.out.println(n2 + " is grater than " + n1);
            }
        }
* */


/* Even Odd

Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

        System.out.println("HardWork is batter than smart work");

 * */

//    if ( condition){
//           body
//        } else {
//
//        }

//variable and expression
//                  int x = 15;
//                  int y = 10;
//                  int sum = x + y;
//
//
//                System.out.print("sum is:");
//                System.out.println(sum);
//                System.out.println("Sum of " + x + " and " + y + " is " + sum);
//
//                int prod = x * y;
//                System.out.println("Product of " + x + " and " + y + " is " + prod);
//
//                int v1 = x / y;
//                int v2 = y / x;
//                int v3 = x % y;
//                System.out.println(v1);
//                System.out.println(v2);
//                System.out.println(v3);
//
//                //exp =>BosMassRule  * / % > +-
//
//                int exp = x*y/x+y;
//                System.out.println(exp); //20
//                int exp21= x*y/(x+y);
//                System.out.println(exp21);