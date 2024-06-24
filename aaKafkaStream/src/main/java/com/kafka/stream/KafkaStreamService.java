package com.kafka.stream;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class KafkaStreamService {

/*	
	
//	@StreamListener("order-input-channel")
	@SendTo("order-takeaway-output-channel")
	public KStream<String, FeedData> takeAway(KStream<String, FeedData> order) {
		return order.filter((k,v)-> v.getDeliveryType().equalsIgnoreCase("takeaway"));
	}

//	@StreamListener("order-input-channel")
	@SendTo("order-homedelivery-output-channel")
	public KStream<String, FeedData> homeDelivery(KStream<String, FeedData> order) {
		return order.filter((k,v)-> v.getDeliveryType().equalsIgnoreCase("homedelivery"));
	}
*/	
}
