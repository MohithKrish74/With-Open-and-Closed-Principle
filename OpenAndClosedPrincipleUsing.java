package com.keyword;

interface Calculation
{
     void operations(double number1,double number2);
}

class Add implements Calculation
{
    public void operations(double number1, double number2)
    {
        System.out.println("Addition of "+number1+" and "+number2+" : "+(number1+number2));
    }
}

class Subtraction implements Calculation
{
    public void operations(double number1, double number2)
    {
        System.out.println("Subtraction of "+number1+" and "+number2+" : "+(number1-number2));
    }
}

class Multiplication implements Calculation
{
    public void operations(double number1, double number2)
    {
        System.out.println("Multiplication of "+number1+" and "+number2+" : "+(number1*number2));
    }
}

class Division implements Calculation
{
    public void operations(double number1, double number2)
    {
        System.out.println("Division of  "+number1+" and "+number2+" : "+(number1/number2));
    }
}

class Remainder implements Calculation
{
    public void operations(double number1, double number2)
    {
        System.out.println("Remainder : "+number1+" and  "+number2+" : "+(number1%number2));
    }
}

class Equal implements Calculation
{
    public void operations(double number1, double number2)
    {
        System.out.println("Does "+number1+" and  "+number2+" are Equal : "+(number1==number2));
    }
}

public class OpenAndClosedPrincipleUsing
{
    public static void main(String[] args)
    {
        Add add = new Add();
        Subtraction subtract = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Remainder remainder = new Remainder();
        Equal equal = new Equal();
        add.operations(5,10);
        subtract.operations(10,5);
        multiplication.operations(10,5);
        division.operations(10,5);
        remainder.operations(10,5);
        equal.operations(10,10);

    }
}
