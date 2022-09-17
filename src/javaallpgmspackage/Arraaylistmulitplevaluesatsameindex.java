package javaallpgmspackage;

import java.util.ArrayList;

public class Arraaylistmulitplevaluesatsameindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	            // Your Prepared data. 
		ArrayList<double[]> values = new ArrayList<double[]>(2);

	            double[] element1 = new double[] { 100, 50, 200, 100, 100 };
	            values.add(element1);
	            
	            System.out.println("The values are " +values.size());
	            
	            System.out.println("The values are " +values.get(0));
	       

	            // Add the result to arraylist.
	            
	        
	            
	            ArrayList<Double> temp = new ArrayList<Double>();
	            
	            for(int j=0;j<values.size(); j++) {
	                for (int i = 0; i < values.get(0).length; i++) {
	                    temp.add(values.get(0)[i]);
	                    temp.add(values.get(1)[i]);
	                }
	            }

		
		
	}

}
