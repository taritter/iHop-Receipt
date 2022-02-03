//Tess May 27th
import java.util.Scanner; //can use util.*
import java.io.*;
import java.util.*;
public class buildYourOwnFrTo extends buildYourOwnPancake
{
   public buildYourOwnFrTo(ArrayList<String> toppings)
   {
      toppings = new ArrayList<String>();
   }
   public void build(ArrayList<String> toppings, String extras, String order)
   {
      super.build(toppings, extras, order);
   }
   public void addMore(ArrayList<String> toppings)
   {
      Scanner add = new Scanner(System.in);
      System.out.println("Do you want to add whip cream?");
      String additions = add.nextLine();
      if(additions.equals("Yes") || additions.equals("yes"))
      {
         toppings.add("Whip Cream");
      }
   }
}