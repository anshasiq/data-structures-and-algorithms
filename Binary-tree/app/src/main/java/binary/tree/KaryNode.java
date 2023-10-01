package binary.tree;

import java.util.ArrayList;
import java.util.List;

public class KaryNode {


    public  String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public List<KaryNode> getChildrenNodes() {
        return childrenNodes;
    }

    public  List<KaryNode> childrenNodes;

    public KaryNode(String value) {
        this.value = value;
        this.childrenNodes = new ArrayList<>();
    }
    public void addChild(KaryNode child) {
        childrenNodes.add(child);
    }

}