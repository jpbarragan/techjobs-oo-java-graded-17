package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    // ELIMINATED AFTER DRYING CODE

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    // ELIMINATED AFTER DRYING CODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }


}
