package com.csci38004.assignment;

public class Primitives
{
    private byte Byte;
    private char Char;
    private short Short;
    private int Int;
    private long Long;

    private float Float;
    private double Double;


    private boolean Boolean;

    Primitives(byte B, char C, short S, int I, long L, float F, double D, boolean Bool,){

        this. Byte =B;
        this. Char =C;
        this. Short =S;
        this. Int =I;
        this. Long =L;
        this. Float =F;
        this. Double =D;
        this. Boolean =Bool;

    }
    public void print(){
        System.out.print("Byte: "+ this.Byte);
        System.out.print("Char: "+ this.Char);
        System.out.print("Short: "+ this.Short);
        System.out.print("Int: "+ this.Int);
        System.out.print("Long: "+ this.Long);
        System.out.print("Float: "+ this.Float);
        System.out.print("Double: "+ this.Double);
        System.out.print("Boolean: "+ this.Boolean);
    }

    public static void main (String args[]){
        byte byteVar =0;
        char CharVar = 'B';
        short ShortVar = 10045;
        int intVar = 2033424;
        long longVar = 25823898;

        float floatVar = (float) 35.3434;
        double doubleVar = 0.234325326235235;

        boolean boolVar = true;
        Primitives PrimObj = new Primitives(byteVar, CharVar,ShortVar, intVar, longVar, floatVar, doubleVar,boolVar );

        PrimObj.print();
    }

}
