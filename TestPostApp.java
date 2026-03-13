import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestPostApp{
    public void main(String[] args){
        Post p1 = new Post("Alex Adam", "Help with JavaE", "Hi, could anyone help me I need to learn how to code in java!");
        String result = p1.toString();
        System.out.println(result);

        try {
            p1.save("mypost.txt");
        } catch( IOException ex ) {
                System.out.println("File not saved.");
                ex.printStackTrace();
        }

    }
}