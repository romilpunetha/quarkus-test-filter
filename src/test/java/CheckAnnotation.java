import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static io.restassured.RestAssured.given;

@QuarkusTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CheckAnnotation {

    @Test
    public void testAnnotation() {

        given().get("/api/v1/test")
                .then()
                .statusCode(200);
    }
}
