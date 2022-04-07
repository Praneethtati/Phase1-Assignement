import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class CompanyLockers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		System.out.println("Application Name : LockedMe.com");
	    System.out.println("Developer Name:  Praneeth Reddy Tati");
	    String path="D:\\Simplilearn\\";
		Scanner sc=new Scanner(System.in);
		 while(true)
         {
			 {
				 System.out.println("Enter your choice 1.Retrieving files 2. Business Operations 3. Close ");
				 int choice=sc.nextInt();
				 switch(choice)
				 {
				 case 1: System.out.println("Retrieving files");
					     File file = new File(path);
					     ArrayList<String> arrayList = new ArrayList<String>();
					     for(File file2 : file.listFiles())
					     {
						  String fileNames = file2+"";
						  String[] ss = fileNames.split("\\\\");
						  arrayList.add(ss[ss.length-1]);
					      }	
					    Collections.sort(arrayList);
					    for (int i = 0; i < arrayList.size(); i++) {
					    System.out.println(arrayList.get(i));	
					    }
					break;
				 case 2: System.out.println("Business Operations");
				         while(true) {
				         System.out.println("Enter your choice 1. Add  2. Delete  3.Search 4.Exit");
        	             int choice1=sc.nextInt();
        	             switch(choice1) {
        	             case 1: while(true) {
     			                 System.out.println("enter the file name");
     			                 String filename=sc.next();
     			                 String finalfile=path+filename;
     			                 File f1=new File(finalfile);	
     			                 boolean res=f1.createNewFile();
     			                 ArrayList<String> al=new ArrayList<>();
     			                 al.add(filename);
     			                 if(res==false) {
     				              System.out.println("file not created");
     			                   }
     			                  else 
     			                    {
                                   System.out.println("file is created");
                                   }
     			                 break;
        	                    }
        	                   break;
        	              case 2: System.out.println("Enter the file to be deleted");
        		                String filedel=sc.next();
        	                    String delfile=path+filedel;
        	                    File k=new File(delfile);
        	                    boolean res1=k.delete();
        	                    if(res1==false)
        	                     {
        	        	          System.out.println("File not found");
        	                     }
        	                   else 
        	                   {
        	        	          System.out.println("File got deleted");
        	                     }
        	         
        	                    break;
        	              case 3: System.out.println("Enter the file to be searched");
        		                String filesearch=sc.next();
        		                 int flag=0;
        	                     File se=new File(path);
        	                     File filen1[]=se.listFiles();
        	                  for(File ff:filen1)
        	                   {
        	        	         if(ff.getName().equals(filesearch))
        	        	              {
        	        		         flag=1;
        	        		            break;
        	        	               }
        	        	         else 
        	        	            {
        	        		         flag=0;
        	                        }
        	                    }
        	                    if(flag==1)
        	                    {
        	        	        	 System.out.println("File is found");
        	        	         }
        	        	         else
        	        	         {
        	        	        	 System.out.println("File not found");
        	        	         }
        	        	         break;
        	        	   case 4: System.exit(0);
        	     		         break;
        	     		 default:System.out.println("check the option and retry");
        	     		break;
        	        }
        	             break;
				    }
				         break;
        	    case 3: System.out.println("Closed the application");
        	            System.exit(0);
        	            break;
        	    default: System.out.println("Select the correct option");
				          break;
        	         }
        		}
        	}
	}
}


