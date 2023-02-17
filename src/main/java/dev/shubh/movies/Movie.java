package dev.shubh.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") // this let the framework know that this class represents each document in the movies collection
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private ObjectId id;
    private String imdbID;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> generes;
    private List<String> backdrops;
    @DocumentReference // this will cause the database to restore only the ids of the review
    // and the reviews will be in the separate collection
    private List<Review> reviewIds;
}
