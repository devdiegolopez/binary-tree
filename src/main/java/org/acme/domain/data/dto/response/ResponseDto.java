package org.acme.domain.data.dto.response;
import java.util.List;

public class ResponseDto {
    private List<Integer> dfsTraversal;

    public ResponseDto(List<Integer> dfsTraversal) {
        this.dfsTraversal = dfsTraversal;
    }

    public List<Integer> getDfsTraversal() {
        return dfsTraversal;
    }

    public void setDfsTraversal(List<Integer> dfsTraversal) {
        this.dfsTraversal = dfsTraversal;
    }

    @Override
    public String toString() {
        return dfsTraversal.toString();
    }
}