/**
 *  Filename:  Employee_Files_Data.java
 *  Author:  Jeffrey N. Davis
 *  Date Created:  09/27/2010
 *  Revisions:
 *  Purpose of File:  contains a data object for Employee_Files
 */

//  package declaration
package rmischedule.employee.data_components;

//  import declarations
import java.io.File;


/**
 *  Class Name:  Employee_Files_Data
 *  Purpose of Class:  a data object for Employee_Files
 */
public class Employee_Files_Data
{
    //  private variable declarations
    private StringBuffer fileName;
    private StringBuffer localFilePath;
    private File file;

    //  public method implementations
    /**
     *  Method Name:  Employee_Files_Data
     *  Purpose of Method:  creates a default instance of this object, calls
     *      secondary constructor to initialize
     *  Arguments:  none
     *  Returns:  none
     *  Preconditions:  object DNE
     *  Postconditions:  object exists, variables initialized
     */
    public Employee_Files_Data()
    {
        //  constructor chaining
        this(null, null, null);
    }

    /**
     *  Method Name:  Employee_Files_Data
     *  Purpose of Method:  creates an instance of this object, initializes
     *      and sets member variables
     *  Arguments:  two strings representing fileName, localFilePath
     *  Returns:  none
     *  Preconditions:  object DNE
     *  Postconditions:  object exists, variables intitialized and set
     */
    public Employee_Files_Data(String argFileName, String argLocalFilePath,
            File argFile)
    {
        //  initialize class variables
        this.fileName = new StringBuffer(0);
        this.localFilePath = new StringBuffer(0);
        this.file = null;
        
        //  set fileName
        if(argFileName != null)
        {
            try
            {
                this.fileName.append(argFileName);
            }
            catch(IllegalArgumentException ex)
            {
                ex.printStackTrace();
            }
        }

        //  set localFilePath
        if(argLocalFilePath != null)
        {
            try
            {
                this.localFilePath.append(argLocalFilePath);
            }
            catch(IllegalArgumentException ex)
            {
                ex.printStackTrace();
            }
        }

        //  set file
        if(argFile != null)
        {
            try
            {
                this.file = argFile;
            }
            catch(IllegalArgumentException ex)
            {
                ex.printStackTrace();
            }   //  end try/catch
        }   //  end if
    }   //  end method

    //  getters/setters
    public String getFileName()
    {
        return this.fileName.toString();
    }

    public String getLocalFilePath()
    {
        return this.localFilePath.toString();
    }

    public File getFile()
    {
        return this.file;
    }

    public void setFileName(String argFileName)
    {
        //  ensure nothing in stringbuffer
        this.fileName.setLength(0);

        //  set
        try
        {
            this.fileName.append(argFileName);
        }
        catch(IllegalArgumentException ex)
        {
            ex.printStackTrace();
        }
    }

    public void setLocalFilePath(String argLocalFilePath)
    {
        //  ensure nothing in stringbuffer
        this.localFilePath.setLength(0);

        //  set
        try
        {
            this.localFilePath.append(argLocalFilePath);
        }
        catch(IllegalArgumentException ex)
        {
            ex.printStackTrace();
        }
    }

    public void setFile(File argFile)
    {
        //  ensure no duplicate file
        this.file = null;

        //  set
        if(argFile != null)
        {
            try
            {
                this.file = argFile;
            }
            catch(IllegalArgumentException ex)
            {
                ex.printStackTrace();
            }   //  end try/catch
        }   //  end if
    }   //  end method
};  // end class