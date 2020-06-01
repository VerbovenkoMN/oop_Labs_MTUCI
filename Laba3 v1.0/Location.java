import java.util.Objects;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{

    public int xVal;
    public int yVal;



    public Location(int x, int y)
    {
        xVal = x;
        yVal = y;
    }

    public Location()
    {
        this(0, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return xVal == location.xVal &&
                yVal == location.yVal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xVal, yVal);
    }
}
