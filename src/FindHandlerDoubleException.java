public class FindHandlerDoubleException{     
   public static void change(int[] course){ 
      try{ 	
            System.out.println("Start Change"); 
		course[10] = 1; 
		System.out.println("End Change"); 
	 } 
	 catch (ArrayIndexOutOfBoundsException ex) 
	 { System.err.println("Change Catch"); } 
          System.out.println("after catch in change");
   } 
   public static void main(String args[]){  
      int[] students = new int[5]; 
	 try{ 	
            System.out.println("Start Try"); 
		change(students); 
		System.out.println("After change"); 
	 } 
	 catch (ArrayIndexOutOfBoundsException ex) 
	 { System.err.println("Main Catch"); }  
         System.out.println("after catch in main");
   } 
} 
