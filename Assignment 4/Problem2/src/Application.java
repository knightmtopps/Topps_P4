//Martin Topps  Assignment 4 problem 1

// import statments
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Application {

    public static void main(String[] args) throws IOException{
        //Variable Declarations
        FileInputStream fileByteStream =null;
        FileOutputStream outputFile = null;
        Scanner inFS = null;
        DuplicateCounter wordCounter = new DuplicateCounter();
        PrintWriter ouFS = null;

        //open file run method
        fileByteStream = new FileInputStream ("problem2.txt");
        inFS = new Scanner(fileByteStream);
        wordCounter.count(fileByteStream);
        fileByteStream.close();

        //open ouputfile run method
        outputFile = new FileOutputStream("unique_word_counts.txt");
        wordCounter.write(outputFile);
        outputFile.close();
    }// end of main
}//end of Application
