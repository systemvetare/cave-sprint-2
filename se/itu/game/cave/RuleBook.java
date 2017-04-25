package se.itu.game.cave;

import java.util.HashMap;
import java.util.Map;

public class RuleBook implements ThingRule{
  private static Map<Thing,ThingRule> rules = new HashMap<Thing, ThingRule>();

  public static ThingRule getRuleFor(Thing thing){
    ThingRule rule = rules.get(thing);
    if(rule == null){
      rule = () -> {return true;};
    }
    return rule;
  }
  public static void addThingRule(Thing thing, ThingRule rule){
    rules.put(thing, rule);
  }
  @Override
  public boolean apply(){
    return true;
  }
}
