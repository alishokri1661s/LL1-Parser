import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class NonTerminal extends Word {


    private HashSet<Terminal> firstSet;
    private HashSet<Terminal> followSet;
    private Boolean isNullable=null;


    public NonTerminal(String name) {
        super(name);
    }

    public HashSet<Terminal> getFirstSet() {
        return firstSet;
    }

    public void setFirstSet(HashSet<Terminal> firstSet) {
        this.firstSet = firstSet;
    }

    public HashSet<Terminal> getFollowSet() {
        return followSet;
    }

    public void setFollowSet(HashSet<Terminal> followSet) {
        this.followSet = followSet;
    }

    public Boolean isNullable() {
        return isNullable;
    }

    public void setNullable(boolean nullable) {
        isNullable = nullable;
    }
}
