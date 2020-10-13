package CSC_250_Lane_Bubble_Sort;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BibleBookCollection 
{
	private ArrayList<BibleBook> theBooks;

	public BibleBookCollection()
	{
		this.theBooks = new ArrayList<BibleBook>();
	}

	public BibleBookCollection(String filename)
	{
		this();
		try
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/" + filename));
			while(input.hasNext())
			{
				this.theBooks.add(new BibleBook(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e) { e.printStackTrace();}
	}

	public void addBibleBook(BibleBook b)
	{
		this.theBooks.add(b);
	}

	public void addBibleBook(String colonDelimitedData)
	{
		this.theBooks.add(new BibleBook(colonDelimitedData));
	}

	public BibleBook getFirstBookGivenSearchTerm(String term) throws Exception
	{
		for(BibleBook aBook : this.theBooks)
		{
			if(aBook.searchSummary(term))
			{
				return aBook;
			}
		}
		throw new Exception("Term not found exception");
	}
	public void sortOnName()
	{
		int numSwaps;
		do
		{	numSwaps = 0;
			for(int i = 0; i < this.theBooks.size()-1; i++) 
			{
				if (this.theBooks.get(i).getName().compareTo(this.theBooks.get(i+1).getName()) > 0) 
				{
					BibleBook temp = this.theBooks.get(i);
					theBooks.set(i, this.theBooks.get(i+1));
					theBooks.set(i+1, temp);
					numSwaps++;
				}
			}			
		}
		while(numSwaps > 0);
	}
	public void sortOnChapterCount()
	{
		int numSwaps;
		do
		{	numSwaps = 0;
			for(int i = 0; i < this.theBooks.size()-1; i++) 
			{
				if (this.theBooks.get(i).getNumber_of_chapters() > (this.theBooks.get(i+1).getNumber_of_chapters()))
					
				{
					BibleBook temp = this.theBooks.get(i);
					theBooks.set(i, this.theBooks.get(i+1));
					theBooks.set(i+1, temp);
					numSwaps++;
				}
			}			
		}
		while(numSwaps > 0);
	}
	//write a loop that goes through every book and prints out each one. Think: higher-level display.
	//create array from input file, sort it, print it
	
	public void display() 
	{
		for(int i = 0; i < this.theBooks.size(); i++)
		{
			this.theBooks.get(i).display(); 
		}
	}
}