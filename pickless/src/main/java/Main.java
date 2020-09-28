import java.security.SecureRandom;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random ran = new Random();
        Integer caskNumber = ran.nextInt(100);
        Cellar grandmaCellar = new Cellar();

        for (Integer i = 0; i < caskNumber; i++){
            Map<Vegetables, Integer> nextContent = new HashMap<Vegetables, Integer>();

            for (Vegetables veg: Vegetables.values()) {
                nextContent.put(veg, ran.nextInt(10));
            }

            String nextLabel = "Cask # " + i.toString();
            Cask nextCask = new Cask(nextLabel, nextContent);

            if (grandmaCellar.add(nextCask) == false){
                System.out.println(nextLabel + " is broken!");
            }
            else{
                System.out.print(nextCask.label + " " + nextContent + "\n");
            }
        }

        try {
            Cask takenCask = grandmaCellar.getByLabel("Cask # 45");
            if (takenCask == null){
                System.out.println("404 Cask not found!");
            }
            else{
                System.out.println(takenCask.label + " is very tasty. You can eat it!");
            }
        } catch (RuntimeException e){
            System.out.print(e.getMessage());
        }

        for (Integer i = 0; i < caskNumber; i++){
            try {
                Cask takenCask = grandmaCellar.getByLabel("Cask # " + i.toString());
                if (takenCask == null){
                    System.out.println("404 Cask not found!");
                }
                else{
                    System.out.println(takenCask.label + " is very tasty. You can eat it!");

                }
            } catch (RuntimeException e){
                System.out.print(e.getMessage());
            }
        }

    }
}