package com.bridgelabz;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileIO {
    //  public List<Contacts> readData() {
    public static Map<String, String> readData() {
        Map<String, String> mapFileContents = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            //create file object
            File file = new File("Address Book.txt");

            //create BufferedReader object from the File
            bufferedReader = new BufferedReader(new FileReader(file));

            String line = null;
            //read file line by line
            while ((line = bufferedReader.readLine()) != null) {

                //split the line by :
                String[] parts = line.split(":");
                String bookName = parts[0].trim();
                String fname = parts[1].trim();
                mapFileContents.put(bookName, fname);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Always close the BufferedReader
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e) {
                }
            }
        }
        return mapFileContents;
    }

    public void writeData(Map<String, AddressBookSystemDetails> addressBook) {
        File file = new File("C:\\Users\\Rohit\\IdeaProjects\\AddressBookSystemUsingIOStream\\src\\com\\bridgelabz\\addressbooksystem");
        BufferedWriter bufferedWriter = null;
        try {
            //create new BufferedWriter for the output file
            bufferedWriter = new BufferedWriter(new FileWriter(file));

            //iterate map entries
            for (Map.Entry<String, AddressBookSystemDetails> entry : addressBook.entrySet()) {
                //put key and value separated by a colon
                bufferedWriter.write(entry.getKey() + ":" + entry.getValue());

                //new line
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}