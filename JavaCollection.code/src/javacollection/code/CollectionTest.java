// Collection interface demonstrated via an ArrayList object.
package javacollection.code;
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.Iterator;
 public class CollectionTest 
 {
 public static void main(String[] args)
 {
 // add elements in colors array to list
 String[] colors = {"YELLOW", "RED", "WHITE", "BLUE", "GREEN"};
 List<String> list = new ArrayList<String>();
 
 for (String color : colors){list.add(color);}
  // add elements in removeColors array to removeList
 
 String[] removeColors = {"RED", "WHITE", "BLUE"};
 List<String> removeList=new ArrayList<String>();
 for (String color : removeColors)
 removeList.add(color);
 System.out.println("ArrayList: ");
 for (int count = 0; count < list.size(); count++){
     System.out.println(list.get(count));}
 // remove from list the colors contained in removeList
 removeColors(list, removeList);

 // output list contents
 System.out.println("ArrayList after calling removeColors:");

 for (String color : list)
 System.out.println( color);
 // remove colors specified in collection2 from collection1
 }
 private static void removeColors(Collection<String> collection1,Collection<String> collection2)
{
   Iterator<String> iterator = collection1.iterator(); 
// get iterator
  // loop while collection has items
 while (iterator.hasNext()){
 if(collection2.contains(iterator.next()))
     iterator.remove();
 } 
 
}}