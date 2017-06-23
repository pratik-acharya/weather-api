package com.api.weather;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication
public class WeatherapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherapiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(){
		return  evt->{
			final  String URI = "https://graphical.weather.gov/xml/sample_products/browser_interface/ndfdXMLclient.php?zipCodeList=77001";
			RestTemplate restTemplate = new RestTemplate();
			Weather weather  = restTemplate.getForObject(URI, Weather.class);
			Temperature temperature = weather.getData().getTemperatureList().stream().filter(t->t.getType().equals("maximum")).findFirst().orElse(null);
			System.out.println("The maximum forecasted temperature for the next 7 days is "+temperature.getValues().stream().max(Comparator.naturalOrder()).orElse(null));

		};

	}

}
