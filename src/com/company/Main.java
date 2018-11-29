package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the question number");
        int questionNumber= scanner.nextInt();
        switch (questionNumber){
            case 1:
                System.out.println("Enter the character");
                char m = scanner.next().charAt(0);

                if((m >= 'a' && m <= 'z')|| (m >= 'A' && m <= 'Z')){
                    System.out.println(" It is an alphabet");
                }

                else{
                    System.out.println("It is not an alphabet");
                }
                break;
                case 2:

                    System.out.println("Enter the marks of Physics::");
                    int phy = scanner.nextInt();

                    System.out.println("Enter the marks of Chemistry::");
                    int chem = scanner.nextInt();

                    System.out.println("Enter the marks of Biology::");
                    int bio = scanner.nextInt();

                    System.out.println("Enter the marks of Mathematics::");
                    int math = scanner.nextInt();

                    System.out.println("Enter the marks of Computer::");
                    int comp = scanner.nextInt();

                    int total = (phy + chem + bio + math + comp) / 5;

                    if (total >= 90) {
                        System.out.println("Grade A::" + total+"%");
                    }
                    else if (total>=70){
                        System.out.printf("Grade B::"+total+"%");
                    }
                    else if (total>=50){
                        System.out.printf("Grade C::"+total+"%");
                    }
                    else if (total>=40){
                        System.out.printf("Grade D::"+total+"%");
                    }
                    else{
                        System.out.printf("Grade E::"+total+"%");
                    }
                    System.out.printf("");
                    break;
            case 3:
                int  n1000,n500,n100,n50,n20,n10,n5,n2,n;
                System.out.println("Enter the total amount:: ");
                int amount = scanner.nextInt();
                if(amount<=0){
                    System.out.println("Error");
                }
                else{
                    if(amount>=1000){
                        n1000 = amount/1000;
                        amount = amount-1000*n1000;
                }
                    if(amount>=500){
                        n500 = amount/500;
                        amount = amount-500*n500;
                    }
                    if(amount>=100){
                        n100 = amount/100;
                        amount = amount-100*n100;
                    }
                    if(amount>=50){
                        n50 = amount/50;
                        amount = amount-50*n50;
                    }
                    if(amount>=20){
                        n20 = amount/20;
                        amount = amount-20*n20;
                    }
                    if(amount>=10){
                        n10 = amount/10;
                        amount = amount-10*n10;
                    }
                    if(amount>=5){
                        n5 = amount/5;
                        amount = amount-5*n5;
                    }
                    if(amount>=2){
                        n2 = amount/2;
                        amount = amount-2*n2;
                    }
                    if(amount>=1){
                        n = amount/1;
                        amount = amount-1*n;
                    }

                }


                case 4:
                    System.out.println("Enter three sides of a triangle ");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    if((a+b)>c && (b+c)>a && (c+a)>b){
                        System.out.println("Given sides are the sides of the triangle");

                    }
                    else {
                        System.out.println("Given sides are not the sides of the triangle");
                    }
                    break;

            case 5:
                System.out.println("Enter the day of the week");
                int day = scanner.nextInt();
                switch(day){
                    case 1:
                        System.out.println("It is Sunday");
                        break;
                    case 2:
                        System.out.println("It is Monday");
                        break;
                    case 3:
                        System.out.println("It is Tuesday");
                        break;
                    case 4:
                        System.out.println("It is Wednesday");
                        break;
                    case 5:
                        System.out.println("It is Thursday");
                        break;
                    case 6:
                        System.out.println("It is Friday");
                        break;
                    case 7:
                        System.out.println("It is Saturday");
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case 6:
                System.out.println("Enter the character");
                char ch = scanner.next().charAt(0);
                if(ch>='A' && ch<='Z'){
                    System.out.println("The character is uppercase alphabet");
                }
                else{
                    System.out.println("The character is lowercase alphabet");
                }
                break;
            case 7:
                System.out.println("Enter the character");
                char ch1 = scanner.next().charAt(0);
                if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U' ){
                    System.out.println("The given character is vowel");
                }
                else{
                    System.out.println("The given character is consonant");
                }
                break;
            case 8:
                System.out.println("Enter the cost price");
                int cp = scanner.nextInt();
                System.out.println("Enter the selling price");
                int sp = scanner.nextInt();
                if(sp>cp){
                    System.out.println("Profit");
                }
                else{
                    System.out.println("Loss");
                }
                break;
            case 9:
                System.out.println("Enter the month number");
                int ch2 = scanner.nextInt();
                switch(ch2){
                    case 1:
                        System.out.println("Number of days is 31");
                        break;
                    case 2:
                        System.out.println("Number of days is 28");
                        break;
                    case 3:
                        System.out.println("Number of days is 30");
                        break;
                    case 4:
                        System.out.println("Number of days is 31");
                        break;
                    case 5:
                        System.out.println("Number of days is 31");
                        break;
                    case 6:
                        System.out.println("Number of days is 32");
                        break;
                    case 7:
                        System.out.println("Number of days is 31");
                        break;
                    case 8:
                        System.out.println("Number of days is 30");
                        break;
                    case 9:
                        System.out.println("Number of days is 31");
                        break;
                    case 10:
                        System.out.println("Number of days is 30");
                        break;
                    case 11:
                        System.out.println("Number of days is 30");
                        break;
                    case 12:
                        System.out.println("Number of days is 32");
                        break;
                }
                break;
            case 10:
                System.out.println("Enter the number");
                int max = scanner.nextInt();
                int min = scanner.nextInt();
                if(max>min){
                    System.out.println("Largest number is ::"+max);
                }
                else{
                    System.out.println("Largest number is ::"+min);
                }
                break;
            case 11:
                System.out.println("Enter the number");
                int aa = scanner.nextInt();
                int bb = scanner.nextInt();
                int cc = scanner.nextInt();
                if(aa>bb){
                    if(aa>cc){
                        System.out.println("Largest number is "+aa);

                    }else  {
                        System.out.println("Largest number is "+cc);
                    }

                }
                else if(bb>cc){
                    if(bb>aa){
                        System.out.println("Largest number is "+bb);
                    }
                    else {
                        System.out.println("Largest number is "+aa);
                    }
                }
                else{
                    System.out.println("Largest number is "+cc);
                }
                break;
            case 12:
                System.out.println("Enter the number");
                int a1 = scanner.nextInt();
                if (a1>0){
                    System.out.println("The given number is positive");
                }
                else if(a1==0){
                    System.out.println("The given number is zero");
            }
            else{
                    System.out.println("The given number is negative");
                }
                break;
            case 13:
                System.out.println("Enter a number ");
                int a2 = scanner.nextInt();
                if(a2%5==0 && a2%11==0){
                    System.out.println("The number is divisible by 5 and 11");
            }
            else{
                    System.out.println("The number is not divisible by 5 and 11");
                }
                break;
            case 14:
                System.out.println("Enter the number ");
                int a3 = scanner.nextInt();
                if(a3%2==0){
                    System.out.println("The number is even");
                }
                else{
                    System.out.println("The number is odd");
                }
                break;
            case 15:
                System.out.println("Enter year");
                int i = scanner.nextInt();
                if ((i%4==0) || (i%400==0) && (i%100!=0)){
                    System.out.println("It is a leap year");
                }
                else{
                    System.out.println("It is not a leap year");
                }
                break;
            case 16:
                System.out.println("Enter the value");
                int equi = scanner.nextInt();
                int isos = scanner.nextInt();
                int scal = scanner.nextInt();
                if(equi==isos && isos==scal && scal==equi){
                    System.out.println("The triangle is equilateral");
                }
                else if(equi==isos || equi==scal || isos==scal){
                    System.out.println("The triangle is isosceles");
            }
            else{
                    System.out.println("The triangle is scalene");
                }
                break;
            case 17:
                System.out.println("Enter the character");
                char ch3 = scanner.next().charAt(0);
                if((ch3>=65 && ch3<=90) || (ch3>=97 && ch3<=122)){
                System.out.println("It is an alphabet");
            }
            else if(ch3>=48 && ch3<=57){
                    System.out.println("It is a  digit");

            }
            else{
                    System.out.println("It is a special character");
                }
                break;




            default:
                System.out.println("Please enter valid question number" );
        }


        // write your code here
    }
}
