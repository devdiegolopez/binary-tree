package org.acme.domain.ports;

import org.acme.domain.data.dto.request.RequestDto;
import org.acme.domain.data.dto.response.ResponseDto;

public interface BinaryTreeServicePort {
    ResponseDto binaryTree(RequestDto requestDto);
}
