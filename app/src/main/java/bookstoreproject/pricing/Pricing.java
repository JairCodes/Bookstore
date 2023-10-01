package bookstoreproject.pricing;

public abstract class Pricing {
         private double price;
        public Pricing(double price){
            this.price = price;
        }
        public double getprice(){
            return (price);
        }
}