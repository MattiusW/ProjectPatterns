public class BuliderBuilder {
    private String adress;
    private Integer floorsNumber;
    private Integer doorsNumber;
    private Integer windowsNumber;

    public BuliderBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public BuliderBuilder setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
        return this;
    }

    public BuliderBuilder setDoorsNumber(Integer doorsNumber) {
        this.doorsNumber = doorsNumber;
        return this;
    }

    public BuliderBuilder setWindowsNumber(Integer windowsNumber) {
        this.windowsNumber = windowsNumber;
        return this;
    }

    public Bulider createBulider() {
        return new Bulider(adress, floorsNumber, doorsNumber, windowsNumber);
    }
}