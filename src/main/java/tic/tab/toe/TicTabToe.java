package tic.tab.toe;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ttt")
//@Produces(MediaType.APPLICATION_JSON)
public class TicTabToe {

    @GET
    public String getSomething() {
        return "something";
    }
}
