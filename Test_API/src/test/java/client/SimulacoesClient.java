package client;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import model.Simulacao;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import commons.Base;
import io.restassured.config.RestAssuredConfig;

@Test
public class SimulacoesClient extends Base{
	
	

	public Simulacao retornaSimulacaoPeloId(String id) {
        return
        		
            given().
                pathParam("id", id).
            when().
                get("/v1/simulacoes/{id}").
            then().
                statusCode(HttpStatus.SC_OK).
                extract().
                    body().
                        as(Simulacao.class);

         }
	 

}