package tic.tab.toe;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest/v1")
public class RegisterService extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> restClass = new HashSet<>();
        restClass.add(TicTabToe.class);
        return restClass;
    }
}
