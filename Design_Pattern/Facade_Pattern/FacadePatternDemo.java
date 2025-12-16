package Design_Pattern.Facade_Pattern;

interface OrderTask {
    void execute(String productId, double price, int quantity);

}

class InventoryTask implements OrderTask {

    @Override
    public void execute(String productId, double price, int quantity) {
        System.out.println("-> Updating inventory for product: " + productId);
        System.out.println("-> Quantity: " + quantity);
    }

}

class PaymentTask implements OrderTask {

    @Override
    public void execute(String productId, double price, int quantity) {
        System.out.println("-> Processing payment for product: " + productId + " with quantity: " + quantity);
        System.out.println("-> Processing payment: " + price);

    }
}

class ShippingTask implements OrderTask {

    @Override
    public void execute(String productId, double price, int quantity) {
        System.err.println("-> Shipping product: " + productId);
        System.err.println("-> Shipping price: " + price);
        System.err.println("-> Shipping quantity: " + quantity);

    }
}

class OrderFacade {
    private InventoryTask inventoryTask = new InventoryTask();
    private PaymentTask paymentTask = new PaymentTask();
    private ShippingTask shippingTask = new ShippingTask();

    public void placeOrder(String productId, double price, int quantity) {
        System.out.println("-> Placing order for product: " + productId);
        inventoryTask.execute(productId, price, quantity);
        paymentTask.execute(productId, price, quantity);
        shippingTask.execute(productId, price, quantity);
        System.out.println("-> Order placed successfully for product: " + productId);
    }

}

public class FacadePatternDemo {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("PROD-123",200.0,5);
    }
}
