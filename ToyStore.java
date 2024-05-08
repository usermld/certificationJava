import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToyStore {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizeToys;
    private String prizeFilePath;

    

    public ToyStore() {
        toys = new ArrayList<Toy>();
        prizeToys = new ArrayList<Toy>();
        prizeFilePath = "prize_toys.txt";
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void changeToyFrequency(int toyId, double newFrequency) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequencyOfLoss(newFrequency);
            }
        }
    }

    public void organizeRaffle() {
        prizeToys.clear();

        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getFrequencyOfLoss()) {
                prizeToys.add(toy);
            }
        }
    }
    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            
            Toy prizeToy = prizeToys.remove(0);
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);

            try {
                
                FileWriter writer = new FileWriter(prizeFilePath, true);
                writer.write(prizeToy.getNameToy() + "\n");
                writer.close();
                
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл игрушки");
            }
            
            
            return prizeToy;
        } else {
            System.out.println("Все игрушки кончились");
            return null;
        }
    }

}
