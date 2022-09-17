/*package javaallpgmspackage;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class Arraylistcountpassfail {

	

	static int passcount =0;
	static int failcount =0;
	public static void main(String[] args) {

	
		
		ArrayList<String> arraylistobj = new ArrayList<String> ();

		//ArrayList newarraylistobj = new ArrayList ();
		
		  ArrayList Jsonbasicarraylist = new ArrayList();
		
		arraylistobj.add("Pass");
		arraylistobj.add("Pass");

		String abc ="abc";
		String def ="def";
		System.out.println("arraylistobj" +arraylistobj);
		
		String arraylistobjstring =arraylistobj.toString();
		
		System.out.println("arraylistobjstring" +arraylistobjstring);
		
		//String crxmissingvaluesstring = StringUtils.join(", ", arraylistobj);
		
		
		//System.out.println("crxmissingvaluesstring" +crxmissingvaluesstring);
		
		
		System.out.println("Data type "+crxmissingvaluesstring.getClass().getName());
		
		
		newarraylistobj.add(crxmissingvaluesstring);
		
		

		System.out.println("Data type "+arraylistobjstring.getClass().getName());
		
		
		//newarraylistobj.add(arraylistobjstring);
		
		//Jsonbasicarraylist.add(def,abc);
		
		System.out.println("newarraylistobj" +Jsonbasicarraylist);
		
		for(int i=0; i<arraylistobj.size();i++)
			
		{
			
			String arraylistvalue =arraylistobj.get(i);
			
			if(arraylistvalue =="Pass")
			{
				passcount = passcount+1;
				}
			else if(arraylistvalue =="Fail")
			{
				failcount = failcount+1;
				 }
			}
		System.out.println("Final passcount " +passcount);
		System.out.println("Final Failcount " +failcount);
	}

}
*/