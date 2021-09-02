package observer;

/**
 * The Subject class serves as an interface to the BestSellers class and
 * provides a registerObserver method to register any observer that wants to keep track
 * of the best-selling books, a removeObserver method to remove any observer that
 * doesn't want to keep track of the best-selling books any longer, and a
 * notifyObservers method to notify registered observers of changes to the
 * list.
 * @author Joshua DuPuis
 */
public interface Subject {

    /**
     * The registerObserver method registers a new observer who wants to keep
     * track of the best-sellers list.
     * @param observer The observer to be registered
     */
    public void registerObserver(Observer observer);

    /**
     * The removeObserver method removes an observer from the database so that
     * they will no longer receive updates when the best-sellers list is
     * modified.
     * @param observer The observer to be removed
     */
    public void removeObserver(Observer observer);

    /**
     * The notifyObservers method notifies all registered observers when the
     * best-sellers list is updated.
     * @param book The book to notify observers about that was just added to 
     * the best-sellers list
     */
    public void notifyObservers(Book book);
}
