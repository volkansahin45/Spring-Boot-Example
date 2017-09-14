package com.example.interact.Controller;

import com.example.interact.Entity.Movie;
import com.example.interact.Repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/movie")
public class MovieController {
    private MovieRepository repository = new MovieRepository();

    @RequestMapping(value = "", method = RequestMethod.GET)
    HashMap<Long, Movie> getMovies() {
        return repository.get();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Movie getMovie(@PathVariable Long id) {
        return repository.get(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String addMovie(Movie movie){

        return repository.add(movie);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public String update(Movie movie){
        return repository.update(movie);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable long id){
        return repository.delete(id);
    }
}
