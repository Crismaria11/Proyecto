package cine;

import java.util.ArrayList;

public class Movie {
    String name;
    int time;

    public Movie(String name, int time){
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "" + name + "\n Time: "+time+"\n";
    }

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public void add(ArrayList<Movie> movie) {
    }
}
