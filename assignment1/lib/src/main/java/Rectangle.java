/**
 * Created by adeelakousar on 2/13/19.
 */

package com.csci38004.shapes;

class Rectangle extends SquareRe

{
    private int breadth;
    private int length;
    Rectangle(int length, int breadth){

        this.length = length;
        this.breadth = breadth;

    }
    Rectangle
            (int i){
        this.length=i;

    }
    @Override

    public int areaOfReactangle(){
                return this.length * this.breadth;

    }
        int areaOfSquare(){

        return length * length;
        }

}

