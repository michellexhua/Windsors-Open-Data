/*
COMP 3220 Group 13 Phase 3
Elaboration Iteration 2
Coded by Hannah Stam (103791045)
Prototype Code for Use Case #2
Class: File
*/

package usecase2;
public class File 
{
    private String fileName;
    private double size;
    private String type;
    private boolean selected;
    private String newName;

    public File(String fileName)
    {
        this.fileName = fileName;
    }

    /* Getter for fileName variable */
    public String getFileName() 
    {
        return fileName;
    }

    /* Checks if variable selected is set to true (or false) */
    public boolean isSelected() 
    {
        return selected;
    }

    /* Setter for selected variable */
    public void setSelected(boolean selected) 
    {
        this.selected = selected;
    }

    /* Setter for size variable */
    public void setSize(double size) 
    {
        this.size = size;
    }
    /* Getter for size variable */
    public double getSize() 
    {
        return size;
    }

    /* Setter for type variable */
    public void setType(String type) 
    {
        this.type = type;
    }
    /* Getter for type variable */
    public String getType() 
    {
        return type;
    }

    /* Setter for newName variable */
    public void setNewName(String newName) 
    {
        this.newName = getFileName() + "." + getType();
    }

    /* Getter for newName variable */
    public String getNewName()
    {
        return this.newName;
    }
}
