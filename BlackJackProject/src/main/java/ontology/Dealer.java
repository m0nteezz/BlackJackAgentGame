package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.*;

/**
* Protege name: Dealer
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public class Dealer implements DealerIf, Serializable {
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

  public Dealer() {
    this._internalInstanceName = "";
  }

  public Dealer(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: hasHand
   */
   private Hand hasHand;
   public void setHasHand(Hand value) { 
     pcs.firePropertyChange("hasHand", (this.hasHand==null?new Hand():this.hasHand), value);
    this.hasHand=value;
   }
   public Hand getHasHand() {
     return this.hasHand;
   }

   /**
   * Protege name: hasGameState
   */
   private GameState hasGameState;
   public void setHasGameState(GameState value) { 
     pcs.firePropertyChange("hasGameState", (this.hasGameState==null?new GameState():this.hasGameState), value);
    this.hasGameState=value;
   }
   public GameState getHasGameState() {
     return this.hasGameState;
   }

   /**
   * Protege name: hasAction
   */
   private Action hasAction;
   public void setHasAction(Action value) { 
     pcs.firePropertyChange("hasAction", (this.hasAction==null?new Action():this.hasAction), value);
    this.hasAction=value;
   }
   public Action getHasAction() {
     return this.hasAction;
   }

   /**
   * Protege name: participantName
   */
   private String participantName;
   public void setParticipantName(String value) { 
     pcs.firePropertyChange("participantName", (this.participantName==null?new String():this.participantName), value);
    this.participantName=value;
   }
   public String getParticipantName() {
     return this.participantName;
   }

   /**
   * Protege name: hasResult
   */
   private Result hasResult;
   public void setHasResult(Result value) { 
     pcs.firePropertyChange("hasResult", (this.hasResult==null?new Result():this.hasResult), value);
    this.hasResult=value;
   }
   public Result getHasResult() {
     return this.hasResult;
   }

}
