//Tess May 26th
import java.util.Scanner; //can use util.*
import java.io.*;
import java.util.*;
public class buildYourOwnPancake
{
   public buildYourOwnPancake()
   {
      ArrayList<String> temp = new ArrayList<String>();
   }
   public void build(ArrayList<String> temp, String extras, String order)
   {
      ArrayList<String> dIY = new ArrayList<String>();
      Scanner addOns = new Scanner(System.in);
      System.out.println("What would you like to add to your " + order + "?");
      String k = "";
      try
      {
         Scanner mainC = new Scanner(new File(extras)); //prints out the main order for customizing
         while(mainC.hasNextLine())
         {
            k = mainC.nextLine();
            dIY.add(k);
         }
         for(int i = 0; i < dIY.size(); i++)
         {
            System.out.println(dIY.get(i));
         }
         Scanner m = new Scanner(System.in);  //the main item
         System.out.println("Choose only one");
         String main = m.nextLine();
         temp.add(main); //adds to an arrayList
         dIY.clear();
         k = ""; //resets k string

         Scanner egg = new Scanner(new File("Customize Egg Choice.txt")); //prints out egg choice
         while(egg.hasNextLine())
         {
            k = egg.nextLine();
            dIY.add(k);
         }
         for(int i = 0; i < dIY.size(); i++)
         {
            System.out.println(dIY.get(i));
         }
         Scanner e = new Scanner(System.in); //egg choice
         System.out.println("Choose only one");
         String eggs = e.nextLine();
         temp.add(eggs);
         dIY.clear();
         k = "";
         
         Scanner meat = new Scanner(new File("Customize Meat Choice.txt")); //prints out meat choices
         while(meat.hasNextLine())
         {
            k = meat.nextLine();
            dIY.add(k);       
         }
         for(int i = 0; i < dIY.size(); i++)
         {
            System.out.println(dIY.get(i));
         }
         Scanner me = new Scanner(System.in); //meat choice
         System.out.println("Choose only one");
         String meats = me.nextLine();
         temp.add(meats);
         dIY.clear(); //clears array so it can print out next txt file
         k = "";
         
         Scanner hashbrown = new Scanner(new File("Hash Brown Preparation.txt"));
         while(hashbrown.hasNextLine())
         {
            k = hashbrown.nextLine();
            dIY.add(k); //adds to an arraylist 
         }
         for(int i = 0; i < dIY.size(); i++)
         {
            System.out.println(dIY.get(i));
         }
         Scanner hash = new Scanner(System.in); //hashbrown choice
         System.out.println("Choose only one");
         String hashbrowns = hash.nextLine();
         temp.add(hashbrowns);
         dIY.clear(); //resets arrayList
         k = "";
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   }
   public void addSyrup(ArrayList<String> temp) //only for pancake
   {
      Scanner add = new Scanner(System.in);
      System.out.println("Do you want to add maple syrup?");
      String additions = add.nextLine();
      if(additions.equals("Yes") || additions.equals("yes"))
      {
         temp.add("Maple Syrup");
      }
   }
}
   