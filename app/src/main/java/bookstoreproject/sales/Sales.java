package bookstoreproject.sales;

import bookstoreproject.inventory.*;
import bookstoreproject.pricing.*;


public class Sales {

    private Inventory inventory;
    //private Pricing pricing;
    
    public Sales(Inventory inventory){
        this.inventory = inventory;
    }
    // public Sales(Inventory inventory, Pricing pricing) {
    //     this.inventory = inventory;
    // }

    
    public boolean makeSale(String productType, int quantity) {

        Pricing product = null;
       // product = new productType();
        switch (productType.toLowerCase()) {
            case "book":
                product = new Book();
                break;
            case "stationary":
                product = new Stationary();
                break;
            case "pencil":
                product = new Pencil();
                break;
            case "pen":
                product = new Pen();
                break;
            default:
                throw new IllegalArgumentException("Invalid product type: " + productType);
        }
        double price = product.getPrice(); //change
        // System.out.println("this is the product" + product);
        //double price = productType.getPrice();
        boolean isAvailable = inventory.isAvailable(productType, quantity);

        if (isAvailable) {
            inventory.decrementStock(productType, quantity);
            
            // Update Sales Counter (assuming it's a static class)
            SalesCounter.updateTotalSales(price * quantity);
            SalesCounter.updateTotalUnits(quantity);
            return true;
        }

        return false;
    }
}
