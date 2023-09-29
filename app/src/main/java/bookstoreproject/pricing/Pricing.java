package bookstoreproject.pricing;

// public class Pricing {

//     private double bookPrice = 10.0;
//     private double stationaryPrice = 2.0;
//     private double pencilPrice = 1.0;
//     private double penPrice = 1.5;

//     public double getPrice(String productType) {
//         switch (productType) {
//             case "Book":
//                 return bookPrice;
//             case "Stationary":
//                 return stationaryPrice;
//             case "Pencil":
//                 return pencilPrice;
//             case "Pen":
//                 return penPrice;
//             default:
//                 return 0.0;
//         }
//     }
// }

public abstract class Pricing {
         private double price;
        public Pricing(double price){
            this.price = price;
        }
        public double getprice(){
            return (price);
        }
}

class Book extends Pricing{
    // public double price;
    public Book(){
        super(10.0);
    }
}
class stationary extends Pricing{
    public stationary(){
        super(2.0);
    }
}
class pencil extends Pricing{
    public pencil(){
        super(1.0);
    }
}
class pen extends Pricing{
    public pen(){
        super(1.5);
    }
}