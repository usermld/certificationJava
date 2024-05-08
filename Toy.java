

public class Toy {
    private int id;
    private String nameToy;
    private int quantity;
    private double frequencyOfLoss;

    public Toy(int id, String nameToy, int quantity, double frequencyOfLoss){
        this.id = id;
        this.nameToy = nameToy;
        this.quantity = quantity;
        this.frequencyOfLoss = frequencyOfLoss;
    }
    

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNameToy(){
        return nameToy;
    }
    public void setNameToy(String nameToy){
        this.nameToy = nameToy;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getFrequencyOfLoss(){
        return frequencyOfLoss;
    }
    public void setFrequencyOfLoss(double frequencyOfLoss){
        this.frequencyOfLoss = frequencyOfLoss;
    }

    @Override
    public String toString(){
        return "Toy: " + nameToy + ", " + 
                "id: " + id + ", " +
                "quantity: " + quantity + ", " + 
                "frequency of loss: " + frequencyOfLoss;
    }
}
