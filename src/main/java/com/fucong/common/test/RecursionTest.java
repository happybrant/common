package com.fucong.common.test;

import com.fucong.common.entity.Node;
import com.fucong.common.util.RecursionUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/** @Author fuCong @Date 2023/4/26 13:42 */
public class RecursionTest {

  @Test
  public void buildTreeTest() {
    List<Node> nodeList = new ArrayList<>();
    Node node1 = new Node("1", "4", "子节点1", null);
    Node node2 = new Node("2", "4", "子节点2", null);
    Node node3 = new Node("3", "4", "子节点3", null);
    Node node4 = new Node("4", "0", "根节点1", null);
    Node node5 = new Node("5", "8", "子节点4", null);
    Node node6 = new Node("6", "8", "子节点5", null);
    Node node7 = new Node("7", "8", "子节点6", null);
    Node node8 = new Node("8", "0", "根节点2", null);

    nodeList.add(node1);
    nodeList.add(node2);
    nodeList.add(node3);
    nodeList.add(node4);
    nodeList.add(node5);
    nodeList.add(node6);
    nodeList.add(node7);
    nodeList.add(node8);

    RecursionUtil recursionUtil = new RecursionUtil(nodeList);

    List<Node> tree = recursionUtil.buildTree();
    System.out.println(tree);
  }
}
