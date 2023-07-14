Spring Boot app with Docker

prerequisite: Dcoker must installed  and running.

step1 : write sping boot app using spring initializer(dependency modules, Spring web)

Step 2:Add one endpoint

        @RestController
		@RequestMapping("/")
		@SpringBootApplication
		public class DemoDocker1Application {

			public static void main(String[] args) {
				SpringApplication.run(DemoDocker1Application.class, args);
			}
			
			@GetMapping
			public String greetings() {
				return "hello welcome to docker demo";
			}

		}
   
Step 3: Spring Boot 2.3.0 onwards, no need create docker file, new feature(Cloud native build patch)  enable by run maven commnd, it will create docker image  

		
Step 4. go to terminal root folder run below command 
        mvn spring-boot:build-image
		
		image prepared and deploy in local docker server
  
        docker build -t spring-boot-docker-demo-01.jar

Step 5. run the container by below command
   
   docker run --publish 9090:9090 demo-docker-2:0.0.1-SNAPSHOT
   
Step 6:  hit the browser url http://localhost:9090   

