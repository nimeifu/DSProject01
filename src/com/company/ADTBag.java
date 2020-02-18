package com.company;

/**
 * This is an interface of an Abstract Data Type bag.
 * @author Genjie Liu
 * Lab section:Fri 10:25-11:20 Tuan Tran
 */

public interface ADTBag {

    /**
     * Put an item to the end of ADT bag.
     * @param item an item Object.
     */
    public void insert(Object item);

    /**
     * Remove the last item from the ADTBag.
     */
    public void removeLast();

    /**
     * Remove an item in a random index from the ADTBag.
     */
    public void removeRandom();

    /**
     * Get the location/index of a specific item in the ADTBag.
     * @param item An item Object.
     * @return An integer represents the location/index of that item.
     */
    public int get(Object item);

    /**
     * Get a reference of the item in a specific location/index.
     * @param index The location of item object.
     * @return A reference of item Object in a specific location/index of ADTBag.
     */
    public Object get(int index);

    /**
     * Check how many item in the ADTBag.
     * @return How many items in the ADTBag
     */
    public int size();

    /**
     * See if the ADTBag is full.
     * @return A boolean that states the bag is either full or not.
     */
    public boolean isFull();

    /**
     * See if the ADTBag is empty.
     * @return A boolean that states the bag is either empty or not.
     */
    public boolean isEmpty();

    /**
     * Make the whole ADTBag empty.
     */
    public void makeEmpty();


}