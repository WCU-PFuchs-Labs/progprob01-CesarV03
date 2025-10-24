/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/

// ran in jgrasp prior to execute expected output
public class homework20_1
{
   public static void main(String[] args)
   {
      //add your code here
      LinkedList list = new LinkedList();
      list.head = new ListNode(1);
      list.head.next = new ListNode(2);
      list.head.next.next = new ListNode(3);
      list.head.next.next.next = new ListNode(3);
      list.head.next.next.next.next = new ListNode(5);
      deleteDuplicates(list);
      System.out.println(list);
   
   }
   public static void deleteDuplicates(LinkedList llist)
   {
      //add your code here
      ListNode current = llist.head;
      while (current != null && current.next != null)
      {
         if (current.value == current.next.value)
         {
            current.next = current.next.next;
         }
         else
         {
            current = current.next;
         }
      }
   }
}


class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}

class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
