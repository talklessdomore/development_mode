package cn.linc.development.builderModel.demo2;

import java.util.List;

public class BenziBuilder extends CarBuilder{

    Bezi bezi = new Bezi();

    @Override
    public CarModel getCarModel() {
        return this.bezi;
    }

    @Override
    public void setSequeces(List<String> sequences) {
        bezi.setSequences(sequences);
    }
}
