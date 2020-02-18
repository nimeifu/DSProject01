package com.company;

/**
 * This is an ADT bag that could contains as many as 50 items in it and has functions like insert new item(s) and make the bag empty.
 * @author Genjie Liu
 * Lab section:Fri 10:25-11:20 Tuan Tran
 */

public class ADTBagBase implements ADTBag {
    /**
     * Create an array of Objects called itemList.
     * An int called capacity to represent indexes available for items to put in.
     */
   private Object[] itemList;
   private int capacity;

    /**
     * An ADTBag constructor that set the bag to contain 50 items.
     * And set the capacity to 0.
     */
   public ADTBagBase()
    {
        this.itemList=new Object[50];
        this.capacity=0;
    }

    /**
     * Put an item to the end of ADT bag.
     * @param item An item Object.
     * @throws arrayException Throws an runtime exception when the item inserted is not valid.
     * @throws ArrayIndexOutOfBoundsException Throws a index out of bounds exception when the bag is already full.
     */
    @Override
    public void insert(Object item) throws arrayException,ArrayIndexOutOfBoundsException {
       if(item==null) {
           throw new arrayException("This is not a valid item");
       }
       else if(isFull())
       {
           throw new arrayException(("This bag is already full"));
       }
        else
         {
           //Capacity is increasing so that items would not override each other.
           itemList[capacity]=item;
           capacity++;
         }

       }

    /**
     * Make the ADTBag empty.
     */
    @Override
    public void makeEmpty() {
        //Create a new empty array.
        this.itemList=new Object[50];
       }


    /**
     * Remove the last item from the ADTBag.
     */
    @Override
    public void removeLast() {
       //Set the last item to null.
       itemList[size()-1]=null;
    }

    /**
     * Remove an item in a random index from the ADTBag.
     */
    @Override
    public void removeRandom(){
        int current=0;
        int next=1;
        int randomIndex= (int) (Math.random()*(size()));
        itemList[randomIndex]=null;

        for(int i=0;i<size();i++)
        {
            /*The object on current index would be replaced by the object on next index,
              and the object on next index would be replaced by the object next to it and so on until end of the loop
            */
            itemList[randomIndex+current]=itemList[randomIndex+next];
            current++;
            next++;
        }

    }

    /**
     * Get the location/index of a specific item in the ADTBag.
     * @param item An item Object.
     * @return An integer represents the location/index of that item.
     */
    @Override
    public int get(Object item) {
        int index=0;
        for(int i=0;i<size();i++)
        {
            if(itemList[i].equals(item))
            {
                index=i;
            }
        }
        return index;
    }

    /**
     *Check how many item in the ADTBag.
     * @return How many items in the ADTBag.
     */
    @Override
    public int size() {

       int size=0;
        for(int i=0;i<itemList.length;i++)
        {
            if(itemList[i]!=null)
            {
                size++;
            }
        }
        return size;


    }

    /**
     * Get a reference of the item in a specific location/index.
     * @param index The location of item object.
     * @return A reference of item Object in a specific location/index of ADTBag.
     * @throws ArrayIndexOutOfBoundsException Throws an index out of bounds exception when index of array doesn't exist.
     */
    @Override
    public Object get(int index) throws ArrayIndexOutOfBoundsException{
        if(index<0||index>this.size())
        {
            throw new ArrayIndexOutOfBoundsException("This index value is not valid, please enter index between 0 and "+(this.size()-1));
        }
        Object object=itemList[index];
        return object;

    }

    /**
     * See if the bag is empty.
     * @return A boolean that states the bag is either empty or not.
     */
    @Override
    public boolean isEmpty() {
        boolean empty=true;
        for(Object i:itemList)
        {
            if(i!=null)
            {
                empty=false;
                break;
            }
        }
        return empty;
    }

    /**
     * See if the bag is full.
     * @return A boolean that states the bag is either full or not.
     */
    @Override
    public boolean isFull() {
        boolean full=true;
        for(Object q:itemList)
        {
            if(q==null)
            {
                full=false;
            }
        }
        return full;
    }
}
