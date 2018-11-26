package by.itacademy.library.controller.command.impl;

import java.util.Map;

import by.itacademy.library.controller.command.BasicCommand;
import by.itacademy.library.entity.Catalog;
import by.itacademy.library.service.CatalogService;
import by.itacademy.library.service.impl.RegularCatalogServiceImpl;

public class ViewBookCatalogCommand implements BasicCommand {

	private CatalogService catalogService;

	@Override
	public void performAction(Map<String, Object> params) {

		// replace with factory
		catalogService = new RegularCatalogServiceImpl();
		Catalog catalog = catalogService.listCatalog();

		// move to other layer
		System.out.println(catalog);

	}

}
