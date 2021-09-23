
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.createDirectories;
import static java.nio.file.Files.lines;

public class FileIOLecture {
//    public void readFileAndOutput(Path pathToFile) {
//        List<String> linesInTheFile = new ArrayList<>(); // declare it as a local variable
//        try {
//            linesInTheFile = Files.readAllLines(pathToFile);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//        for (String )
//    }
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path); // the result is a path object, not a string (even though it looks like it)
//        System.out.println(path.toAbsolutePath());

//        Path pathToThisLectureFile = Paths.get("src", "FileIOLecture.java");
//        System.out.println(pathToThisLectureFile);

//        Path pathToOurDataDir = Paths.get("src/data");
////        System.out.println(pathToOurDataDir);
//        try {
//            createDirectories(pathToOurDataDir);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        // mini exercise #1: 9/22/21 create a directory in src called test by developing a java program
//        Path pathToTestDir = Paths.get("src/test");
//        try {
//            Files.createDirectory(pathToTestDir);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

//        Path pathToOurDataDir = Paths.get("src/data");
//        try {
//            if (Files.notExists(pathToOurDataDir)) {
//                Files.createDirectories(pathToOurDataDir);
//            } else {
//                System.out.println("The " + pathToOurDataDir + " directory already exists!");
//            }
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

//        Path pathToOurFile = Paths.get("src/data", "list.txt");
//        try {
//            if (Files.notExists((pathToOurFile))) {
//                Files.createFile(pathToOurFile);
//            } else {
//                System.out.println("The " + pathToOurFile + " file already exists!");
//            }
//        } catch (IOException ioe) {
//            System.out.println("There was a problem!");
//            ioe.printStackTrace();
//        }

        Path pathToOurFile = Paths.get("src/data");
        List<String> myAnimals = Arrays.asList("Comet", "Callie", "Nugget");
        try {
            Files.write(pathToOurFile, myAnimals);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(pathToOurFile);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        for (String item : currentList) {
            System.out.println(item);
        }


    }
}


