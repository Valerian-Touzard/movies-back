package dev.valerian.moviesback.movies;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MovieServiceimp implements MovieService {
    MovieRepository movieRepository;

    public MovieServiceimp(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllService(){
        return this.movieRepository.findAll();
    }

    @Override
    public Movie getOneMovie(ObjectId idMovie){
        return this.movieRepository.findById(idMovie).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void updateMovie(Movie movie){
        this.movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(ObjectId idMovie){
        this.movieRepository.deleteById(idMovie);
    }
}
