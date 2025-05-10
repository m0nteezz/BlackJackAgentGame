package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Dealer
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public interface DealerIf extends Participant, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

}
