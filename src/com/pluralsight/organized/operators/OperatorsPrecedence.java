package com.pluralsight.organized.operators;


public class OperatorsPrecedence {

    public static int valA = 21;
    public static int valB = 6;
    public static int valC = 3;
    public static int valD = 1;


    public OperatorsPrecedence() {
        this.valA = valA;
        this.valB = valB;
        this.valC = valC;
        this.valD = valD;
    }

    public static int myPrecedences() {
        return (valA - valB) / valC;
    }

    public static int consequent(){
        return valA / (valC *(valD + valB));
    }


}
