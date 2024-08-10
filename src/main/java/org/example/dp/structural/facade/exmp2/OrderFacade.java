package org.example.dp.structural.facade.exmp2;
/*
* One way to simplify the interactions between these subsystems and provide a simple interface to the client code is by using the Facade design pattern. In this pattern, a Facade class is created that acts as a single point of contact for the client code. The Facade class provides a simple, easy-to-use interface for the client code, while handling the interactions between the subsystems behind the scenes.

For example, you could create an OrderFacade class that provides methods for processing orders. The OrderFacade class would encapsulate the interactions between the InventoryManager, ShippingManager, PaymentProcessor, and OrderTracking subsystems.

Here is some sample code to illustrate the implementation of the Facade pattern:
* */
public class OrderFacade {

    private InventoryManager inventoryManager;
    private ShippingManager shippingManager;
    private PaymentProcessor paymentProcessor;
    private OrderTracking orderTracking;

    public OrderFacade() {
        inventoryManager = new InventoryManager();
        shippingManager = new ShippingManager();
        paymentProcessor = new PaymentProcessor();
        orderTracking = new OrderTracking();
    }

    public void processOrder(Order order) {
        if (inventoryManager.checkInventory(order)) {
            paymentProcessor.chargeCreditCard(order);
            shippingManager.shipOrder(order);
            orderTracking.updateOrderStatus(order, "shipped");
        } else {
            orderTracking.updateOrderStatus(order, "out of stock");
        }
    }
}

/*
In this implementation, the OrderFacade class provides a simple, easy-to-use interface for the client code to
 interact with the InventoryManager, ShippingManager, PaymentProcessor, and OrderTracking subsystems.
 The client code does not need to know the complexity of the interactions between these subsystems.
 The Facade class encapsulates this complexity, making the system easier to understand, maintain, and extend.
* */
