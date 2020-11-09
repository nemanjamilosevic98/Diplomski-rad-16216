///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package dualsoft.vf.bookmakerclient.kafka.SeasonControlTopic;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.Properties;
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.apache.kafka.clients.consumer.ConsumerRecords;
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author dusan
// */
//@Service
//public class SeasonConsumerMessagingService {
//
//    @Value("${spring.kafka.bootstrap-servers}")
//    private String bootstrapServers;
//
//    private String mytopic = "seasonControlTopic";
//
//    public static void main(String[] args) {
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "172.20.0.21:9092,172.20.0.22:9092,172.18.0.23:9092");
//        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put("value.deserializer", "dualsoft.vf.bookmakerclient.kafka.SeasonControlTopic.SeasonMessageDeserializer");
//        props.put("group.id", "test222");
//        //props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//
//        KafkaConsumer myConsumer = new KafkaConsumer(props);
//        ArrayList<String> topics = new ArrayList<String>();
//        topics.add("seasonControlTopic");
//        myConsumer.subscribe(topics);
//        try {
//            while (true) {
//                ConsumerRecords<String, SeasonMessage> records = myConsumer.poll(Duration.ofSeconds(1));
//                System.out.println("Rekord: " + records.count());
//                for (ConsumerRecord<String, SeasonMessage> record : records) {
//
//                    System.out.println("PORUKA !!! "
//                            + " Topic:" + record.topic()
//                            + " Partition:" + record.partition()
//                            + " Offset:" + record.offset()
//                            + " Key:" + record.key()
//                            + " Value:" + record.value()
//                    );
//                }
//
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            myConsumer.close();
//        }
//
//    }
//
//}
