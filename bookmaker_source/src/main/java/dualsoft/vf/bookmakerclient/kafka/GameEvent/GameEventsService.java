///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package dualsoft.vf.bookmakerclient.kafka.GameEvent;
//
//// topic GameEvents
//import java.util.Properties;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class GameEventsService {
//
//    @Value("${spring.kafka.bootstrap-servers}")
//    private String bootstrapServers;
//
////    private String gameEventTopic = "GameEvents";
////    private KafkaProducer gameEventProducer;
////    private Properties props;
////
////    public GameEventsService() {
////        props = new Properties();
////        props.put("bootstrap.servers", "172.20.0.21:9092,172.20.0.22:9092,172.18.0.23:9092");
////        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
////        //props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
////        props.put("value.serializer", "dualsoft.vf.bookmakerclient.kafka.GameEventSerializer");
////        props.put("group.id", "test");
////
////        gameEventProducer = new KafkaProducer(props);
////
////    }
////
////    public void publishEvent(String gameId, EventsEnum event) {
////        GameEvent gameEvent = new GameEvent(gameId, event);
////
////        ProducerRecord msg = new ProducerRecord(gameEventTopic, gameEvent);
////        gameEventProducer.send(msg);
////
////        gameEventProducer.close();
////
////    }
//
//}
