package training;


import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {


//
//    public void getProduct(){
//        String endpoint = "http://localhost:8888/api_testing/product/read_one.php";
//         given().queryParam("id", 2).
//                 when().get(endpoint).then();
//        response.log().body();
//
//
//    }
//
//
//    @Test
//    public void creatProduct(){
//        String endpoint = "http://localhost:8888/api_testing/category/create.php";
//        String body = """
//                {
//                "name"; = "Water Bottle",
//                "description"; "Blue water bottle. Holds 64 ounces",
//                "prices"; 64
//                """;
//    }
//    @Test
//    public void Updateproduct(){
//        String endpoint= "http://localhost:8888/api_testing/category/update.php";
//        String body = """
//                {
//                "id": 19,
//                "name": "Water Bottle",
//                "description": "Blue water bottle, Hold 64 ounces",
//                "prices": 15,
//                "categories_id":
//                """;
//        var response = given().body(body).when().put(endpoint).then();
//        response.log().body();
//    }
//
//    @Test
//    public void deleteProduct(){
//        String endpoint = "http://localhost:8888/api_testing/category/delete.php";
//        String body = """
//                {
//                "id": 19
//                }
//                """;
//        var response = given().body(body).when().delete(endpoint).then();
//        response.log().body();
//    }
//
//    @Test
//    public void createSerializedProduct(){
//        String endpoint = "http://localhost:8888/api_testing/category/create.php";
//        Product product = new Product(
//                "Water Bottle",
//                "Blue water bottle, Holds 64 ounces",
//                12,
//                3
//        );
//        var response = given().body(product).when().post(endpoint).then();
//        response.log().body();
//    }



}
