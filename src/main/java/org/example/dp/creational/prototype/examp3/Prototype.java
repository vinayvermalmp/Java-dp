package org.example.dp.creational.prototype.examp3;

/*
One possible solution is to use the Prototype Design Pattern in Java.

Explanation: The Prototype Design Pattern allows us to create new objects by cloning existing ones, instead of creating them from scratch every time they are needed. This can be especially useful in situations where the objects have complex and lengthy constructions, as cloning existing objects is typically more efficient than creating them from scratch.

Here's a simple implementation of the Prototype Design Pattern in Java:
*
* */
public interface Prototype {

    Prototype clone();
}
