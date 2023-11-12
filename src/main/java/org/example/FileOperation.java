package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    public void createFile(){
        try {
            File myFile = new File("D:\\Project\\FileManager\\src\\Testing\\Test.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }

    }

    public  void listFiles(){
        File file=new File("Test.txt");
        if(file.exists()){
            System.out.println("File name is " +file);
        }else{
            System.out.println("file not exists");
        }
    }

    public void fileWrite() {
     try {
         FileWriter myFile = new FileWriter("Test.txt");
         myFile.write("Nitya is a Good Boy");
         myFile.close();
     }catch (IOException e) {
         System.out.println("exception occurred ");
         e.printStackTrace();
     }

    }

    public void readOps() throws FileNotFoundException {
        File myFile= new File("Test.txt");
        Scanner fileReader= new Scanner(myFile);
        while(fileReader.hasNextLine()){
            String data= fileReader.nextLine();
            System.out.println("The content inside file are "+ data);
        }
    }

    public void deleteFile(){
        File myFile= new File("Test.txt");
        if(myFile.delete()){
            System.out.println(myFile + "file deleted successfully");
        }else {
            System.out.println("File not deleted ");
        }

    }
}
