package objects;

public class Boat extends PhysicalObject{
    public void sail(){
        System.out.println(this.name + " плывет");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        Boat other = (Boat) object;
        return name.equals(other.name);
    }


}
