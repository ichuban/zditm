package Core.parser;

import Core.model.FeedModel;
public interface FeedParser <T extends FeedModel> {   // T jets parametrem generycznym, dowolny obiekt spełniający warunek
    String DATA_DELIMITER = ",";  // ustalamy, że przecienek jest naszym dzielnikiem lini
    T parseTo(String feedInfo);
    String parseFrom(T feed);
}