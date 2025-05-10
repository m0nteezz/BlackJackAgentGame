package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Result
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public interface ResultIf extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: resultName
   */
   public void setResultName(String value);
   public String getResultName();

}
