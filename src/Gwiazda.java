public class Gwiazda {
    private String name;
    private double diameter;

    public Gwiazda(String name, double diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gwiazda gwiazda = (Gwiazda) o;

        if (Double.compare(gwiazda.diameter, diameter) != 0) return false;
        return name != null ? name.equals(gwiazda.name) : gwiazda.name == null;
    }

    @Override
    public String toString() {
        return "Gwiazda{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
