package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.*;

/**
* Protege name: Card
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public class Card implements CardIf, Serializable {
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

  public Card() {
    this._internalInstanceName = "";
  }

  public Card(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: cardValue
   */
   private String cardValue;
   public void setCardValue(String value) { 
     pcs.firePropertyChange("cardValue", (this.cardValue==null?new String():this.cardValue), value);
    this.cardValue=value;
   }
   public String getCardValue() {
     return this.cardValue;
   }

   /**
   * Protege name: cardSuit
   */
   private String cardSuit;
   public void setCardSuit(String value) { 
     pcs.firePropertyChange("cardSuit", (this.cardSuit==null?new String():this.cardSuit), value);
    this.cardSuit=value;
   }
   public String getCardSuit() {
     return this.cardSuit;
   }

}
