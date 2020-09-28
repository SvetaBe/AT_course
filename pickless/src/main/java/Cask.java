import java.util.*;

enum Vegetables{
    CUCUMBER,
    TOMATO,
    ZOOK,
    EGGPLANT,
    MUSHROOM
}

public class Cask {
    public Map <Vegetables, Integer> content;
    public String label;

    public Cask(String label, Map<Vegetables, Integer> content){
        this.label = label;
        this.content = content;
    }
}
