///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package dualsoft.vf.bookmakerclient.kafka.SeasonControlTopic;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.util.Map;
//import org.apache.kafka.common.serialization.Deserializer;
//
///**
// *
// * @author dusan
// */
//public class SeasonMessageDeserializer implements Deserializer {
//
//    @Override
//    public void configure(Map configs, boolean isKey) {
//    }
//
//    @Override
//    public Object deserialize(String string, byte[] bytes) {
//        ObjectMapper mapper = new ObjectMapper();
//
//        SeasonMessage seasonMessage = null;
//        try {
//            seasonMessage = mapper.readValue(bytes, SeasonMessage.class);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return seasonMessage;
//    }
//
//    @Override
//    public void close() {
//    }
//}
