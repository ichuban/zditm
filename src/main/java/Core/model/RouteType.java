package Core.model;

public enum RouteType {
    TRAM(0),SUBWAY(1),RAIL(2),BUS(3),FERRY(4),CABLE_CAR(5),GONDOLA(6),FUNICULAR(7),UNKNOWN(-1);

    private int type;
    RouteType(int type){
        this.type = type;
    }
    public static RouteType getType(int type){
        for (RouteType routeType : RouteType.values()){
            if (routeType.type == type){
                return routeType;
            }
        }
        return UNKNOWN;
    }
}
