package com.umber.visualizer;

import com.umber.visualizer.configuration.ModReader;
import com.umber.visualizer.readers.TechnologyParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisualizerApplication implements CommandLineRunner {

	@Autowired
	ModReader modReader;

	@Autowired
	TechnologyParser techParser;
	public static void main(String[] args) {
		SpringApplication.run(VisualizerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(modReader.getModPath());
		System.out.println("Can see artillery file: " + modReader.hasTech());
		techParser.readFile("artillery.txt");
	}
}
