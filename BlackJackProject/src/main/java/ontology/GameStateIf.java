package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: GameState
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public interface GameStateIf extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: stateName
   */
   public void setStateName(String value);
   public String getStateName();

}
