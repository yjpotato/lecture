package chap98_homework.nc230404.clazz;

public class Thread2 extends Thread{
	private NumberPrinter np;

	public NumberPrinter getNp() {
		return np;
	}

	public void setNp(NumberPrinter np) {
		this.np = np;
	}
	
	@Override
	public void run() {
		np.numPrint2(30);
	}
}
