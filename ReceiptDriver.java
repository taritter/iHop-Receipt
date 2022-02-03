//Tess May 16th
import java.util.Scanner; //can use util.*
import java.io.*;
import java.lang.Thread;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class ReceiptDriver
{
   public static void main(String[] args)
   {
      ArrayList<String> order = new ArrayList<String>(); //items ordered
      ArrayList<String> bYO = new ArrayList<String>(); //extras added on
      Order yum = new Order(order);
      Receipt help = new Receipt();
      
      Calendar cal = Calendar.getInstance(); //getting date
      Date date = cal.getTime();
      DateFormat dateFormat = new SimpleDateFormat("MMM dd''yy HH:mmaa");
      String formattedDate=dateFormat.format(date); //has date
      
      yum.getOrder(order);
      for(int i = 0; i < order.size(); i++)
      {
         if(order.get(i).equals("Build Your Own French Toast|8.99")) //if this then
         {
            buildYourOwnFrTo special = new buildYourOwnFrTo(bYO); //creates a new object
            order.set(order.size()-1, order.get(i)); //puts this order to the end
            special.build(bYO, "Customize FrenchToast Choice.txt", "Build Your Own French Toast order"); //calls the method build
            special.addMore(bYO); //adds whip cream
            try
            {
               Thread.sleep(1000);
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
            System.out.println("Here's your receipt!");
            System.out.println(help.toString(order, bYO, yum.getSubtotal(order), help.setTax(yum.getSubtotal(order)), formattedDate)); //prints receipt
            break; //ends run
         }
         else if(order.get(i).equals("Build Your Pancake Combo|8.79"))
         {
            buildYourOwnPancake special = new buildYourOwnPancake();
            order.set(order.size()-1, order.get(i));
            special.build(bYO, "Customize Pancake Choice.txt", "Build Your Own Pancake order");
            special.addSyrup(bYO); //add maple syrup
            System.out.println("Here's your receipt!");
            try
            {
               Thread.sleep(1000); //delays receipt printing 
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
            System.out.println(help.toString(order, bYO, yum.getSubtotal(order), help.setTax(yum.getSubtotal(order)), formattedDate));
            break;
         }
         else if(order.get(i).equals("Build Your Crepe Combo|8.79"))
         {
            buildYourOwnCrepe special = new buildYourOwnCrepe();
            order.set(order.size()-1, order.get(i));
            special.build(bYO, "Customize Crepe Choice.txt", "Build Your Own Crepe order");
            System.out.println("Here's your receipt!");
            try
            {
               Thread.sleep(1000);
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
            System.out.println(help.toString(order, bYO, yum.getSubtotal(order), help.setTax(yum.getSubtotal(order)), formattedDate));
            break;
         }
         else //if not any special orders prints a normal receipt
         {
            ArrayList<String> none = new ArrayList<String>();
            System.out.println("Here's your receipt!");
            try
            {
               Thread.sleep(1000);
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
            System.out.println(help.toString(order, none, yum.getSubtotal(order), help.setTax(yum.getSubtotal(order)), formattedDate));
            break;
         }
      }
   }
}
