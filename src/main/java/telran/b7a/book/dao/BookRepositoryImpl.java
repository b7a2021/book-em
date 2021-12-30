package telran.b7a.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import telran.b7a.book.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Stream<Book> findByAuthorsName(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Book> findByPublisherPublisherName(String publisherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		return em.find(Book.class, id) != null;
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> findById(String id) {
		return Optional.ofNullable(em.find(Book.class, id));
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub

	}

}
