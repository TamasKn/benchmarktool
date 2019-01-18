package BM;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class GPUs {

    private StringProperty gpuName;
    private IntegerProperty gpuPoint;


    public GPUs() {
    }

    public GPUs(String gpuN, int gpuP) {
        gpuName = new SimpleStringProperty(gpuN);
        gpuPoint = new SimpleIntegerProperty(gpuP);
    }

    public String getGpuName() {
        return gpuName.get();
    }

    public StringProperty gpuNameProperty() {
        return gpuName;
    }

    public void setGpuName(String gpuName) {
        this.gpuName.set(gpuName);
    }

    public int getGpuPoint() {
        return gpuPoint.get();
    }

    public IntegerProperty gpuPointProperty() {
        return gpuPoint;
    }

    public void setGpuPoint(int gpuPoint) {
        this.gpuPoint.set(gpuPoint);
    }

    public List<GPUs> gpuSingleList(){
        List<GPUs> gpuList = new ArrayList<>();
        gpuList.add(new GPUs("EVGA GT 1030 SC",1000));
        gpuList.add(new GPUs("GIGABYTE GT 1030 OC 2G",1000));
        gpuList.add(new GPUs("Shean 750Ti GAMER",1163));
        gpuList.add(new GPUs("MSI R7 370 GAMING 2G",1516));
        gpuList.add(new GPUs("GIGABYTE GTX 1050 Windforce OC 2G",1556));
        gpuList.add(new GPUs("MSI R7 370 GAMING 4G",1516));

        gpuList.add(new GPUs("MSI GTX 950 GAMING 2G",1846));
        gpuList.add(new GPUs("EVGA GTX 1050Ti GAMING",1966));
        gpuList.add(new GPUs("MSI GTX 1050Ti GAMING 4G",1992));
        gpuList.add(new GPUs("DFL R9 280 GR8 3G",2019));
        gpuList.add(new GPUs("GIGABYTE GTX 1050Ti Windforce OC 4G",2046));
        gpuList.add(new GPUs("MSI GTX 1050 GAMING 2G",2046));
        gpuList.add(new GPUs("MSI GTX 1050Ti GAMING X 4G",2046));
        gpuList.add(new GPUs("MSI R9 280 GAMING 3G LE",2057));
        gpuList.add(new GPUs("MSI R9 280 GAMING 3G",2117));
        gpuList.add(new GPUs("MSI GTX 960 GAMING 2G LE",2123));
        gpuList.add(new GPUs("MSI GTX 960 GAMING 4G LE",2123));
        gpuList.add(new GPUs("MSI GTX 960 GAMING LE 100ME",2123));
        gpuList.add(new GPUs("MSI GTX 1050 GAMING X 2G",2133));
        gpuList.add(new GPUs("MSI GTX 960 GAMING 100ME",2225));
        gpuList.add(new GPUs("MSI GTX 960 GAMING 2G",2225));
        gpuList.add(new GPUs("MSI GTX 960 GAMING 4G",2225));
        gpuList.add(new GPUs("MSI R9 380 GAMING 2G",2685));
        gpuList.add(new GPUs("MSI R9 380 GAMING 4G",2685));
        gpuList.add(new GPUs("Shean GTX 970 GAMER",3193));
        gpuList.add(new GPUs("MSI GTX 970 GAMING 4G",3193));
        gpuList.add(new GPUs("MSI GTX 970 GAMING LE 100ME",3286));
        gpuList.add(new GPUs("Shean GTX 970 GAMER XL",3348));
        gpuList.add(new GPUs("MSI GTX 970 GAMING 100ME",3377));
        gpuList.add(new GPUs("MSI GTX 970 GAMING 4G Golden Edition",3441));
        gpuList.add(new GPUs("EVGA GTX 1060 GAMING 3G",3531));
        gpuList.add(new GPUs("MSI RX 470 GAMING 4G",3539));
        gpuList.add(new GPUs("MSI RX 470 GAMING 8G",3539));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING 3G",3570));
        gpuList.add(new GPUs("DFL R9 280 GR8",3572));
        gpuList.add(new GPUs("MSI RX 470 GAMING X 4G",3589));
        gpuList.add(new GPUs("MSI RX 470 GAMING X 8G",3589));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING VR 3G",3590));
        gpuList.add(new GPUs("MSI RX 570 GAMING 4G",3644));
        gpuList.add(new GPUs("MSI RX 570 GAMING 8G",3644));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING X 3G",3650));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING VR X 3G",3701));
        gpuList.add(new GPUs("MSI RX 570 GAMING X 4G",3708));
        gpuList.add(new GPUs("MSI RX 570 GAMING X 8G",3708));
        gpuList.add(new GPUs("GIGABYTE AOURUS RX 570 4G",3713));
        gpuList.add(new GPUs("DFL R9 290 GR8TOR",3717));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING 6G",3767));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING VR 6G",3793));
        gpuList.add(new GPUs("MSI R9 390 GAMING 8G LE",3885));
        gpuList.add(new GPUs("MSI RX 480 GAMING 4G",3911));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING+ 6G",3912));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING X 6G",3931));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING VR X 6G",3931));
        gpuList.add(new GPUs("Shean GTX 980 GAMER",3938));
        gpuList.add(new GPUs("MSI RX 480 GAMING X 4G",3976));
        gpuList.add(new GPUs("EVGA GTX 1060 FTW2 GAMING",4021));
        gpuList.add(new GPUs("GIGABYTE AOURUS GTX 1060 6G",4021));
        gpuList.add(new GPUs("MSI RX 480 GAMING 8G",4024));
        gpuList.add(new GPUs("MSI R9 390 GAMING 8G",4041));
        gpuList.add(new GPUs("MSI GTX 1060 GAMING X+ 6G",4049));
        gpuList.add(new GPUs("MSI GTX 980 GAMING 4G LE",4051));
        gpuList.add(new GPUs("GIGABYTE AOURUS GTX 1060 Xtreme 6G",4083));
        gpuList.add(new GPUs("MSI RX 480 GAMING X 8G",4089));
        gpuList.add(new GPUs("Shean GTX 980 GAMER XL",4130));
        gpuList.add(new GPUs("MSI R9 390X GAMING 8G LE",4212));
        gpuList.add(new GPUs("MSI RX 580 GAMING 4G",4242));
        gpuList.add(new GPUs("GIGABYTE AOURUS RX 580 4G",4271));
        gpuList.add(new GPUs("MSI RX 580 GAMING 8G",4302));
        gpuList.add(new GPUs("MSI RX 580 GAMING X 4G",4304));
        gpuList.add(new GPUs("GIGABYTE AOURUS RX 580 8G",4331));
        gpuList.add(new GPUs("MSI R9 390X GAMING 8G",4334));
        gpuList.add(new GPUs("MSI RX 580 GAMING X 8G",4365));
        gpuList.add(new GPUs("MSI RX 580 GAMING+ 8G",4438));
        gpuList.add(new GPUs("GIGABYTE AOURUS RX 580 XTR 8G",4455));
        gpuList.add(new GPUs("MSI RX 580 GAMING X+ 8G",4465));
        gpuList.add(new GPUs("MSI GTX 980Ti GAMING 6G LE",4764));
        gpuList.add(new GPUs("EVGA GTX 1070 GAMING",5366));
        gpuList.add(new GPUs("MSI GTX 980Ti GAMING 6G",5408));
        gpuList.add(new GPUs("MSI GTX 980Ti GAMING 6G Golden Edition",5454));
        gpuList.add(new GPUs("MSI GTX 1070 GAMING 8G",5462));
        gpuList.add(new GPUs("MSI GTX 1070 GAMING X 8G",5676));
        gpuList.add(new GPUs("GIGABYTE AOURUS GTX 1070 8G",5749));
        gpuList.add(new GPUs("MSI GTX 1070 GAMING Z 8G",5834));
        gpuList.add(new GPUs("MSI GTX 1070Ti GAMING 8G",6380));
        gpuList.add(new GPUs("MSI GTX 1070Ti Titanium 8G",6380));
        gpuList.add(new GPUs("EVGA GTX 1080 GAMING",6869));
        gpuList.add(new GPUs("GIGABYTE RX VEGA 64 8G",6933));
        gpuList.add(new GPUs("MSI GTX 1080 GAMING 8G",6998));
        gpuList.add(new GPUs("MSI GTX 1080 GAMING X 8G",7224));
        gpuList.add(new GPUs("MSI GTX 1080 GAMING+ 8G",7239));
        gpuList.add(new GPUs("GIGABYTE AOURUS GTX 1080 8G",7270));
        gpuList.add(new GPUs("MSI GTX 1080 GAMING Z 8G",7395));
        gpuList.add(new GPUs("MSI GTX 1080 GAMING X+ 8G",7466));
        gpuList.add(new GPUs("GIGABYTE AOURUS GTX 1080 Xtreme 8G",7680));
        gpuList.add(new GPUs("EVGA GTX 1080Ti GAMING",8266));
        gpuList.add(new GPUs("MSI GTX 1080Ti GAMING 11G",8431));
        gpuList.add(new GPUs("MSI GTX 1080Ti GAMING X 11G",8733));
        gpuList.add(new GPUs("EVGA GTX 1080Ti Kingpin GAMING",8747));
        gpuList.add(new GPUs("GIGABYTE AOURUS GTX 1080Ti 11G",8803));
        gpuList.add(new GPUs("GIGABYTE AOURUS GTX 1080Ti Xtreme 11G",9110));

        return gpuList;
    }
}
