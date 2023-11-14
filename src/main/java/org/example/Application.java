package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
  public static FileOperation fileOperation=new FileOperation();
  public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        
        firstWindow();
    }

    public static void firstWindow(){
        System.out.print("You can do following operation in this application");
        System.out.println("For creating file in a directory: Enter1");
        System.out.println("For listing all the files in a directory: Enter2");
        System.out.println("for writing content inside the files: Enter3");
        System.out.println("To read the content from file: Enter4");
        System.out.println("To delete the particular file: Enter5");

       int input1= scanner.nextInt();
       scanner.nextLine();
        System.out.println(input1);

        switch (input1){
            case 1:
                fileOperation.createFile();
                break;

            case 2:
                fileOperation.listFiles();
                break;
            case 3:
                fileOperation.fileWrite();
                break;
            case 4:
                fileOperation.readOps();
                break;
            case 5:
                fileOperation.deleteFile();
              break;
            default:
                System.out.println("invalid input!!");


        }

    }
}
