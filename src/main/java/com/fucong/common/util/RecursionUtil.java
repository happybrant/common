package com.fucong.common.util;

import com.fucong.common.entity.Node;

import java.util.ArrayList;
import java.util.List;

/** @Author fuCong @Date 2023/4/26 11:34 */
public class RecursionUtil {
  private List<Node> nodeList;

  public RecursionUtil(List<Node> nodeList) {
    this.nodeList = nodeList;
  }

  /**
   * 从根节点开始建立完整的树形结构
   *
   * @return
   */
  public List<Node> buildTree() {
    List<Node> tree = new ArrayList<>();
    for (Node node : getRootNode()) {
      node = buildChildTree(node);
      tree.add(node);
    }
    return tree;
  }

  /**
   * 递归，建立子树形结构 *
   *
   * @param pNode
   * @return
   */
  public Node buildChildTree(Node pNode) {
    List<Node> childTrees = new ArrayList<>();
    for (Node node : nodeList) {
      if (node.getParentId().equals(pNode.getId())) {
        childTrees.add(buildChildTree(node));
      }
    }
    pNode.setChildren(childTrees);
    return pNode;
  }

  /**
   * 获取根节点(获取所有的父节点)
   *
   * @return
   */
  public List<Node> getRootNode() {
    List<Node> rootTree = new ArrayList<>();
    for (Node node : nodeList) {
      if ("0".equals(node.getParentId())) {
        rootTree.add(node);
      }
    }
    return rootTree;
  }
}
