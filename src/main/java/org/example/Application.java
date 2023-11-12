package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
//    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
      FileOperation fileOperation=new FileOperation();
      fileOperation.createFile();
      fileOperation.listFiles();
      fileOperation.fileWrite();
      fileOperation.readOps();
      fileOperation.deleteFile();
    }
}
