///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package dualsoft.vf.bookmakerclient.kafka.GameEvent;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.util.Map;
//import org.apache.kafka.common.serialization.Deserializer;
//
///**
// *
// * @author ilija
// */
//public class GameEventDeserializer implements Deserializer {
//
//    @Override
//    public void configure(Map configs, boolean isKey) {
//    }
//
//    @Override
//    public Object deserialize(String string, byte[] bytes) {
//        ObjectMapper mapper = new ObjectMapper();
//        System.out.println(bytes);
//        GameEvent gameEvent = null;
//        try {
//            gameEvent = mapper.readValue(bytes, GameEvent.class);
//            System.out.println("Primeljena poruka" + gameEvent);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return gameEvent;
//    }
//
//    @Override
//    public void close() {
//    }
//
//}
