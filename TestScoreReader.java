/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author TA
 */
public class TestScoreReader {
    private Scanner inputFile;
    private String line;
    public TestScoreReader(String filename)throws IOException{
    File file = new File(filename);
    inputFile = new Scanner(file);
    }
    public boolean readNextLine()throws IOException{
    boolean lineRead;
    lineRead = inputFile.hasNext();
    if(lineRead)
        line = inputFile.nextLine();
    return lineRead;
    }
    public double getAverage(){
    int total = 0;
    double average;
    String[] tokens = line.split(",");
    for(String str : tokens){
        total += Integer.parseInt(str);
    }
    average = (double) total/tokens.length;
    return average;
    }
    public void close()throws IOException{
    inputFile.close();
    }
}
