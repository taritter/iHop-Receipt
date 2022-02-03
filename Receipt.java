//Tess May 13th
import java.util.Scanner; //can use util.*
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Receipt
{
   private int waitressNumber; //some are private others are public because they are needed in other classes
   private String customerName;
   private String address;
   private int tableNumber;
   private double tax;
   private double subtotal;
   private double total;
   public Receipt()
   {
      waitressNumber = ((int)(Math.random()*1001) + 1000);
      customerName = this.getName();
      address = " IHOP Store # 489 \n                   20 Tew Chew St \n                Singapore, SG 178882 \n                Phone:(65) 6239-1899";
      tableNumber = ((int)(Math.random()*101) + 100);
   }
   public Receipt(int wN, String cN, String adrs, int tN)
   {
      waitressNumber = ((int)(Math.random()*1001) + 1000);
      customerName = cN;
      tableNumber = ((int)(Math.random()*101) + 100);;
      address = "IHOP Store # 489 \n                   20 Tew Chew St \n                Singapore, SG 178882 \n                Phone:(65) 6239-1899";;
   }
   public String toString(ArrayList<String>items, ArrayList<String> addOns, double subTotal, double tax, String date)
   {
      String emails = "\"Receive our E-mails\""; //print out double quotes
      subTotal = Math.round(subTotal * 100.0) / 100.0; //rounds subtotal
      tax = setTax(subTotal); //calls setTax method
      double total = tax + subTotal; //adds the total
      total = Math.round(total * 100.0) / 100.0;
      String tS = "";
      tS = tS + "\n" + space(17) + address + "\n";
      tS = tS + customerName + "\n";
      tS = tS + "--------------------------------------------------" + "\n";
      tS = tS + tableNumber + space(16) + "CHK" + waitressNumber + space(20) + "GST1" + "\n";
      tS = tS + space(14) + date + "\n";
      tS = tS + "- - - - - - - - - - - - - - - - - - - - - - - - - " + "\n";
      tS = tS + space(6) + arrayString(items);
      tS = tS + extras(addOns) + "\n";
      tS = tS + space(3) + "Subtotal" + space(30) + subTotal + "\n";
      tS = tS + space(3) + "Tax" + space(35) + tax + "\n";
      tS = tS + space(3) + "Total" + space(33) + total + "\n" + "\n";
      tS = tS + "**************************************************" + "\n";
      tS = tS + space(12) + "To receive the latest news" + "\n";
      tS = tS + space(18) + "right to your" + "\n";
      tS = tS + space(12) + "computer go to www.IHOP.com" + "\n";
      tS = tS + space(9) + "and click on " + emails + "\n";
      tS = tS + "**************************************************" + "\n";
      tS = tS + space(16) + "PLEASE PAY CASHIER" + "\n";
      return tS;
   }
   public double setTax(double total) //tax is 10% of the subtotal, returning tax is the total
   {
      double tax = total*0.1;
      tax = Math.round(tax * 100.0) / 100.0;
      return tax;
   }
   public String space(int num) //adds spaces
   {
      String spaces = "";
      for(int i = 0; i < num; i++)
      {
         spaces = spaces + " ";
      }
      return spaces;
   }
   public String getName()//the first method used welcoming you to IHOP
   {
      Scanner n = new Scanner(System.in);
      System.out.println("Welcome to IHOP! What is your name?");
      String name = n.nextLine();
      System.out.println("Hello " + name);
      return name;
   }
   public String arrayString(ArrayList<String>items) //makes arrayList into String so they all have the same indent
   {
      String indent = "";
      for(int i = 0; i < items.size(); i++)
      {
         indent = indent + items.get(i) + "\n" + "      ";
      }
      return indent;
   }
   public String extras(ArrayList<String>addOns) //same as one above but for the special orders.
   {
      String indent = "      ";
      for(int i = 0; i < addOns.size(); i++)
      {
         indent = indent + addOns.get(i) + "\n" + space(12);
      }
      return indent;
   }  
}