class Calculator{

    /**
     * The function "addition" takes two float numbers as input and returns their sum.
     * 
     * @param operand_1 The first operand for addition. It is a float data type.
     * @param operand_2 The second operand in the addition operation.
     * @return The sum of operand_1 and operand_2.
     */
    float addition(float operand_1, float operand_2 ){
        return(operand_1 + operand_2);
    }

    /**
     * The function "substraction" takes two float operands and returns their difference.
     * 
     * @param operand_1 The first operand for the subtraction operation.
     * @param operand_2 The second operand in the subtraction operation.
     * @return the result of subtracting operand_2 from operand_1.
     */
    float substraction(float operand_1, float operand_2 ){
        return(operand_1 - operand_2);
    }

   /**
    * The function "multiplication" takes two float operands and returns their product.
    * 
    * @param operand_1 The first operand of the multiplication operation. It is a floating-point
    * number.
    * @param operand_2 The second operand in the multiplication operation.
    * @return the product of the two operands, which is the result of multiplying operand_1 and
    * operand_2.
    */
    float multiplication(float operand_1, float operand_2 ){
        return(operand_1 * operand_2);
    }
/**
 * The function "division" takes two float operands and returns their division.
 * 
 * @param operand_1 The first operand of the division operation.
 * @param operand_2 The second operand in the division operation.
 * @return The division of operand_1 by operand_2 is being returned.
 */

    float division(float operand_1, float operand_2 ){
        return(operand_1 / operand_2);
    }

    // The code `public static void main(String[] args)` is the main method in Java. It is the entry
    // point of the program and is executed when the program is run.
    public static void main(String[] args){
        float operand_1=10;
        float operand_2=5;
       // The code `Calculator calc = new Calculator();` creates a new instance of the Calculator
       // class.
        Calculator calc = new Calculator();
        float add_result = calc.addition(operand_1, operand_2);
        System.out.println("Result of addition is :"+add_result);

        // The code `float sub_result = calc.substraction(operand_1, operand_2);` is calling the
        // `substraction` method of the `Calculator` class and passing `operand_1` and `operand_2` as
        // arguments. It assigns the result of the subtraction operation to the variable `sub_result`,
        // which is of type `float`.
        float sub_result = calc.substraction(operand_1, operand_2);
        System.out.println("Result of Substraction is :"+sub_result);

       // The code `float mul_result = calc.multiplication(operand_1, operand_2);` is calling the
       // `multiplication` method of the `Calculator` class and passing `operand_1` and `operand_2` as
       // arguments. It assigns the result of the multiplication operation to the variable
       // `mul_result`, which is of type `float`. Then, it prints the result of the multiplication
       // operation using `System.out.println("Result of Multiplication is :"+mul_result);`.
        float mul_result = calc.multiplication(operand_1, operand_2);
        System.out.println("Result of Multiplication is :"+mul_result);

        // The code `float div_result = calc.division(operand_1, operand_2);` is calling the `division`
        // method of the `Calculator` class and passing `operand_1` and `operand_2` as arguments. It
        // assigns the result of the division operation to the variable `div_result`, which is of type
        // `float`. Then, it prints the result of the division operation using
        // `System.out.println("Result of division is :"+div_result);`.
        float div_result = calc.division(operand_1, operand_2);
        System.out.println("Result of division is :"+div_result);
    }

}