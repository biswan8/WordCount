import java.util.HashSet;
import java.util.Iterator;

public class scait {

    public static void main(String[] args) {
    	String word[]=new String("Today is Saturday").split(" ");
	HashSet<String> hs=new HashSet<String>();
	
	Iterator<String> itr=hs.iterator();
	
	for(String key:word)
	{
		hs.add(key);
	}
	      System.out.println(hs);
	      System.out.println("Word count:"+" "+hs.size());

	      
	  	for(String key:hs)
		{
	  		System.out.print(key+" ");
			
		}
    
    }
	}
	
	

