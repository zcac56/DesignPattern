package weatherStation;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Object o);
	public void notifyObservers();
}
