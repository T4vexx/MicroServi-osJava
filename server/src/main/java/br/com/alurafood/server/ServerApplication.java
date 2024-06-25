package br.com.alurafood.server;

/*
	Em aplicações de microservices podemos ter urls mudando por diversos motivos, assim existe um serviço
	centralizado chamado discovery que tem as informações das urls dos microserviços, mesmo se eles mudarem
	Quando o microserviço subir ele se registra no discovery (service registry)

	No client-side discovery, o cliente (no caso o microsserviço ou o API Gateway) consulta o service registry,
	obtém a lista de instâncias do serviço que ele quer consumir e ele próprio é responsável por fazer o balanceamento de carga,
	escolhendo para qual instância irá direcionar a requisição (quando houver mais de uma instância do
	serviço que ele precisa consumir registrada). Veremos isso na aula em que abordo sobre balanceamento de carga.
	No server-side discovery ao invés do cliente consultar diretamente o service registry, é feita uma solicitação
	para uma camada intermediária como um DNS ou roteador, por exemplo, que faz a consulta ao service
	registry e o load balancing (balanceamento de carga), já encaminhando a requisição a uma das instâncias,
	garantindo que nenhum servidor seja sobrecarregado e desacoplando essa lógica do cliente.


*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
