package cn.linc.development.builderModel.demo2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        BWMBuilder bwmBuilder = new BWMBuilder();
        List<String> sequences = new ArrayList<String>();
        sequences.add("start");
        sequences.add("stop");
        sequences.add("engine");
        sequences.add("alarm");
        bwmBuilder.setSequeces(sequences);;
        BMW bmw = (BMW) bwmBuilder.getCarModel();
        bmw.run();
    }

}
