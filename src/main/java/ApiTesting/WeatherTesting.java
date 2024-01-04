package ApiTesting;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class WeatherTesting {

    String baseUrl = "https://weather.com";
    public void Testing(){

        Response response = given().when().get(baseUrl).then().statusCode(200).extract().response();
        response.getBody().prettyPeek();

    }

    String baseUrl1 = "https://crunchyroll.com/";
    public void Testing1(){
        Response response = given().when().get(baseUrl1).then().statusCode(200).extract().response();
        response.getBody().prettyPeek();
    }
}
