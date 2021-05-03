package com.simplileam;

public class Application {
	private static File_CreationAnRetrive creationAnRetrive=null;
	private static String search=null;
	public static  void main(String [] args){
		
		creationAnRetrive = new File_CreationAnRetrive("C:\\MyDevelopment\\MyEclipseProjects\\Assesnent_SimpliLearn\\src\\com\\simplileam\\testData");
		search="abc";
		navigateToApplication("search");
	}
	
	public static void navigateToApplication(String choice) {
		
		 switch(choice)
	        {
	            case "Retrive":
	            	creationAnRetrive.retriveFileNameAccending();
	                break;
	            case "search":
	            	creationAnRetrive.searchFileByName(search);
	                break;
	            default:
	                System.out.println("no match");
	        }
	    }
	

}
