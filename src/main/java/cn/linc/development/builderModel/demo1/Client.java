package cn.linc.development.builderModel.demo1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        List<String> sequences = new ArrayList<String>();
        sequences.add("start");
        sequences.add("stop");
        sequences.add("engine");
        sequences.add("alarm");
        bmw.setSequences(sequences);
        bmw.run();
    }

}
