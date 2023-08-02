package org.example.structural.composite;

public class Main {

    public static void main(String args[]){
        Directory movieDirectory = new Directory("Movie");
        FileSystem horrorMovie = new File("DD");
        movieDirectory.addFileSystem(horrorMovie);
        Directory fantasyMovieDirectory = new Directory("Fantasy Movie");
        FileSystem barbie = new File("Barbie");
        fantasyMovieDirectory.addFileSystem(barbie);
        movieDirectory.addFileSystem(fantasyMovieDirectory);
        movieDirectory.ls();
    }
}
