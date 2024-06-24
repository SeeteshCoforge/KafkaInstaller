package com.kafka.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaStreamController {

	
	@Bean
	public Function<String, String> processorBinding() {
		return s -> s + " :: " + System.currentTimeMillis();
	}
	
	@Bean
	public Consumer<String> consumerBinding() {
		return s -> System.out.println("Data Consumed is "+ s.toUpperCase());
	}
	
	@Bean
	public Supplier producerBinding() {
		return () -> {
			try {
				Thread.sleep(5000);
			}
			catch (Exception e) {}
			return "new data";
		};
	}
	
	
/*	
	@Bean
    public KStream<String, String> kStream(StreamsBuilder streamsBuilder) {
        KStream<String, String> inputStream = streamsBuilder.stream("input-topic");
        KStream<String, String> outputStream = inputStream.mapValues(value -> value.toUpperCase());
        outputStream.to("output-topic");
        return outputStream;
    }
*/
}
