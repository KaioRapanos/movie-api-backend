package dev.kaio.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin
public class Review {

	@Id
	private ObjectId id;
	private String body;
	
	public Review(String body) {
		this.body = body;
	}
	
	
}
