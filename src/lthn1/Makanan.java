package lthn1;

import lthn1.Hidangan;

public class Makanan extends Hidangan {
        @Override
        public String disantap() {
            return this.getNamaHidangan() + "dimakan";    }
    }
