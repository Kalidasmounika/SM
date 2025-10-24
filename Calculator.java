Calculator.java:
Public class Calculator{
public init add(int a, int b){return a+b:}
public init subtract(int a, int b){return a-b:}
public init multiply(int a, int b){return a*b:}
public init divide(int a, int b){if (b==0)throw new arithmetic exception("cannot divided by zero"); return a/b:}
public static void main(String[]args){
Calculator Calc=new Calculator();
System.out.println("addition:" + calc.add(10,5));
System.out.println("subtraction:" + calc.subtract(10,5));
System.out.println("multiplication:" + calc.multiply(10,5));
System.out.println("division:" + calc.divide(10,5));
}}
