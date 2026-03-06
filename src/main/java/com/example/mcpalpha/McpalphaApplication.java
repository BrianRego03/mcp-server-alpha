package com.example.mcpalpha;

import com.example.mcpalpha.services.toolService;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class McpalphaApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpalphaApplication.class, args);
	}

	@Bean
	public List<ToolCallback> tools(toolService toolService) {
		return List.of(ToolCallbacks.from(toolService));
	}

}
