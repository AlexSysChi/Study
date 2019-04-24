package annotation;
// implementation of the deprecated method produce warning.
// to get rid it - use below annotations or deprecate implementation of open().
// look below
@SuppressWarnings("deprecation")
public class HouseImpl implements House {
    // documentation is inherited from the interface
    // deprecation of implementation (should be uncommented):
    // @Deprecated
    public void open() {
        System.out.println("override method");
    }

    public void openFontDoor() {

    }

    public void openBackDoor() {

    }
}
