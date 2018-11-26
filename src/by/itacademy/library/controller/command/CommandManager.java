package by.itacademy.library.controller.command;

import by.itacademy.library.controller.command.impl.ViewBookCatalogCommand;
import by.itacademy.library.controller.command.impl.ViewSingleCatalogRow;

public class CommandManager {
	
	private static BasicCommand command;
	
	public static BasicCommand defineCommand(String action) {
		switch(action) {
		case "view_catalog":
			command = new ViewBookCatalogCommand();
			break;
		case "single_row":
			command = new ViewSingleCatalogRow();
			break;
		case "find_book":
			break;
		}
		return command;
	}

}
