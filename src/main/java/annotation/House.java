package annotation;

public interface House {
    /**
     * @deprecated use of open
     * is discouraged, use
     * openFrontDoor or
     * openBackDoor instead.
     */
    //@Deprecated // we should describe why method is deprecated. look above comment
    void open();
    void openFontDoor();
    void openBackDoor();
}
