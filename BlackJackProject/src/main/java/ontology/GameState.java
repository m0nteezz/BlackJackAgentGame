package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.*;

/**
* Protege name: GameState
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public class GameState implements GameStateIf, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = 5238599874882882387L;

  private String _internalInstanceName = null;

  public GameState() {
    this._internalInstanceName = "";
  }

  public GameState(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: stateName
   */
   private String stateName;
   public void setStateName(String value) { 
     pcs.firePropertyChange("stateName", (this.stateName==null?new String():this.stateName), value);
    this.stateName=value;
   }
   public String getStateName() {
     return this.stateName;
   }

}
