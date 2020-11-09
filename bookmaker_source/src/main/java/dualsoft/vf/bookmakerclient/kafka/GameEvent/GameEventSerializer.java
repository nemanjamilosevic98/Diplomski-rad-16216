///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package dualsoft.vf.bookmakerclient.kafka.GameEvent;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.util.Map;
//import org.apache.kafka.common.serialization.Serializer;
//
///**
// *
// * @author ilija
// */
//public class GameEventSerializer implements Serializer {
//
//    @Override
//    public void configure(Map configs, boolean isKey) {
//        Serializer.super.configure(configs, isKey); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public byte[] serialize(String string, Object t) {
//        byte[] retVal = null;
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            retVal = objectMapper.writeValueAsString(t).getBytes();
//            System.out.println(retVal);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return retVal;
//
//    }
//
//}
