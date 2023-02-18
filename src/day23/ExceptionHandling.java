package day23;

import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {
ExceptionOccurance exceptionOccurance= new ExceptionOccurance();

try {
    exceptionOccurance.Array();
}catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
    System.out.println("ArrayIndexOutOfBoundsException occured");
}
try {
    exceptionOccurance.fileNotFound();
}
catch (FileNotFoundException fileNotFoundException){
    System.out.println("File not found");
}
try {
    exceptionOccurance.saveImage();
}
catch (Exception exception){
    System.out.println("Parent exception");
    exception.printStackTrace();
}

    }
}
