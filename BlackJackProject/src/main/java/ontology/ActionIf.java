package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Action
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public interface ActionIf extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: actionName
   */
   public void setActionName(String value);
   public String getActionName();

}
