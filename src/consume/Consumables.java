/*
additional exercises:
For the Carrot and Pill classes, create an interface that will separate out shared functionality between these two classes dealing with consuming them. After you are finished with this exercise, please move directly into the curriculum exercise for Abstract Classes and Interfaces.
 */

package consume;

public interface Consumables {
    void consume();
    void throwAway();
    void checkIfExpired();
}
