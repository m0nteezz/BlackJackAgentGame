package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: Hand
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public interface HandIf extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: hasCard
   */
   public void addHasCard(Card elem);
   public boolean removeHasCard(Card elem);
   public void clearAllHasCard();
   public Iterator getAllHasCard();
   public List getHasCard();
   public void setHasCard(List l);

   /**
   * Protege name: score
   */
   public void setScore(int value);
   public int getScore();

}
