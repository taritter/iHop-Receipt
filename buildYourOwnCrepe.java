//Tess May 27th
import java.util.Scanner; //can use util.*
import java.io.*;
import java.util.*;
public class buildYourOwnCrepe extends buildYourOwnPancake
{
   public buildYourOwnCrepe()
   {
      super();
   }
   public void build(ArrayList<String> temp, String extras, String order)
   {
      super.build(temp, extras, order);
   }
   @Override
   public void addSyrup(ArrayList<String> temp) //doesn't do this method
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
   