package CSC_250_Lane_Bubble_Sort;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//Use updated solution from HW7, Use a Bubble Sort
//Add a sortOnName method which sorts itself on BookName alphabetically
//Add a sortOnChapters method which sorts itself on a number of chapters from smallest to largest
//Add a displayMethod which displays the entire collection in its sorted state
//Hint: compareTo method is helpful for comparing strings alphabetically

public class Driver 
{
	public static void main(String[] args)
	{
		BibleBookCollection theNewTestament = new BibleBookCollection("BibleBook_Data");
		try
		{
			//BibleBook answer = theNewTestament.getFirstBookGivenSearchTerm("lol");
			//answer.display();
			theNewTestament.sortOnName();
			theNewTestament.display();
			
			//sortOn Chapter
			theNewTestament.sortOnChapterCount();
			theNewTestament.display();
			
		}
		catch(Exception e)
		{
			System.out.println("No Book Found");
		}
		
	}
}
