/*
COMP 3220 Group 13 Phase 3
Elaboration Iteration Phase 2
Coded by Hannah Stam (103791045)
Prototype Code for Use Case #2
Class: DownloadFile
*/

import java.io.*;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import usecase2.File;

public class DownloadFile
{
	private ArrayList<File> newList = new ArrayList();

	/* Goes through the list of files
       If the files that have the boolean value selected as true
       They are added to the newList ArrayList
        */
    public ArrayList<File> selectFile(ArrayList<File> list)
    {
        ArrayList<File> newList = new ArrayList();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).isSelected())
            {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    /* Adds all of the files into the newList ArrayList */
    public ArrayList<File> selectAll(ArrayList<File> list)
    {
        ArrayList<File> newList = new ArrayList();
        for(int i = 0; i < list.size(); i++)
        {
            newList.add(list.get(i));
        }
        return newList;
    }

    /* Downloads the newList ArrayList into a zip file */
    public void download(ArrayList<File> newList) throws IOException 
    {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        ZipOutputStream zipFile = new ZipOutputStream(new BufferedOutputStream(fileOut));
        for(int i = 0; i < newList.size(); i++)
        {
            ZipEntry zipEn = new ZipEntry(newList.get(i).getNewName());
            zipFile.putNextEntry(zipEn);
            byte[] buffer = new byte[4*1024];
            int size = 0; 
            while((size = fileIn.read(buffer)) != -1)
            {
                zipFile.write(buffer, 0, size);
            }
            zipFile.flush();
            fileIn.close();
        }
    }
}