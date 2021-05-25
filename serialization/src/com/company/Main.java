package com.company;

import com.company.constant.Genre;
import com.company.models.Singer;
import com.company.models.Producer;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Collection Example");
        System.out.println("------------------------");

        Singer singer = new Singer("Teoman", Genre.Rock,false);
        Producer producer = new Producer("İskender Paydaş",Genre.Rock);

        final String singerFileName = "C:\\Development\\java-advance\\serialization\\src\\com\\company\\test\\singer.ser";
        final String producerFileName = "C:\\Development\\java-advance\\serialization\\src\\com\\company\\test\\producer.ser";

        Util.serializeObject(singer,singerFileName);
        singer = (Singer) Util.deSerializeObject(singerFileName);
        singer.print();

        Util.serializeObject(producer,producerFileName);
        producer = (Producer) Util.deSerializeObject(producerFileName);
        producer.print();
    }
}
