/**
 * 
 */
package PracticeQstns;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
/**
 * @author Roshni Velluva Puthanidam
 *Jun 23, 201612:33:07 PM
 */
public class CountUsers {
	
	public static void main(String args[]) throws IOException{
		
		//read input from the file
		BufferedReader br=new BufferedReader(new FileReader("/Users/roshni/python_learning/name.txt"))	;
		Scanner read=new Scanner(System.in);//read system input
		System.out.println("Enter a Number:");
		int n= read.nextInt();//Integer.parseInt(args[0]);
	
		 HashMap<String,Integer> hm= new HashMap<String,Integer>();{}
		 String line;	 
		 while((line=br.readLine()) != null){
			 
			 String[] arr=line.split(",");
			 
		     for (int i=0; i<arr.length; i++){
		    	 
			   if (hm.containsKey(arr[i])){
		         int count= hm.get(arr[i]);
		         hm.put(arr[i],count+1);
		       }
			 
		      else 
		      {
		         hm.put(arr[i],1);
		      }
			   
		    }
		 }


		Set<Entry<String, Integer>> set = hm.entrySet();
		List<Map.Entry<String, Integer>> list = new ArrayList<>(set);


		//*Sorts the specified list according to the order induced by the specified comparator. All elements in the list must be
	    //    mutually comparable using the specified
	    //    comparator (that is, c.compare(e1, e2) must not throw a ClassCastException for any elements e1 and e2 in the list).

	    Collections.sort( list, new Comparator<Entry<String, Integer>>()
	    {
	        public int compare( Entry<String, Integer> o1, Entry<String, Integer> o2 )
	        {
	            return (o2.getValue()).compareTo( o1.getValue() );
	        }
	    } );
//

	    for(Entry<String, Integer> entry:list){
	    	
	        System.out.println(entry.getKey()+" visited "+entry.getValue()+"times");
	    }
	
	    //print top k values of sorted list
	    for(int k=0; k<n; k++){
	    	 System.out.println((list.get(k)).getKey());
	    }
	}
}


