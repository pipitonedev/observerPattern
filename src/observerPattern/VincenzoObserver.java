package observerPattern;

public class VincenzoObserver extends Observer {

	public VincenzoObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Status: " + subject.getState());
	}

	@Override
	public void updateParam() {
		System.out.println("Codice: " + subject.getCodiceSoggetto());

	}
}
