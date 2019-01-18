package BM;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class GPUd {

    private StringProperty gpuDName;
    private IntegerProperty gpuDPoint;

    public GPUd() {
    }

    public GPUd(String gpuDName, int gpuDPoint) {
        this.gpuDName = new SimpleStringProperty(gpuDName);
        this.gpuDPoint = new SimpleIntegerProperty(gpuDPoint);
    }

    public String getGpuDName() {
        return gpuDName.get();
    }

    public StringProperty gpuDNameProperty() {
        return gpuDName;
    }

    public void setGpuDName(String gpuDName) {
        this.gpuDName.set(gpuDName);
    }

    public int getGpuDPoint() {
        return gpuDPoint.get();
    }

    public IntegerProperty gpuDPointProperty() {
        return gpuDPoint;
    }

    public void setGpuDPoint(int gpuDPoint) {
        this.gpuDPoint.set(gpuDPoint);
    }

    public List<GPUd> gpuDualList(){
        List<GPUd> gpuDList = new ArrayList<>();
        gpuDList.add(new GPUd("MSI R7 370 GAMING 2G",3345));
        gpuDList.add(new GPUd("MSI R7 370 GAMING 4G",3446));
        gpuDList.add(new GPUd("MSI GTX 950 GAMING 2G",3717));
        gpuDList.add(new GPUd("DFL R9 280 GR8 3G",4013));
        gpuDList.add(new GPUd("MSI R9 280 GAMING 3G LE",4033));
        gpuDList.add(new GPUd("MSI R9 280 GAMING 3G",4064));
        gpuDList.add(new GPUd("MSI GTX 960 GAMING 2G LE",4197));
        gpuDList.add(new GPUd("MSI GTX 960 GAMING 4G LE",4197));
        gpuDList.add(new GPUd("MSI GTX 960 GAMING LE 100ME",4197));
        gpuDList.add(new GPUd("MSI GTX 960 GAMING 100ME",4386));
        gpuDList.add(new GPUd("MSI GTX 960 GAMING 2G",4386));
        gpuDList.add(new GPUd("MSI GTX 960 GAMING 4G",4386));
        gpuDList.add(new GPUd("MSI R9 380 GAMING 2G",5313));
        gpuDList.add(new GPUd("MSI R9 380 GAMING 4G",5313));
        gpuDList.add(new GPUd("Shean GTX 970",6157));
        gpuDList.add(new GPUd("MSI GTX 970 GAMING 4G",6157));
        gpuDList.add(new GPUd("MSI GTX 970 GAMING LE 100ME",6354));
        gpuDList.add(new GPUd("Shean GTX 970 XL",6484));
        gpuDList.add(new GPUd("MSI GTX 970 GAMING 100ME",6546));
        gpuDList.add(new GPUd("MSI GTX 970 4G Golden Edition",6681));
        gpuDList.add(new GPUd("DFL R9 280 GR8",7140));
        gpuDList.add(new GPUd("MSI RX 470 GAMING 4G",7196));
        gpuDList.add(new GPUd("MSI RX 470 GAMING 8G",7196));
        gpuDList.add(new GPUd("MSI RX 470 GAMING X 4G",7215));
        gpuDList.add(new GPUd("MSI RX 470 GAMING X 8G",7215));
        gpuDList.add(new GPUd("DFL R9 290 GR8TOR",7419));
        gpuDList.add(new GPUd("MSI RX 480 GAMING 4G",7564));
        gpuDList.add(new GPUd("MSI R9 390 GAMING 8G LE",7586));
        gpuDList.add(new GPUd("MSI RX 480 GAMING X 4G",7701));
        gpuDList.add(new GPUd("Shean GTX 980",7712));
        gpuDList.add(new GPUd("MSI RX 480 GAMING 8G",7727));
        gpuDList.add(new GPUd("MSI RX 480 GAMING X 8G",7864));
        gpuDList.add(new GPUd("MSI GTX 980 GAMING 4G LE",7915));
        gpuDList.add(new GPUd("MSI R9 390 GAMING 8G",7984));
        gpuDList.add(new GPUd("Shean GTX 980 XL",8058));
        gpuDList.add(new GPUd("MSI R9 390X GAMING 8G LE",8158));
        gpuDList.add(new GPUd("MSI RX 580 GAMING 4G",8379));
        gpuDList.add(new GPUd("GIGABYTE AORUS RX 580 4G",8434));
        gpuDList.add(new GPUd("MSI R9 390X GAMING 8G",8447));
        gpuDList.add(new GPUd("MSI RX 580 GAMING 8G",8466));
        gpuDList.add(new GPUd("MSI RX 580 GAMING X 4G",8495));
        gpuDList.add(new GPUd("GIGABYTE AORUS RX 580 8G",8522));
        gpuDList.add(new GPUd("MSI RX 580 GAMING X 8G",8582));
        gpuDList.add(new GPUd("MSI RX 580 GAMING+ 8G",8725));
        gpuDList.add(new GPUd("GIGABYTE AORUS RX 580 XTR 8G",8757));
        gpuDList.add(new GPUd("MSI RX 580 GAMING X+ 8G",8774));
        gpuDList.add(new GPUd("MSI GTX 980Ti GAMING 6G LE",9475));
        gpuDList.add(new GPUd("EVGA GTX 1070",10484));
        gpuDList.add(new GPUd("MSI GTX 980Ti GAMING 6G",10617));
        gpuDList.add(new GPUd("MSI GTX 1070 GAMING 8G",10678));
        gpuDList.add(new GPUd("MSI GTX 980Ti 6G Golden Edition",10696));
        gpuDList.add(new GPUd("MSI GTX 1070 GAMING X 8G",11123));
        gpuDList.add(new GPUd("GIGABYTE AORUS GTX 1070 8G",11261));
        gpuDList.add(new GPUd("MSI GTX 1070 GAMING Z 8G",11444));
        gpuDList.add(new GPUd("MSI GTX 1070Ti GAMING 8G",12011));
        gpuDList.add(new GPUd("MSI GTX 1070Ti Titanium 8G",12011));
        gpuDList.add(new GPUd("MSI RX 570 GAMING 4G",12764));
        gpuDList.add(new GPUd("MSI RX 570 GAMING 8G",12764));
        gpuDList.add(new GPUd("MSI GTX 1080",12837));
        gpuDList.add(new GPUd("GIGABYTE AOURUS RX 570 4G",13100));
        gpuDList.add(new GPUd("MSI RX 570 GAMING X 4G",13119));
        gpuDList.add(new GPUd("MSI RX 570 GAMING X 8G",13119));
        gpuDList.add(new GPUd("MSI GTX 1080 8G",13135));
        gpuDList.add(new GPUd("MSI GTX 1080 GAMING+ 8G",13281));
        gpuDList.add(new GPUd("MSI GTX 1080 GAMING X 8G",13744));
        gpuDList.add(new GPUd("MSI GTX 1080 GAMING X+ 8G",13890));
        gpuDList.add(new GPUd("GIGABYTE AORUS GTX 1080 8G",13934));
        gpuDList.add(new GPUd("MSI GTX 1080 GAMING Z 8G",14245));
        gpuDList.add(new GPUd("GIGABYTE AORUS GTX 1080 XTREME 8G",14574));
        gpuDList.add(new GPUd("EVGA GTX 1080Ti",16213));
        gpuDList.add(new GPUd("MSI GTX 1080Ti GAMING 11G",16495));
        gpuDList.add(new GPUd("EVGA GTX 1080Ti Kingpin",17032));
        gpuDList.add(new GPUd("MSI GTX 1080Ti GAMING X 11G",17041));
        gpuDList.add(new GPUd("GIGABYTE AORUS GTX 1080Ti 11G",17127));
        gpuDList.add(new GPUd("GIGABYTE AORUS GTX 1080Ti Xtreme 11G",17777));
        gpuDList.add(new GPUd("GIGABYTE RX VEGA 64 8G",21979));

        return gpuDList;
    }
}
