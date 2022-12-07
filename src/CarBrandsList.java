import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//22F Assignment 3: CarBrandsList.java 

// Insert your solution code into this file as instructed in the information document (please read before you start). Hints have been provided on your tasks.
// Insert your javadoc style comments to clearly and thoroughly explain your work.
// Ensure that you retain the names of all methods specifically mentioned in the instructions.
// Note that there are codes inbetween the print statements (see assignment information).


//TO DO: YOUR TASK 1: Add the necessary import statements here.


/**
* File Name: CarBrandsList.java
* Course: CST8284-OOP
* Author: Sandra Iroakazi
* Modified by: Neeraj Katewa
* Assignment: Assignment 3
* Date:30th November 2022
* Professor: Sandra Iroakazi
* Purpose: Created two linked lists of Strings, adding contents of given arrays to respective lists. Created methods printList(), toUpper(),deleteSubList(), 
* printNonDuplicates(), printReversedList(),
* @author Neeraj Katewa
*/
public class CarBrandsList {
	public static void main(String[] args) {
		/**
		 * Creating two linked lists called list1 and list2
		 */
		LinkedList<String> list1;
		LinkedList<String> list2;
		String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedies", "keke"};
		String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};
		List<String> list=Arrays.asList(rides);
		/**
		 * Adding the contents of rides to list1
		 */
		list1=new LinkedList<>(list);
		list=Arrays.asList(rides2);
		/**
		 * Adding the contents of rides2 to list2
		 */
		list2=new LinkedList<>(list);
		/**
		 * Adding the elements of list2 to list1
		 */
		list1.addAll(list2);
		/**
		 * Printing the updated list1
		 */
		printList(list1);
		/**
		 * Releasing list2 resource
		 */
		list2.clear();
		/**
		 * Converting elements of list1 to uppercase letters
		 */
		toUpper(list1);
		System.out.printf("%nThis is showing the Car Brands in Uppercase Letters...%n");
		printList(list1);
		System.out.printf("%nDeleting the car brands 5 to 7...%n");
		/**
		 * Deleting the car brands that are not required going forward
		 */
		deleteSubList(list1,5,8);
		printList(list1);
		System.out.printf("%nHere is the current list of car brands...%n");
		printList(list1);
		System.out.printf("%nReversed List:%n");
		/**
		 * making list1 in reverse order and printing the updated list
		 */
		printReversedList(list1);
		System.out.printf("%nSorted car brands in alphabetical order...%n");
		/**
		 * Sorting the elements of list1 in ascending order of alphabets
		 */
		Collections.sort(list1);
		printList(list1);
		System.out.printf("%nRemoving duplicate car brands...%n");
		/**
		 * removing duplicates from the list1 and printing the updated list
		 */
		printNonDuplicates(list1);
	}
	/**
	 * printList() function is a report for printing the elements of the passed list
	 * @param list is the passed linked list
	 */
	public static void printList(LinkedList<String> list) {
		System.out.printf("List is:%n");
		String s = list.toString();
		System.out.println(s.substring(1, s.length()-1));
	}
	/**
	 * toUpper() function converts the elements of passed list into uppercase letters using replaceAll method
	 * @param list is the passed linked list
	 */
	public static void toUpper(LinkedList<String> list) {
		list.replaceAll(String::toUpperCase);
	}
	/**
	 * printNonDuplicates() function removes the duplicates in the passed list by iterating though the list, 
	 * comparing the current element to the next and removing the next element if found duplicate and printing the updated list
	 * @param list is the passed linked list
	 */
	public static void printNonDuplicates(LinkedList<String> list) {
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i).equals(list.get(i+1)))
			{
				list.remove(i+1);
				i--;
			}
		}
		printList(list);
	}
	/**
	 * deleteSublist() function deletes the non-required car brands by making a sublist and then using the clear() function
	 * @param list is the passed linked list
	 * @param startPosition is the starting position of subList to make
	 * @param endPosition is the ending position of subList to make
	 */
	public static void deleteSubList(LinkedList<String> list, int startPosition, int endPosition) {
		list.subList(startPosition, endPosition).clear();
	}
	/**
	 * printReversedList() function reverses the list by using the reverse() function and printing the updated list
	 * @param list list is the passed linked list
	 */
	public static void printReversedList(LinkedList<String> list) {
		Collections.reverse(list);
		printList(list);
	}

}