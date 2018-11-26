package by.itacademy.library.controller.console;

import static by.itacademy.library.controller.console.view.SimpleConsoleView.*;

import java.util.Map;

import static by.itacademy.library.controller.command.CommandManager.*;
import by.itacademy.library.controller.command.BasicCommand;

public class MainConsoleController {

	public static void main(String[] args) {
		showBasicMenu();

		// simulate console input
		// int input = readUserInput(1);
		// int input = readUserInput(2);
		Map<String, Object> userData = readUserInput();

		Object userAction = userData.get("user_action");

		BasicCommand command = defineCommand(convertString(userAction));
		command.performAction(userData);

	}

	private static String convertString(Object obj) {
		return (String) obj;

	}

}
