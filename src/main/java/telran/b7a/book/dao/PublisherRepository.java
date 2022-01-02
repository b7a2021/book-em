package telran.b7a.book.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;

import telran.b7a.book.model.Publisher;

public interface PublisherRepository{
	

	List<String> findPublishersByAuthor(String authorName);
	
	Stream<Publisher> findDistinctByBooksAuthorsName(String authorName);

	Optional<Publisher> findById(String publisher);

	Publisher save(Publisher publisher);
}
