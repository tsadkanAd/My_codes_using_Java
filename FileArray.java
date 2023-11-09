/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import java.io.*;
/**
 *
 * @author TA
 */
public class FileArray {
    public static void writeArray(String fileName, int[]a)throws IOException{
    if(!fileName.endsWith(".dat"))
        fileName+=".dat";
    FileOutputStream open = new FileOutputStream(fileName);
    DataOutputStream write = new DataOutputStream(open);
    for(int i = 0; i < a.length; i++){
        write.writeInt(a[i]);
    }
    write.close();
    }
    public int [] readArray(String fileName, int[]a)throws IOException{
            if(!fileName.endsWith(".dat"))
        fileName+=".dat";
    FileInputStream open = new FileInputStream(fileName);
    DataInputStream read = new DataInputStream(open);
    for(int i = 0; i < a.length; i++){
    a[i] = read.readInt();
    }
    read.close();
    return a;
    }
}
