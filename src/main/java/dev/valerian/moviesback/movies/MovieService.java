package dev.valerian.moviesback.movies;

import org.bson.types.ObjectId;

import java.util.List;

public interface MovieService {
    List<Movie> getAllService();

    Movie getOneMovie(ObjectId idMovie);

    void updateMovie(Movie movie);

    void deleteMovie(ObjectId idMovie);
}
