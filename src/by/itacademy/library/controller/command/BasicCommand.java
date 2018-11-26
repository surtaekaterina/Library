package by.itacademy.library.controller.command;

import java.util.Map;

public interface BasicCommand {

	void performAction(Map<String, Object> params);
}
