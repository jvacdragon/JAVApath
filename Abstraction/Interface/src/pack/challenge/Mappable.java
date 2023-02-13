package pack.challenge;


enum Geometry{LINE, POINT, POLYGON}

enum Color {BLACK, BLUE, GREEN, ORANGE, RED}
enum PointMarker{CIRCLE, PUSH_IN, SQUARE, TRIANGLE, STAR}
enum LineMarker{DASHED, DOTTED, SOLID}

public interface Mappable {
    String JSON_PROPERTY = """
            "property": {%s}""";

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON(){
        return """
                "type": %s", "lable": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
