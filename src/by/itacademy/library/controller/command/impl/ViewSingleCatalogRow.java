package by.itacademy.library.controller.command.impl;

import java.util.Map;

import by.itacademy.library.controller.command.BasicCommand;
import by.itacademy.library.entity.Book;
import by.itacademy.library.entity.Catalog;
import by.itacademy.library.service.CatalogService;
import by.itacademy.library.service.impl.RegularCatalogServiceImpl;

public class ViewSingleCatalogRow implements BasicCommand {

	private CatalogService catalogService;

	@Override
	// add params to metod(wich book you want)
	public void performAction(Map<String, Object> params) {

		catalogService = new RegularCatalogServiceImpl();
		Catalog catalog = catalogService.listCatalog();

		// book id hardcoded
		Book row = catalog.getSingleRow(2);

		System.out.println(row);
	}

}
