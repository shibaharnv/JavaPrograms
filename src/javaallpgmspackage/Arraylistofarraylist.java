package javaallpgmspackage;

import java.util.ArrayList;

public class Arraylistofarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ArrayList<ArrayList<String>> nodesproduction = new ArrayList<ArrayList<String>>();
		 
		   ArrayList ProdcutionheadingArray= new ArrayList();
		   
		   ArrayList IQA5headingArray= new ArrayList();
		 
		 for(int i=0; i<5;i++)
		 {
			 ProdcutionheadingArray.add("hi");
		 }
		
		 
		 for(int i=0; i<5;i++)
		 {
			 IQA5headingArray.add("bye");
		 }
		   
		   
		   nodesproduction.add(ProdcutionheadingArray);
		   nodesproduction.add(IQA5headingArray);
		   
		   System.out.println(nodesproduction);
		   
		   System.out.println(nodesproduction.get(0));
		   
		   System.out.println(nodesproduction.get(1));
		   
		   //ArrayList<String> prodeachArraylist=   nodesproduction[0];
	}

}
