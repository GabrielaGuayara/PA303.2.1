package com.perscholas.java_basics;


public class SalesTaxes {
    static final double SALES_TAXES = 0.08;

    public static void main(String[] args){
        //Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product, four items of the second product, and two items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.

        double coffee, greenTea, espresso, total;

        coffee = 3.99;
        greenTea = 4.99;
        espresso = 5.99;

        double subtotal, totalSale;
        subtotal = (coffee * 3) +(greenTea * 4) + (espresso * 2);
        total = (SALES_TAXES * subtotal) + subtotal;



        System.out.printf("The total is $%.2f%n", total);

    }
}
