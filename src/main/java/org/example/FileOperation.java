package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    public void createFile(){
        System.out.println("Enter the name of the file you want to create");
        try {
            Scanner scanner=new Scanner(System.in);
            String filename=scanner.nextLine();

            File myFile = new File(filename);
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
        System.out.println("Enter the file name you want to edit");
     try {
         Scanner scanner=new Scanner(System.in);
         String fileEdit=scanner.nextLine();
         FileWriter myFile = new FileWriter(fileEdit);
         System.out.println("Enter the content you want to add in the file");
         String content=scanner.nextLine();
         myFile.write(content);
         myFile.close();
     }catch (IOException e) {
         System.out.println("exception occurred ");
         e.printStackTrace();
     }

    }

    public void readOps() {
        System.out.println("Enter the file name which you want to read ");
        try {
            Scanner scanner=new Scanner(System.in);
            String readContent=scanner.nextLine();
            File myFile = new File(readContent);
            Scanner fileReader = new Scanner(myFile);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println("The content inside file are " + data);

            }
        }catch (FileNotFoundException e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }

    public void deleteFile(){
        System.out.println("Enter the file name which you want to delete");
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();

        File myFile= new File(input);
        if(myFile.delete()){
            System.out.println(myFile + "file deleted successfully");
        }else {
            System.out.println("File not deleted ");
        }

    }
}
