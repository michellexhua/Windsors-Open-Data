/*
COMP 3220 Group 13 Phase 3
Elaboration Iteration 2
Coded by Hannah Stam (103791045)
Prototype Code for Use Case #2
Class: Dataset
*/

import java.io.*;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import usecase2.File;

public class Dataset 
{
    private String datasetName;
    private String description;
    private ArrayList<File> List = new ArrayList();

    public Dataset(String datasetName)
    {
        this.datasetName = datasetName;
    }

    /* Setter for the description variable */
    public String getDescription() 
    {
        return description;
    }

    /* Setter for the description variable */
    public void setDescription(String description) 
    {
        this.description = description;
    }

    
}