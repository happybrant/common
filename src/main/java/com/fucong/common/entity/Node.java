package com.fucong.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/** @Author fuCong @Date 2023/4/26 11:32 */
@Data
@AllArgsConstructor
public class Node {
  private String id;
  private String parentId;
  private String name;
  private List<Node> children;
}
