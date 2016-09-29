import org.junit.Test;
import static io.restassured.RestAssured.get;
import static org.junit.Assert.assertEquals;

public class TestTicTabToe {

    @Test
    public void test() {
        String response = get("/rest/v1/ttt").then().extract().response().body().asString();
        assertEquals(response, "something");
    }
}
