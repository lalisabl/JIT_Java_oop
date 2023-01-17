// Lists, LinkedLists and ListIterators demonstration
package javalinkedlist.code;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {
        String[]colors={"yellow","red","blue","green"};
        List<String> list1=new LinkedList<String>();
        for(String color:colors)
            list1.add(color);
        // add colors2 elements to list2 and add all elements of list2 to list1
 String[] colors2 ={"black", "white", "gray", "silver"};
 List<String> list2 = new LinkedList<>();
 for(String color:colors2)
     list2.add(color);
    list1.addAll(list2);
    System.out.println(list1);
    list1.remove("yellow");
       System.out.println(list1);
       convertToUppercaseStrings(list1);
    printinfo(list1);
    }
    //conver all elmeeents of list1 to uppercase
   private static void convertToUppercaseStrings(List<String> list ){
   ListIterator<String> iterator=list.listIterator();
   while (iterator.hasNext()){
   String color=iterator.next();
   iterator.set(color.toUpperCase());
   } 
   }
   //print uppercaselist
    private static void printinfo(List<String> list){
        System.out.println(list);
      
    }
}
