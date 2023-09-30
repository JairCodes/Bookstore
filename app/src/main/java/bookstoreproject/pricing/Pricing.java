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

public class Book extends Pricing{
    // public double price;
    public Book(){
        super(10.0);
    }
}
public class Stationary extends Pricing{
    public Stationary(){
        super(2.0);
    }
}
public class Pencil extends Pricing{
    public Pencil(){
        super(1.0);
    }
}
public class Pen extends Pricing{
    public Pen(){
        super(1.5);
    }
}