package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.domain.data.dto.request.RequestDto;
import org.acme.domain.data.dto.response.ResponseDto;
import org.acme.domain.ports.BinaryTreeServicePort;
import java.util.logging.Logger;
/**/
@Path("/hello")
public class GreetingResource {
    @Inject
    BinaryTreeServicePort binaryTreeServicePort;

    private static final Logger LOG = Logger.getLogger(String.valueOf(GreetingResource.class));
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDto hello(RequestDto requestDto) {
        LOG.info(requestDto.toString());
        return binaryTreeServicePort.binaryTree(requestDto);
    }
}