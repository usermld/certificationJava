package Toys;

public class TediBear extends Toy{

    public TediBear(int id, String nameToy, int quantity, double frequencyOfLoss) {
        super(id, nameToy, quantity, frequencyOfLoss);
        frequencyOfLoss = 0.5;
    }
    
}
