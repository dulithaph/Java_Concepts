package com.company;


public class Main {

    public static void main(String[] args) {


        WhileLoop whileobj = new WhileLoop();
        whileobj.useWhile();

        ForLoop forloop = new ForLoop();
        forloop.calSum();

        TryInputs obj = new TryInputs();
        obj.tryFilds();

        TryIF obj2 = new TryIF();
        obj2.tryifstate(obj.age);

        TryArray obj3 = new TryArray();
        obj3.tryArray();




    }
}
