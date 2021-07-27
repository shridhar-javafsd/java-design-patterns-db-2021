package design.patterns.demo.lab5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

//		List list = new ArrayList();		
//		list = new LinkedList();

		Messaging message = MessagingFactory.createNotification("SMS");
		message.sendMessage();

		message = MessagingFactory.createNotification("EMAIL");
		message.sendMessage();

	}

}
