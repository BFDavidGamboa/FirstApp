package com.pluralsight.organized.conversions;

public class ConvertVal {
    public static float floatVal = 1.0f;
    public static double doubleVal = 4.0d;
    public static byte byteVal = 7;
    public static  short shortVal = 7;
    public static long longVal = 5;
    public static short result1 = byteVal;
    public static short result2 = (short) longVal;
    short result3 = (short) ((short) byteVal - longVal);
}
