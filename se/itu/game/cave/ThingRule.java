package se.itu.game.cave;

public interface ThingRule{
  public abstract boolean apply() throws RuleViolationException;
}
