package com.kafka.stream;

import org.apache.kafka.streams.kstream.KStream;


public interface StreamBindings {

	
//	@Input("order-input-channel")
	KStream<String, FeedData> inputStream();

//	@Output("order-takeaway-output-channel")
	KStream<String, FeedData> takeAwayStream();

//	@Output("order-homedelivery-output-channel")
	KStream<String, FeedData> homeDeliveryStream();
	
	
}
