package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ADTBagUtility{
    /**
     * Creates a bag of items, and change items in the bag, and displays items.
     */
    public static void start() throws FileNotFoundException,ArrayIndexOutOfBoundsException,arrayException
    {
        ADTBagBase list=new ADTBagBase();
        fillList(list);
        //displayArray(list);
        //list.removeRandom();
        //displayArray(list);
        //list.removeLast();
        //displayArray(list);
        list.makeEmpty();
        displayArray(list);
        //System.out.println(list.get("xyz"));
        //System.out.println(list.isFull());


    }

    /**
     * Create a bag of items then fill them into a ADTBag.
     * @param list a bag of ADTBag items
     * @throws FileNotFoundException if the file couldn't be found, throws a exception.
     */
    public static void fillList(ADTBagBase list) throws FileNotFoundException
    {
        File file=new File("src/com/company/detailist.txt");
        Scanner input=new Scanner(file);
        while(input.hasNext())
        {
            String line=input.nextLine();
            list.insert(line);
        }


        input.close();
    }

    /**
     * Display item(s) inside the bag.
     * @param list a bag of ADTBag items
     * @throws ArrayIndexOutOfBoundsException throws exception when index of array doesn't exist
     * @throws arrayException throws exception when a runtime error occur.
     */
    private static void displayArray(ADTBagBase list) throws ArrayIndexOutOfBoundsException,arrayException{
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        if(list.size()<=0)
        {
            System.out.println("This is an empty bag.");
        }
    }
}
