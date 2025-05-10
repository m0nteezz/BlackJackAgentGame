package ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Participant
* @author ontology bean generator
* @version 2025/05/10, 15:03:29
*/
public interface ParticipantIf extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: hasHand
   */
   public void setHasHand(Hand value);
   public Hand getHasHand();

   /**
   * Protege name: hasGameState
   */
   public void setHasGameState(GameState value);
   public GameState getHasGameState();

   /**
   * Protege name: hasAction
   */
   public void setHasAction(Action value);
   public Action getHasAction();

   /**
   * Protege name: participantName
   */
   public void setParticipantName(String value);
   public String getParticipantName();

   /**
   * Protege name: hasResult
   */
   public void setHasResult(Result value);
   public Result getHasResult();

}
