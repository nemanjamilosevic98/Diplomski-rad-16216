///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package dualsoft.vf.bookmakerclient.kafka.SeasonControlTopic;
//
//import java.util.Properties;
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
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
//public class SeasonProducerMessagingService {
//
//    @Value("${spring.kafka.bootstrap-servers}")
//    private String bootstrapServers;
//
//    @Value("${spring.kafka.producer.key-serializer}")
//    private String keySerializer;
//
//    @Value("${spring.kafka.producer.value-serializer-season-message}")
//    private String valueSerializer;
//
//    private String mytopic = "seasonControlTopic";
//
//    private KafkaProducer producer = null;
//
//    public SeasonProducerMessagingService() {
//
//    }
//
//    @PostConstruct
//    void onCreate() {
//        Properties props = new Properties();
//        props.put("bootstrap.servers", bootstrapServers);
//        props.put("key.serializer", keySerializer);
//        props.put("value.serializer", valueSerializer);
//
//        producer = new KafkaProducer(props);
//
//    }
//
//    public void sendCreateSeasonMsg(int seasonId, int leagueId) {
//        SeasonMessage seasonMsg = new SeasonMessage(seasonId, leagueId, SeasonActionEnum.CREATE_SEASON);
//        ProducerRecord message = new ProducerRecord(mytopic, seasonId + "", seasonMsg);
//        producer.send(message);
//    }
//
//    public void sendPauseSeasonMsg(int seasonId) {
//        SeasonMessage seasonMsg = new SeasonMessage(seasonId, SeasonActionEnum.PASUE_SEASON);
//        ProducerRecord message = new ProducerRecord(mytopic, seasonId + "", seasonMsg);
//        producer.send(message);
//    }
//
//    public void sendResumeSeasonMsg(int seasonId) {
//        SeasonMessage seasonMsg = new SeasonMessage(seasonId, SeasonActionEnum.RESUME_SEASON);
//        ProducerRecord message = new ProducerRecord(mytopic, seasonId + "", seasonMsg);
//        producer.send(message);
//    }
//
//    public void sendPauseAllSeasonsMsg() {
//        SeasonMessage seasonMsg = new SeasonMessage(-1, SeasonActionEnum.PAUSE_ALL_SEASONS);
//        ProducerRecord message = new ProducerRecord(mytopic, -1 + "", seasonMsg);
//        producer.send(message);
//    }
//
//    @PreDestroy
//    void onDestroy() {
//        producer.flush();
//        producer.close();
//    }
//
//}
