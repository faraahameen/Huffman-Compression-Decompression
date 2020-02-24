/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmanproj;

/**
 *
 * @author Farah ameen
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long startTime, stopTime, executionTime;
        System.out.println("Choose your file type\n");
         System.out.println("1-Txt file\n");
          System.out.println("2-Binary File");
        int x = scan.nextInt();
        switch(x){
            case 1: {
            TxtFile t = new TxtFile();
            System.out.println("1-Compress file\n");
                System.out.println("2-Decompress file\n");
            x = scan.nextInt();
            switch(x){
                case 1: {
                startTime = System.nanoTime();
                t.compress();
                stopTime = System.nanoTime();
                executionTime = stopTime - startTime;
                System.out.println("\nCompression Ratio: " +(getFileSize("compressed.txt") * 100.0 / getFileSize("test_huffman.txt"))+" %");
                System.out.println("Execution time: " + executionTime/1000000  + " msec");
                break;
            } case 2: {
                startTime = System.nanoTime();
                t.decompress();
                stopTime = System.nanoTime();
                executionTime = stopTime - startTime;
                System.out.println("Execution time: " + executionTime/1000000  + " msec");
                break;
            } default: {
                System.out.println("INVALID CHOICE");
            }
            }
            break;
        } case 2: {
            BinaryFile b = new BinaryFile();
            System.out.println("1-Compress file\n");
            System.out.println("2-Decompress file\n");
            x = scan.nextInt();
            switch(x){
                case 1:{
                startTime = System.nanoTime();
                b.compress();
                stopTime = System.nanoTime();
                executionTime = stopTime - startTime;
                  System.out.println("\nCompression Ratio: " +(getFileSize("compressed") * 100.0 / getFileSize("input.pdf"))+" %");
                System.out.println("Execution time: " + executionTime/1000000  + " msec");
                break;
            } case 2: {
                startTime = System.nanoTime();
                b.decompress();
                stopTime = System.nanoTime();
                executionTime = stopTime - startTime;
                System.out.println("Execution time: " + executionTime/1000000  + " msec");
                break;
       
            } default: {
                System.out.println("INVALID CHOICE");
            }}
        break;
        } default: {
            System.out.println("INVALID CHOICE");
        }
        }
    }
    	// This finds our text file size in bytes
	public static long getFileSize(String filename)
	{
		File file = new File(filename);
		if (!file.exists() || !file.isFile())
		{
			System.out.println("File does not exist!");
			return -1;
		}
		return file.length();
	}
}
