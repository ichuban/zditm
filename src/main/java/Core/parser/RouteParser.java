package Core.parser;

import Core.model.Route;
import Core.model.RouteType;


public class RouteParser extends BaseFeedParser<Route> {
    private static final int ROUTE_ID_COLUMN= 0;
    private static final int ROUTE_SHORT_NAME_COLUMN = 1;
    private static final int ROUTE_LONG_NAME_COLUMN = 2;
    private static final int ROUTE_DESC_COLUMN = 3;
    private static final int ROUTE_TYPE_COLUMN = 4;
    private static final int ROUTE_URL_COLUMN = 5;
    private static final int ROUTE_COLOR_COLUMN = 6;
    private static final int ROUTE_TEXT_COLOR_COLUMN= 7;

    public Route parseTo(String feedInfo) {
        super.parseTo(feedInfo);
        Route route = new Route();
        route.setRoute_id(splitFeedInfo[ROUTE_ID_COLUMN]);
        route.setRoute_short_name(splitFeedInfo[ROUTE_SHORT_NAME_COLUMN]);
        route.setRoute_long_name(splitFeedInfo[ROUTE_LONG_NAME_COLUMN]);
        route.setRoute_desc(splitFeedInfo[ROUTE_DESC_COLUMN]);
        route.setRoute_type(RouteType.getType(Integer.parseInt(splitFeedInfo[ROUTE_TYPE_COLUMN])));
        route.setRoute_url(splitFeedInfo[ROUTE_URL_COLUMN]);
        route.setRoute_color(splitFeedInfo[ROUTE_COLOR_COLUMN]);
        route.setRoute_text_color(splitFeedInfo[ROUTE_TEXT_COLOR_COLUMN]);

return route;
    }
}
