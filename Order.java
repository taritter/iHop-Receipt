//Tess May 13th
import java.util.Scanner; //can use util.*
import java.io.*;
import java.util.*;
public class Order
{   
   public Order(ArrayList<String> temp)
   {
      temp = new ArrayList<String>();
   }
   //public ArrayList<String> type;
   ArrayList<String> type = new ArrayList<String>();
   public void getOrder(ArrayList<String> temp)
   {
      try
      {
         Scanner order = new Scanner(System.in);
         String food = "";
         System.out.print(" What would you like to order? (Please type exactly as shown) \n Pancake, FrenchToast, Waffle, Crepe or Beverage: ");
         food = order.nextLine() + ".txt";
         File file = new File(food); //gets the file of the food you want
         order = new Scanner(file); 
         while(order.hasNextLine())
         {
            String i = order.nextLine();
            type.add(i); //adds the file to an arrayList of food
         }
      }  
      catch (Exception e)
      {
         System.out.println("Sorry that file is not found");
      }
      try
      {
         for(int i = 0; i < type.size(); i++)
         {
            System.out.println(type.get(i)); //prints out the arrayList of food
         }
         Scanner item = new Scanner(System.in);
         System.out.println("Type the order you would like (ex. Cupcake Pancakes|8.29)");
         String breakfast = item.nextLine();
         for(int i = 0; i < type.size(); i++)
         {
            try
            {
               if(breakfast.equals(type.get(i).substring(0,type.get(i).indexOf("|"))))
               {
                  temp.add(type.get(i)); //adds your order to a new arrayList
               }
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      type.clear(); //clears the type (the food menu)
      System.out.println("Would you like to order again?");
      Scanner question = new Scanner(System.in);
      String answer = question.nextLine();
      if(answer.equals("Yes") || answer.equals("yes"))
      {
         this.getOrder(temp); //recursion?
      }
      else
      {
         System.out.println("Thanks for hopping by!");
      }
   }
   public double getSubtotal(ArrayList<String> temp)
   {
      double subtotal = 0;
      for(int i = 0; i < temp.size(); i++)
      {
         subtotal = subtotal + Double.parseDouble(temp.get(i).substring(temp.get(i).indexOf("|")+1));
      }
      return subtotal;
   }
}