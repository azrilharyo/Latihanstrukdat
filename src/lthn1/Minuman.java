package lthn1;

import lthn1.Hidangan;

public class Minuman extends Hidangan {
    @Override
    public String disantap() {
        return this.getNamaHidangan() + "diminum";    }
}
