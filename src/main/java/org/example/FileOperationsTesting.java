package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileOperationsTesting {
    public static void main(String[] args) throws IOException {
//////        try {
//////            String file = Files.readString(Path.of("Note.txt"));
//////        }catch (Exception e){
//////            System.out.println("Error occurred in file reading ");
//////        }
////         //creating a temporary file in temp directory
//////           Path tempFile = Files.createTempFile("Some", ".txt");
//////           Files.writeString(tempFile,"Aditya Love Someone");
//////           System.out.println("tempfile=" +tempFile);
////
////        //Creating a file in certain directory
////          /* try {
////               File file = new File("D:\\Project\\FileManager\\src\\main\\demo.txt");
////               if (file.createNewFile()) {
////                   System.out.println("File Created" + file);
////               } else {
////                   System.out.println("File already exist");
////               }
////           }catch (IOException e){
////               System.out.println("Exception occurred while creating a file ");
////               e.printStackTrace();
////           }
////           */
////     //write operation in file
////      /*  try {
////            FileWriter myFile = new FileWriter("demo.txt");
////            myFile.write("Aditya Love Someone ");
////            myFile.close();
////            System.out.println("Successfully wrote to the file");
////        }catch (IOException e) {
////            System.out.println("an error occurred");
////            e.printStackTrace();
////        }
////
////       */
////      //read ops in a file
////     /*  File myFile=new File("demo.txt");
////        Scanner myReader=new Scanner(myFile);
////        while(myReader.hasNextLine()){
////            String data= myReader.nextLine();
////            System.out.println(data);
////        }
////        myReader.close();
////        */
////
////        //get File info
//////        File myFile=new File("demo.txt");
//////        if(myFile.exists()){
//////            System.out.println("Filename " + myFile.getName());
//////            System.out.println("Absolutepath "+ myFile.getAbsolutePath());
//////
//////        }
////
////        //delete a file
//            File myFile=new File("demo.txt");
//            if(myFile.delete()){
//                System.out.println("deleted file name "+ myFile );
//            }else{
//                System.out.println("file not deleted");
//            }
//
////
        //Create a new directory
//         File directory=new File("D:\\Project\\FileManager\\src\\Testing");
//         if(!directory.exists()){
//             directory.mkdir();
//         }else{
//             System.out.println("directory already exists");
//         }

         File files=new File("D:\\Project\\FileManager\\src\\Testing");
         String []filenames=files.list();
         for(String filname:filenames){
             System.out.println(filname);
         }
    }
}
