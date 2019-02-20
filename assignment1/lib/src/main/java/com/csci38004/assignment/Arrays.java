package com.csci38004.assignment;

class Arrays
{
    public static void main (String[] args)
    {
        int[] squares = {4,16,36,64,100,144,196,256,324,400};

        Arrays array = new Arrays();
        array.printSquaresBackward(squares);

    }
    public static void printSquaresBackward(int[] squares)
    {
        for(int i = 9;i>=0;i--)
            System.out.println(squares[i]);

    }
}