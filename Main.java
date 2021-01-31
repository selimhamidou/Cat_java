import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors


public class Main{
    public static void main(String[] args) {
        getFiles("/home/selim/Desktop/file1.txt", "/home/selim/Desktop/file2.txt", "/home/selim/Desktop/file3.txt" );
    }

    public static void getFiles(String ... args){
        int count = 1;
        for (String file_url:args){
            try{
                File file_to_read = new File(file_url);
                Scanner myReader = new Scanner(file_to_read);
                while (myReader.hasNextLine()) {
                    String data_file = myReader.nextLine();
                    printText(count, data_file, "addLineNumber");
                    count+=1;
                }

                myReader.close(); 
            }
            catch(FileNotFoundException e){
                System.out.println("What if I told you");
            }
            }
            
            }
    public static void printText(Integer count, String data_file, String catOption){
        if(catOption=="normal"){
            System.out.println(data_file);
        }


        if (catOption=="addDollar"){
            System.out.println(data_file + '$');

        }
        if (catOption=="addLineNumber"){
            System.out.println(data_file + count);
            
        }

    }

}


