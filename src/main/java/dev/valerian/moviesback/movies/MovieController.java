package dev.valerian.moviesback.movies;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/movie")
public class MovieController {
    private MovieServiceimp movieService;

    public MovieController(MovieServiceimp movieService) {
        this.movieService = movieService;
    }

    public List<Movie> getAllService() {
        return movieService.getAllService();
    }

    public Movie getOneMovie(ObjectId idMovie) {
        return movieService.getOneMovie(idMovie);
    }

    public void updateMovie(Movie movie) {
        movieService.updateMovie(movie);
    }

    public void deleteMovie(ObjectId idMovie) {
        movieService.deleteMovie(idMovie);
    }
}
