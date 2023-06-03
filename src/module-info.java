module easywordmodel {
    requires org.junit.jupiter.api;
    exports br.com.rodrigofreund.easyword.model.event to easyword, easywordrepository;
    exports br.com.rodrigofreund.easyword.model.exception to easyword, easywordrepository;
}