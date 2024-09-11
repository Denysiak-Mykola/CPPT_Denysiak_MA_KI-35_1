/**
 * Lab6
 */
package КІ305.Денисяк.Lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * The Penal class is a pencil case for storing stationery
 */

public class Penal<T extends Item > {
    private List<T> item;

    /**
     * Constructor for initializing the pencil case
     */
    
    public Penal() {
        this.item = new ArrayList<>();
    }

    /**
     * Adds an item to the penal
     * @param <code>item</code>  an item to add
     */
    
    public void AddItem(T item) {
        this.item.add(item);
        System.out.println(item.GetName() + " add into penal");
    }

    /**
     * Remove item from penal
     * @param <code>item</code> item you want to remove
     */
    
    public void RemoveItem(T item) {
        this.item.remove(item);
        System.out.println(item.GetName() + " remove from penal.");
    }

    /**
     * Method returns number of items
     * 
     */
    
    public int GetItemCount() {
        return item.size();
    }

    /**
     * Method returns the smallest item in the pencil case
     */
    
    public T GetSmallestItem() {
        if (item.isEmpty()) {
            return null;
        }
        
        T smallest = item.get(0);
        for (T item : item) {
            if (item.GetSize() < smallest.GetSize()) {
                smallest = item;
            }
        }
        return smallest;
    }

}

/**
 * Item interface, which represents the item in the pencil case.
 */
interface Item {
    String GetName();
    int GetSize();
}

/**
 * Class Pen Introduces Pen
 */
class Pen implements Item {
    private String name;
    private int size;

    /**
     * A constructor for creating a pen object.
     * @param <code>name</code> name pen
     * @param <code>size</code> size pen
     */
    
    public Pen(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Method returns the name of item
     */
    
    @Override
    public String GetName() {
        return name;
    }

    /**
     * Method returns the size of item
     */
    
    @Override
    public int GetSize() {
        return size;
    }
}

/**
 * Pencil class represents a pencil
 */
class Pencil implements Item {
    private String name;
    private int size;

    /**
     * A constructor for creating a pencil object
     * @param <code>name</code> name pencil
     * @param <code>size</code> size pencil
     */
    public Pencil(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    /**
     * Method returns the name of item
     */

    @Override
    public String GetName() {
        return name;
    }
    
    /**
     * Method returns the size of item
     */

    @Override
    public int GetSize() {
        return size;
    }
}
