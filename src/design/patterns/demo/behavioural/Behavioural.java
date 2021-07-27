package design.patterns.demo.behavioural;

public class Behavioural {

}

interface Visitable {
	void accept(Visitor visitor);
}

interface Visitor {
	void playGame(Cricket obj);

	void playGame(Hockey obj);

	void playGame(Football obj);
}

class GamePlayer implements Visitor {

	@Override
	public void playGame(Cricket obj) {
		System.out.println("Playing cricket...");
	}

	@Override
	public void playGame(Hockey obj) {
		System.out.println("Playing hockey...");
	}

	@Override
	public void playGame(Football obj) {
		System.out.println("Playing football...");
	}

}

abstract class Game {

	int score;

	public Game() {

	}

	public void getScore() {
		// code
	}

}

class Cricket extends Game implements Visitable {

	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}
}

class Hockey extends Game implements Visitable {

	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}
}

class Football extends Game implements Visitable {

	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}
}
