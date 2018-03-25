public class Planeta {

    private String name;
    private double diameter;
    private boolean czyZamieszkala;

    public Planeta(String name, double diameter, boolean czyZamieszkala) {
        this.name = name;
        this.diameter = diameter;
        this.czyZamieszkala = czyZamieszkala;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planeta planeta = (Planeta) o;

        if (Double.compare(planeta.diameter, diameter) != 0) return false;
        if (czyZamieszkala != planeta.czyZamieszkala) return false;
        return name != null ? name.equals(planeta.name) : planeta.name == null;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                ", czyZamieszkala=" + czyZamieszkala +
                '}';
    }
}
