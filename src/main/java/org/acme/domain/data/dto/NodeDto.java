package org.acme.domain.data.dto;

public class NodeDto {
    private int value;
    NodeDto left;
    NodeDto right;

    NodeDto(int value){
        this.value = value;
        right = null;
        left = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeDto getLeft() {
        return left;
    }

    public void setLeft(NodeDto left) {
        this.left = left;
    }

    public NodeDto getRight() {
        return right;
    }

    public void setRight(NodeDto right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "NodeDto{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
