package org.acme.domain.data.dto.request;

import java.util.List;

public class RequestDto {
    List<Integer> tree;

    public RequestDto(List<Integer> tree) {
        this.tree = tree;
    }

    public RequestDto() {
    }

    public List<Integer> getTree() {
        return tree;
    }

    public void setTree(List<Integer> tree) {
        this.tree = tree;
    }

    @Override
    public String toString() {
        return tree.toString();
    }
}