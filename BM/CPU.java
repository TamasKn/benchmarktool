package BM;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class CPU {

    private StringProperty cpuName;
    private IntegerProperty cpuPoint;

    public CPU() {
    }

    public CPU(String cpuName, int cpuPoint) {
        this.cpuName = new SimpleStringProperty(cpuName);
        this.cpuPoint = new SimpleIntegerProperty(cpuPoint);
    }

    public String getCpuName() {
        return cpuName.get();
    }

    public StringProperty cpuNameProperty() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName.set(cpuName);
    }

    public int getCpuPoint() {
        return cpuPoint.get();
    }

    public IntegerProperty cpuPointProperty() {
        return cpuPoint;
    }

    public void setCpuPoint(int cpuPoint) {
        this.cpuPoint.set(cpuPoint);
    }

    public List<CPU> cpuList(){
        List<CPU> cpuList = new ArrayList<>();
        cpuList.add(new CPU("Intel Celeron G3900",873));
        cpuList.add(new CPU("Intel Celeron G3930",1438));
        cpuList.add(new CPU("Intel Celeron G3950",1454));
        cpuList.add(new CPU("Intel Pentium G4400",1770));
        cpuList.add(new CPU("Intel Pentium G4500",2129));
        cpuList.add(new CPU("Intel Pentium G4560",2129));
        cpuList.add(new CPU("Intel Core i3-6100T",2218));
        cpuList.add(new CPU("Intel Pentium G4520",2309));
        cpuList.add(new CPU("Intel Pentium G4600",2309));
        cpuList.add(new CPU("Intel Core i3-6100",2358));
        cpuList.add(new CPU("Intel Core i3-6300",2386));
        cpuList.add(new CPU("Intel Core i3-6320",2414));
        cpuList.add(new CPU("Intel Core i3-7100",2438));
        cpuList.add(new CPU("Intel Pentium G4620",2488));
        cpuList.add(new CPU("Intel Core i3-7300",2492));
        cpuList.add(new CPU("Intel Core i3-7320",2546));
        cpuList.add(new CPU("Intel Core i3-7350K",2600));
        cpuList.add(new CPU("AMD Ryzen 3 1200",2786));
        cpuList.add(new CPU("Intel Core i5-6400",2863));
        cpuList.add(new CPU("AMD Ryzen 3 1300X",3015));
        cpuList.add(new CPU("Intel Core i5-6500",3131));
        cpuList.add(new CPU("Intel Core i5-6600",3204));
        cpuList.add(new CPU("Intel Core i5-7400",3222));
        cpuList.add(new CPU("Intel Core i5-7500",3447));
        cpuList.add(new CPU("Intel Core i5-7600",3503));
        cpuList.add(new CPU("AMD Ryzen 5 1400",3532));
        cpuList.add(new CPU("Intel Core i3-8100",3537));
        cpuList.add(new CPU("Intel Core i5-6600K",3645));
        cpuList.add(new CPU("Intel Core i5-7600K",3672));
        cpuList.add(new CPU("AMD Ryzen 5 1500X",3749));
        cpuList.add(new CPU("Intel Core i3-8350K",3842));
        cpuList.add(new CPU("Intel Core i7-6700",3951));
        cpuList.add(new CPU("Intel Core i5-8400",3999));
        cpuList.add(new CPU("Intel Core i7-7700",4387));
        cpuList.add(new CPU("Intel Core i7-6700K",4674));
        cpuList.add(new CPU("Intel Core i5-8600K",4814));
        cpuList.add(new CPU("Intel Core i7-7700K",4987));
        cpuList.add(new CPU("Intel Core i7-8700",5280));
        cpuList.add(new CPU("AMD Ryzen 5 1600",5306));
        cpuList.add(new CPU("AMD Ryzen 5 1600X",5444));
        cpuList.add(new CPU("AMD Ryzen Threadripper 1920X",5962));
        cpuList.add(new CPU("Intel Core i7-8700K",6086));
        cpuList.add(new CPU("AMD Ryzen Threadripper 1950X",6117));
        cpuList.add(new CPU("AMD Ryzen Threadripper 1900X",6324));
        cpuList.add(new CPU("AMD Ryzen 7 1700",6567));
        cpuList.add(new CPU("AMD Ryzen 7 1700X",7057));
        cpuList.add(new CPU("AMD Ryzen 7 1800X",7333));

        return cpuList;
    }

}
