package dualsoft.vf.bookmakerclient;

//import dualsoft.vf.bookmakerclient.kafka.GameEvent.EventsEnum;
//import dualsoft.vf.bookmakerclient.kafka.GameEvent.GameEventsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookmakerclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmakerclientApplication.class, args);

        /* CONSUMER

                Properties props = new Properties();
        props.put("bootstrap.servers", "172.20.0.21:9092,172.20.0.22:9092,172.18.0.23:9092");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("group.id", "test222");
        //props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        KafkaConsumer myConsumer = new KafkaConsumer(props);
        // PRIMER 1

        //KafkaConsumer myConsumer1 = new KafkaConsumer(props);
        //KafkaConsumer myConsumer2 = new KafkaConsumer(props);
//        //myConsumer.subscribe(Arrays.asList("mytopic"));    //Jos jedan ovakav poziv na drugi topic bi override-ovao ovaj! Zato koristimo nacin napisan dole
//        ArrayList<String> topics = new ArrayList<String>();
//        topics.add("myTopic");
//        topics.add("my_topic");
//        myConsumer1.subscribe(topics); //Prima poruke sa svih particija svih topica na koje je subscribe-ovan
//        myConsumer1.unsubscribe();
//        // pretplata samo na jednu particiju jednog topica
//        TopicPartition partition0 = new TopicPartition("mytopic", 0);
//        ArrayList<TopicPartition> partitions = new ArrayList<>();
//        partitions.add(partition0);
//        myConsumer2.assign(partitions); // NIJE INKREMENTALNO, ne moze 2 uzastopna da bi se pretplatio na vise particija
        //PRIMER 2
        //Testiranje pool loop-a
        ArrayList<String> topics = new ArrayList<String>();
        topics.add("newTopic");
        myConsumer.subscribe(topics);
        // PRIMER 3
//        ArrayList<TopicPartition> partitions = new ArrayList<TopicPartition>();
//        TopicPartition myTopicPartition0 = new TopicPartition("newTopic", 0);
//        partitions.add(myTopicPartition0);
//        myConsumer.assign(partitions);
        // sve isto kao i u primeru 2
        try {
            while (true) {
                System.out.println("usoo1");
                ConsumerRecords<String, String> records = myConsumer.poll(Duration.ofSeconds(1));
                System.out.println("usoo2");
                System.out.println("Rekord: " + records.count());
                for (ConsumerRecord<String, String> record : records) {

                    System.out.println("PORUKA !!! "
                            + " Topic:" + record.topic()
                            + " Partition:" + record.partition()
                            + " Offset:" + record.offset()
                            + " Key:" + record.key()
                            + " Value:" + record.value()
                    );
                }
                //myConsumer.commitSync(); //Posle obrade da se commituju procitane poruke i da se pomeri offset. Ne bi trebalo posle svakog obradjenog Recorda, jer je funckija sihrona, sto znaci da ce da blokira thread zarad male sigurnosti!
//                myConsumer.commitAsync(new OffsetCommitCallback() {
//                    @Override
//                    public void onComplete(Map<TopicPartition, OffsetAndMetadata> arg0, Exception arg1) {
//                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                    }
//                });                    Ne blokira thread, i podesava callback funckiju

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            myConsumer.close();
        }







         */

 /*PRODUCER
                Properties props = new Properties();
        props.put("bootstrap.servers", "172.20.0.21:9092,172.20.0.22:9092,172.18.0.23:9092");
        //props.put("acks", "all"); // postavlja kriterijum kada su poruke spremne za slanje."all" znaci blokiranje na full commit
        //props.put("retries", 0); // 0 = nema ponovnog pokusaja slanja
        //props.put("batch.size", 16384);//Za svaku particiju imamo buffer za neposlate poruke.
        //props.put("linger.ms", 1);// namestimo da ne bi mogao da salje nonstop poruke, vec da ima neka mala pauza
        //props.put("buffer.memory", 33554432);// Sav prostor kojim ce producer moci da raspolaze, ako se popuni onda se blokria dok se ne isprazni
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        //Idempotent producer = pokusava da posalje poruku sve dok ne stigne, i to bez duplikata !
        //uvek ide dobro uz "Acks" "all" !!!
        //props.put("enable.idempotence", true); // To funckionise tako sto svaki producer daje svoj PID i koja je poruka po redu, ako na server stigne recimo (pid=1, seq =4) a  on je vec zapisao ( pid=1,seq=6) on ce odbaciti to jer je duplikat
        //props.put("message.send.max.retries", 100000); //ovo je samo za idempotence mode ( nije mnogo 1000000 jer ih cesto salje)
        //props.put("transactional.id", "my-transactional-id"); // Omogucilo bi nam da koristimo transakcije !!
        KafkaProducer myProducer = new KafkaProducer(props);
        for (int i = 0; i < 10; i++) {
            ProducerRecord myMessage1 = new ProducerRecord("newTopic", "fdfdsfdsf" + i);
            myProducer.send(myMessage1);
        }
//        ProducerRecord myMessage2 = new ProducerRecord("newTopic", 1, "myKey", "particija 1 poruka 1");//ProducerRecord myMessage2 = new ProducerRecord("mytopic", 1, new Long(22131312), "Key1", "Value1");
//        ProducerRecord myMessage3 = new ProducerRecord("newTopic", 2, "myKey2", "particija 2 poruka 2");
        //message2 kaze u koju particiju da upise [1] , timestamp, KLJUC i VALUE. (Preporucuje se da se uvek stavi kljuc!)

//        myProducer.send(myMessage2);
//        myProducer.send(myMessage3);
        myProducer.close();




         */
    }

}
