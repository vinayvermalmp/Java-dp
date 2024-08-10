package org.example.dp.creational.abstractFactoryPattern.exmp2;

public class ClothesStoreApplication {
    public static void main(String[] args) {
        ClothesFactory casualClothesFactory = new CasualClothesFactory();
        ClothesFactory formalClothesFactory = new FormalClothesFactory();

        Clothes casualShirt = casualClothesFactory.createShirt();
        Clothes casualPaints = casualClothesFactory.createPaint();

        Clothes formalShirt = formalClothesFactory.createShirt();
        Clothes formalPaints = formalClothesFactory.createPaint();

        casualShirt.design();
        casualPaints.design();;

        formalShirt.design();
        formalPaints.design();
    }
}

/*
* Explanation:

The Abstract Factory design pattern is used to provide a way to create families of related or dependent objects without specifying their concrete classes. In this example, the Clothes interface represents the common interface for all types of shirts and pants. The ClothesFactory interface provides methods to create specific types of shirts and pants.

The CasualShirt, FormalShirt, CasualPant, and FormalPant classes implement the Clothes interface and define the unique design for each type of shirt and pant.

The CasualClothesFactory and FormalClothesFactory classes implement the ClothesFactory interface and provide methods to create specific types of shirts and pants. By using the Abstract Factory pattern, the application can switch between different types of shirts and pants at any time without affecting the rest of the application.
* */

/*
* This demo class creates two factories, one for casual clothes and one for formal clothes, using the CasualClothesFactory and FormalClothesFactory classes. It then uses these factories to create casual and formal shirts and pants and calls the design method on each of them to show the unique design.

When you run this class, it will produce the following output:

Designing a casual shirt
Designing a casual pant
Designing a formal shirt
Designing a formal pant
* */
