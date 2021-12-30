package telran.b7a.book.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import telran.b7a.book.model.Publisher;

@Repository
public class PublisherRepositoryImpl implements PublisherRepository {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<String> findPublishersByAuthor(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Publisher> findDistinctByBooksAuthorsName(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Publisher> findById(String id) {
		return Optional.ofNullable(em.find(Publisher.class, id));
	}

	@Override
	public Publisher save(Publisher publisher) {
		// TODO Auto-generated method stub
		return null;
	}

}
