package day23;

import java.io.FileNotFoundException;

public class ExceptionOccurance {
    public void Array() throws ArrayIndexOutOfBoundsException{
        throw  new ArrayIndexOutOfBoundsException();
    }
    public void fileNotFound() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
    public  void saveImage() throws  Exception{
        throw  new Exception();
    }
}
