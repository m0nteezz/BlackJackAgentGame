package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.*;

/**
* Protege name: Result
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public class Result implements ResultIf, Serializable {
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

  public Result() {
    this._internalInstanceName = "";
  }

  public Result(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: resultName
   */
   private String resultName;
   public void setResultName(String value) { 
     pcs.firePropertyChange("resultName", (this.resultName==null?new String():this.resultName), value);
    this.resultName=value;
   }
   public String getResultName() {
     return this.resultName;
   }

}
