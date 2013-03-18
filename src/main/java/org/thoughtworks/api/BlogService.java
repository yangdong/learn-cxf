package org.thoughtworks.api;

import org.thoughtworks.api.model.Post;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/post")
@Produces( {"application/json", "application/xml"} )
@Consumes( {"application/json", "application/xml"} )
public class BlogService {
    @POST
    public Response welcome(@Context HttpServletRequest request, @Context HttpServletResponse response, Post post) {
        return Response.status(Response.Status.OK).entity(post).build();
    }

    @GET
    @Path("/{post-id}")
    public Response getPost(@PathParam("post-id") String postId) {
        return Response.status(Response.Status.OK).entity("{\"post-id\": \"" + postId + "\"}").build();
    }
}
