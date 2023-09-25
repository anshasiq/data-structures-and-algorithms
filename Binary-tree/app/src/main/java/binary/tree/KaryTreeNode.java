package binary.tree;

import java.util.ArrayList;
import java.util.List;

public class KaryTreeNode {
    int value;
    List<KaryTreeNode> children;

    public KaryTreeNode(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
}
