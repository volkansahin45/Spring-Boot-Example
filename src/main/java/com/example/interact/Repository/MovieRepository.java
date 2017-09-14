package com.example.interact.Repository;

import com.example.interact.Entity.Movie;

import java.util.HashMap;

public class MovieRepository {
    private HashMap<Long, Movie> movies = new HashMap<Long, Movie>();
    private static long staticId = 0;

    public HashMap<Long, Movie> get() {
        return movies;
    }

    public String add(Movie m){
        m.setId(staticId++);
        movies.put(m.getId(), m);
        return "Added Successfully";
    }

    public String update(Movie m){
        if(movies.get(m.getId()) != null){
            movies.put(m.getId(), m);
            return "Updated Successfully";
        } else {
            return "An error occured";
        }
    }

    public Movie get(Long id) {
        return movies.get(id);
    }

    public String delete(long id) {
        if(movies.get(id) != null){
            movies.remove(id);
            return "Updated Successfully";
        } else {
            return "An error occured";
        }
    }
}
