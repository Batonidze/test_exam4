package org.example;

import static org.junit.jupiter.api.Assertions.*;

class Pines2Test {

    @org.junit.jupiter.api.Test
    void MyFunction()
    {
        Pines2 Object = new Pines2();
        Object.MyFunction(1, 2);
        int a = Object.MyFunction(1, 2);
        System.out.println(a);
        assertEquals(2, a);
    }
}