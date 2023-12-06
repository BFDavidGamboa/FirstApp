package com.pluralsight.organized;

import com.pluralsight.organized.conversions.ConvertVal;
import com.pluralsight.organized.operators.OperatorsPrecedence;
import com.pluralsight.organized.printer.Printer;

public class Main {
    public static void main(String[] args) {

         Printer.printOperator(OperatorsPrecedence.myPrecedences());
         Printer.printOperator(ConvertVal.result1);
    }

}