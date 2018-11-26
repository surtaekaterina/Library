package by.itacademy.library.controller.command.impl;

import java.util.Map;

import by.itacademy.library.controller.command.BasicCommand;

public class DefaultCommand implements BasicCommand{

	@Override
	public void performAction(Map<String, Object> params) {
		System.out.println("Incorrect user input");
		
	}

}
