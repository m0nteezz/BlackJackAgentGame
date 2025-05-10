package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Card
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public interface CardIf extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: cardValue
   */
   public void setCardValue(String value);
   public String getCardValue();

   /**
   * Protege name: cardSuit
   */
   public void setCardSuit(String value);
   public String getCardSuit();

}
