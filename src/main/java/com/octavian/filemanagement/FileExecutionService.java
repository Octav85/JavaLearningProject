package com.octavian.filemanagement;

import java.io.File;

public class FileExecutionService {
    public static void main(String[] args) {
        File demoFile = new File("src/main/java/com/octavian/fileManagement/demFile");

        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.informIfTheFileExists(demoFile);
        FileManager.printIfTheFileIsADirectory(demoFile);
        FileManager.printTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
        //FileManager.deleteIfTheFileExists(demoFile);

        InputFileReadManager.readDataFromATextFile(demoFile);
        InputFileReadManager.readDataFromATextFileUsingFileReader(demoFile);
        InputFileReadManager.readDataFromFileUsingBufferedReader(demoFile);

        OutputFileWriterManager.writeDataIntoFileWithFileWriter(demoFile, "test text");
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile,"Empty text");



    }
}
