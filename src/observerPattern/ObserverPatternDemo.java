package observerPattern;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		new VincenzoObserver(subject);

//		for (int i = 0; i < 3; i++) {
//			System.out.println("Second state change: " + i);
//			subject.setState(i);
//			System.out.println();
//		}
		
		System.out.println("------TEST--------\n");
		subject.setCodiceSoggetto("ASXXLS");
		subject.setState(13);
		System.out.println();
		subject.setCodiceSoggetto("AXKHFT");
		System.out.println();
		subject.setState(0);
		System.out.println();
		subject.setCodiceSoggetto("RSTUY");
		
	}
}