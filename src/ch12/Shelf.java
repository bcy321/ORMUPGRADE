package ch12;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    public Shelf() {
        this.shelf = new ArrayList<>();
    }
    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }
}
