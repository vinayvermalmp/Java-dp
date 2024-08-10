package org.example.dp.creational.prototype;

public class User {
    private ItemList itemList;

    public User(ItemList itemList){
        this.itemList = itemList;
    }

    public ItemList getItemList() {
        try {
            return (ItemList) itemList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateItemList(int index, Item item){
        itemList.updateItem(index,item);
    }
}

/*
* Explanation:



- The Item class represents the items that can be added to the list and acts as the prototype for all the different types of items.

- The Book, Electronics, and Clothing classes extend the Item class and add additional attributes specific to each type of item.

- The ItemList class contains a list of items and implements the clone method to create a deep copy of the list. This allows us to create multiple copies of the same list, each with its own set of items.

- The User class contains a reference to an ItemList and allows for updating items in the list. When the `User` class returns a copy of the ItemList, it uses the clone method to create a deep copy of the list.

- By using the Prototype design pattern, we have separated the process of creating new instances of items from their actual implementation, allowing us to easily create multiple copies of the same item list without affecting each other.
* */
