package cn.linc.development.builderModel.demo2;

import java.util.List;

public class BWMBuilder extends CarBuilder{

    BMW bmw = new BMW();

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }

    @Override
    public void setSequeces(List<String> sequences) {
        bmw.setSequences(sequences);
    }
}
