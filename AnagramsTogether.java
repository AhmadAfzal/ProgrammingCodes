import java.util.*;


public class Test{
	private static void AnagramsofStringTogether(String[] strarray)
	{
	  HashMap<String, ArrayList<Integer>> mymap=new HashMap<String,ArrayList<Integer>>();
	  int index=0;
	  for(String i:strarray)
	  {
		  String str=sortString(i);
		  if(mymap.containsKey(str))
		  {
			  ArrayList<Integer> temp=mymap.get(str);
			  temp.add(index);
			  mymap.put(str, temp);
		  }
		  else
		  {
			  ArrayList<Integer> list=new ArrayList<>();
			  list.add(index);
			  mymap.put(str, list);
		  }
		  index++;
	  }
	 
	  
	  Iterator it = mymap.entrySet().iterator();
	  while(it.hasNext())
	  {
		  List<Integer> list = new ArrayList<Integer>();
		  Map.Entry pairs = (Map.Entry)it.next();
		  list.addAll((Collection<? extends Integer>) (pairs.getValue()));
		  for(int m:list)
		  {
			  System.out.print(strarray[m]+"\t");
		  }
		  System.out.println();
	  }
	}
	
	private static String sortString(String str)
	{
		char[] chararray=str.toCharArray();
		
		Arrays.sort(chararray);
		return String.copyValueOf(chararray);
		}
	
	public static void main(String[] args){

		String[] str={"abc","def","cba","dfe","def","fed","sfe","werwe","rr","fes"};
		AnagramsofStringTogether(str);
		 	
	}			
		}

	
