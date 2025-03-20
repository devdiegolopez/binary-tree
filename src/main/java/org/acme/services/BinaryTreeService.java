package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
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
        int root = ordered.get((ordered.size()/2));
        log.info(String.valueOf(root));
        log.info(requestDto.toString());
        return new ResponseDto(requestDto.getTree());
    }
}