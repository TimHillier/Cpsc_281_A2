import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Question_1 {
	public static void main (String args[]){
		//import file
		String fileName = "List.csv"; 
		int listSize = 1000; 
		String line = null; 
		
		 try {
	            // read the file
	            FileReader fileReader = 
	                new FileReader(fileName);
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	            	
	            	//parse the list, hash the #ordered and store
	            	
	            	
	            	
	                System.out.println(line);
	            }   

	            // close the file.
	            bufferedReader.close();         
	        }
		 	//Error handling
	        catch(FileNotFoundException e) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException e) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");  
	        }
	    }
	
		
		

	//Hash based on how many where sold
	public void Hash(int key,int Element)
	{
		
		
		
	}
	
	
	
}

