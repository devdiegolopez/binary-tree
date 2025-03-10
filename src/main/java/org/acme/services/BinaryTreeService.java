package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.data.dto.NodeDto;
import org.acme.domain.data.dto.request.RequestDto;
import org.acme.domain.data.dto.response.ResponseDto;
import org.acme.domain.ports.BinaryTreeServicePort;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@ApplicationScoped
public class BinaryTreeService  implements BinaryTreeServicePort {

    @Override
    public ResponseDto binaryTree(RequestDto requestDto) {
        Logger log = Logger.getLogger(BinaryTreeService.class.getName());
        List<Integer> ordered = requestDto.getTree().stream().sorted().collect(Collectors.toList());
        requestDto.setTree(ordered);
        NodeDto root = buildBinaryTree(ordered, 0, ordered.size() - 1);
        log.info("Root of the binary tree: " + root.getValue());
        log.info(requestDto.toString());
        return new ResponseDto(requestDto.getTree());
    }

    private NodeDto buildBinaryTree(List<Integer> ordered, int start, int end) {
        if (start > end){
            return null;
        }
        int mid = (start + end) / 2;
        NodeDto nodeDto = new NodeDto(ordered.get(mid));
        nodeDto.setLeft(buildBinaryTree(ordered, start, mid - 1));
        nodeDto.setRight(buildBinaryTree(ordered, mid + 1, end));
        return nodeDto;
    }
}