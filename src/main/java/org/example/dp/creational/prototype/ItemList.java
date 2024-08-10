package org.example.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ItemList implements Cloneable{
    private List<Item> items = new ArrayList<>();

    public ItemList addItem(Item item){
        this.items.add(item);
        return this;
    }

    public  void updateItem(int index, Item item){
        items.add(index, item);
    }

    public List<Item> getItems(){
        return items;
    }

//    public void setItems(List<Item> items) {
//        this.items = items;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ItemList clone = (ItemList) super.clone();
        List<Item> clonedItems = new ArrayList<>();
        for (Item item : items) {
            clonedItems.add((Item) item.clone());
        }
        clone.items = clonedItems;
        return clone;
    }
}
