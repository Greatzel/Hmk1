package homework1;

import org.drools.core.util.Entry;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkMethods {

    public static void main(String[] args) {

        LinkMethods wb2 = new LinkMethods();
        wb2.readFile();
//        wb2.printfile();
        wb2.keyName();


    }

    public ArrayList<Website> readFile() {
        ArrayList<Website> fileList = new ArrayList();
        Website wb = new Website();

        try {
            FileInputStream file = new FileInputStream("C:\\Users\\Plus Ultra\\IdeaProjects\\3150Spring2020\\src\\homework1\\links.dat");
            ObjectInputStream input = new ObjectInputStream(file);

            Website in = (Website) input.readObject();

            while (in != null) {
                fileList.add(in);
                in = (Website) input.readObject();
            }

            input.close();
            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (EOFException e) {
            System.out.println("End of File Reach");

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

//        System.out.println("Array List of Objects" + fileList.toString());

        return fileList;
    }

    public void printfile() {

    }

    public HashMap<String, Integer> keyName() {

        Website wb = null;

        int count = 0;

        ArrayList<Website> webList = readFile();

       // System.out.println("ArrayList of Objects Printed+ " + webList.toString());

        Iterator webIt = webList.iterator();

        HashMap<String, Integer> webMap = new HashMap<String, Integer>();

        boolean check = true;

        while(check){

            wb = (Website) webIt.next();

            for(Website s: webList){
                //This is where I'm printing the thing
                System.out.println(s);
            }
            check = false;
        }

        boolean check2 = true;

        while(check2){

            wb = (Website) webIt.next();
            

        }
        return webMap;
    }
}