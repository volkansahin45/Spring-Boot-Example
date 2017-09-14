package com.example.interact.Controller;

import com.example.interact.Entity.Movie;
import com.example.interact.Repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/movie")
public class MovieController {
    private MovieRepository repository = new MovieRepository();

    @RequestMapping(value = "", method = RequestMethod.GET)
    Map<Long, Movie> getMovies() {
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

    @RequestMapping(value = "/year/{year}", method = RequestMethod.GET)
    public Map<Long, Movie> getByYear(@PathVariable int year){
        return repository.getMoviesByYear(year);
    }
}
