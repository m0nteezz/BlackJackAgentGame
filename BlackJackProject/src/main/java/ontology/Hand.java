package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.*;

/**
* Protege name: Hand
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public class Hand implements HandIf, Serializable {
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

  public Hand() {
    this._internalInstanceName = "";
  }

  public Hand(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: hasCard
   */
   private List hasCard = new ArrayList();
   public void addHasCard(Card elem) { 
     hasCard.add(elem);
     pcs.firePropertyChange("hasCard", oldList, this.hasCard);
   }
   public boolean removeHasCard(Card elem) {
     boolean result = hasCard.remove(elem);
     pcs.firePropertyChange("hasCard", oldList, this.hasCard);
     return result;
   }
   public void clearAllHasCard() {
     hasCard.clear();
     pcs.firePropertyChange("hasCard", oldList, this.hasCard);
   }
   public Iterator getAllHasCard() {return hasCard.iterator(); }
   public List getHasCard() {return hasCard; }
   public void setHasCard(List l) {hasCard = l; }

   /**
   * Protege name: score
   */
   private int score;
   public void setScore(int value) { 
     pcs.firePropertyChange("score", this.score, value);
    this.score=value;
   }
   public int getScore() {
     return this.score;
   }

}
