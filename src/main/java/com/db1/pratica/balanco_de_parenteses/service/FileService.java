package com.db1.pratica.balanco_de_parenteses.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileService {

    private String fileName;

    public FileService(String fileName) throws IOException {
        this.fileName = fileName;
    }

    public void writeInFile(List<String> values) throws IOException {
        File file = new File(fileName);
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);

        for (String value : values) {
            fileWriter.write(value);
            System.out.println(value);
        }

        fileWriter.close();
    }
}
