package logic;

import pojos.Rule;
import pojos.RuleType;

/**
 * Created by jMarshall on 1/29/17.
 */
public class TimeRule implements Rule {
    private String name;
    private int id;

    public int getId() {
        return id;
    }
    public String ruleName() {
        return name;
    }
    public RuleType getType() {
        return RuleType.RULE_PLACEHOLDER;
    }


}
