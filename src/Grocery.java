public class Grocery extends Task {

    double price;
    double weight;
    String type;

    public void setPrice(){
        price = scanDetails.nextDouble();
    }

    public void setWeight(){
        weight = scanDetails.nextDouble();
    }

    public void setType(){
        type = scanDetails.next();
    }

    public double getPrice(){
        return  price;
    }

    public double getWeight(){
        return  weight;
    }

    public String getType(){
        return type;
    }
}
