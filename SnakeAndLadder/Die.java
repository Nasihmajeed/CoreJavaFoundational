public class Die {

	private int faces;

	public int roll() {
		System.out.println("Die has six faces");
		return (int) (Math.random() * faces) + 1;

	}

	public int getFaces() {
		return faces;
	}

	public void setFaces(int faces) {
		this.faces = faces;
	}
}
