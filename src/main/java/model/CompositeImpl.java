package model;

public class CompositeImpl extends Component implements Composite {
    private String compositeType;

    public CompositeImpl(String compositeType) {
        this.compositeType = compositeType;
    }
}
