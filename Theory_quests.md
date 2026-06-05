1)Explain Java Exception hierarchy:

Throwable
Exception-its a type of error where the system will crash when it will reach that part
Error-a mistake which wont let us run the code

Give one example for each.
exception-ArithmaticException which says when any integer/0
eroor - suppose we forget a '}' or a ';'

2)Can we have multiple catch blocks?
yes
Explain with example when it is useful.
yes if inntry block there are more than one exception of diffrent types
like example -
try {
    \*
    there are many errors like arithmaticException and mismatched input and any invalid index of a array is to be opperated
    and any other
    */
}
catch(StringIndexOutOfBoundsException e){
    //code
}
catch(InputMismatchException){
    //code
}
3)A program crashes when user enters text instead of number.

What exception occurs?
InputMismatchException
How will you handle it?
by using try-catch
Where should try-catch be placed?
in try the input statement...and in check the handling part


4)try {
    int a = 10 / 0;
    
    System.out.println("Hello");

}

catch(Exception e) {

    System.out.println("Error handled");

}

System.out.println("End");

Predict the output - 
Error handled
hello
What prints first?
Error handled
Does program stop?
no...it continues



