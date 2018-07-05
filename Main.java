import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		List<String> result = new ArrayList<>();
		try {
			for (String line : Files.readAllLines(Paths.get("C:/Users/TOAN/workspace/ReadShirtData/file.csv"))) {
			    for (String part : line.split("\\n")) {
			        String tmpShirt = String.valueOf(part);
			        result.add(tmpShirt);
			    }
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String, Integer> seussCount = new HashMap<String,Integer>();
	    for(String t: result) {
	       Integer i = seussCount.get(t);
	       if (i ==  null) {
	           i = 0;
	       }
	       seussCount.put(t, i + 1);
	    }

	    seussCount.forEach((key, value) -> System.out.println(key + "                                                                             " + value));
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}
	
	public static Integer[] countItems(String[] arr)
	{
	    List<Integer> itemCount = new ArrayList<Integer>();
	    Integer counter = 0;
	    String lastItem = arr[0];

	    for(int i = 0; i < arr.length; i++)
	    {
	        if(arr[i].equals(lastItem))
	        {
	            counter++;
	        }
	        else
	        {
	            itemCount.add(counter);
	            counter = 1;
	        }
	        lastItem = arr[i];
	    }
	    itemCount.add(counter);

	    return itemCount.toArray(new Integer[itemCount.size()]);
	}

}