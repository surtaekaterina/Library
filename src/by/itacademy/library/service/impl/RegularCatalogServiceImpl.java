package by.itacademy.library.service.impl;

import java.util.Date;
import java.util.List;

import by.itacademy.library.dao.BookDao;
import by.itacademy.library.dao.collection.BookDaoCollectionImpl;
import by.itacademy.library.entity.Book;
import by.itacademy.library.entity.Catalog;
import by.itacademy.library.service.CatalogService;

public class RegularCatalogServiceImpl implements CatalogService {

	private BookDao bookDao;

	@Override
	public Catalog listCatalog() {

		Catalog catalog = new Catalog();
		catalog.setResponseblePerson("Lyudvig");
		catalog.setCreationDate(new Date());

		// web solution, replace with factory
		bookDao = new BookDaoCollectionImpl();
		List<Book> books = bookDao.getBooks();
		catalog.setBooks(books);

		return catalog;
	}

}
