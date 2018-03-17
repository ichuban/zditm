package Core.parser;

import Core.model.FeedModel;


public abstract class BaseFeedParser<T extends FeedModel> implements FeedParser<T> {
    protected String[] splitFeedInfo;
    public BaseFeedParser() {super();}

    public T parseTo(String line) {
        line = line.replaceAll("\"","");                    // pominie nam wszystkie cudzysłowia z pliku tekstowego
        splitFeedInfo = line.split(FeedParser.DATA_DELIMITER, -1);
        return null;
    }

    public String parseFrom(FeedModel feed) {
        return null;
    }
}